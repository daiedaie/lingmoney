package com.mrbt.lingmoney.mobile.controller.bank;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mrbt.lingmoney.commons.cache.RedisDao;
import com.mrbt.lingmoney.mobile.controller.BaseController;
import com.mrbt.lingmoney.service.bank.CashWithdrawResultService;
import com.mrbt.lingmoney.service.bank.CashWithdrawService;
import com.mrbt.lingmoney.utils.AES256Encryption;
import com.mrbt.lingmoney.utils.AppCons;
import com.mrbt.lingmoney.utils.PageInfo;
import com.mrbt.lingmoney.utils.ResultParame;
import com.mrbt.lingmoney.utils.ResultParame.ResultInfo;

import net.sf.json.JSONObject;

/**
 * 单笔提现
 *
 * @author lihq
 * @date 2017年6月3日 上午8:22:41
 * @description
 * @version 1.0
 * @since 2017-04-12
 */
@Controller
@RequestMapping("/bank")
public class AccountWithdrawController extends BaseController {
	private static final Logger  LOGGER = LogManager.getLogger(AccountWithdrawController.class);
	@Autowired
	private CashWithdrawService cashWithdrawService;
	@Autowired
	private CashWithdrawResultService cashWithdrawResultService;
	@Autowired
	private RedisDao redisDao;
	/**
	 * @param request req
	 * @param response res
	 * @param token token 
	 * @param amount amount
	 * @param model model
	 * @return string
	 */
	@RequestMapping(value = "/cashWithdrawPage", method = RequestMethod.POST)
	public String cashWithdrawPage(HttpServletRequest request, HttpServletResponse response, String token, String amount, Model model) {
		JSONObject paramsJson = new JSONObject();
		paramsJson.put("token", token);
		paramsJson.put("amount", amount);
		model.addAttribute("params", AES256Encryption.aes256Encrypt(paramsJson.toString()));
		model.addAttribute("reqUrl", "/bank/cashWithdraw");
		return "hxBank/hxBankAction";
	}

	/**
	 * 用户发起提现请求
	 * @param response res
	 * @param token
	 *            用户token
	 * @param amount
	 *            提现金额
	 * @param model model
	 * @return json
	 */
	@RequestMapping("/cashWithdraw")
	public @ResponseBody Object cashWithdraw(HttpServletResponse response, Model model, String token,
			String amount) {
		LOGGER.info("单笔提现");
		response.setContentType("text/html;charset=UTF-8"); 
		JSONObject json = new JSONObject();
		PageInfo pageInfo = new PageInfo();
		String uId = null;
		try {
			uId = getUid(AppCons.TOKEN_VERIFY + token);
			pageInfo = cashWithdrawService.requestCashWithdraw(1, "APP", amount, uId);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("单笔提现失败，失败原因是：" + e.getMessage());
			pageInfo.setCode(ResultInfo.SERVER_ERROR.getCode());
			pageInfo.setMsg(ResultInfo.SERVER_ERROR.getMsg());
		} finally {
			redisDao.delete("accountWithdraw_" + uId);
		}
		if (pageInfo.getCode() == ResultInfo.SUCCESS.getCode()) {
			json.put("code", ResultParame.ResultInfo.SUCCESS.getCode());
			json.put("obj", pageInfo.getObj());
		} else {
			json.put("code", pageInfo.getCode());
			json.put("msg", pageInfo.getMsg());
		}
		return json;
	}

	/**
	 * 单笔提现返回商户url
	 * @param request req
	 * @param response res
	 * @param note note
	 * @param uId uId
	 */
	@RequestMapping(value = "/cashWithdrawCallBack/{note}/{uId}", method = RequestMethod.POST)
	public  void cashWithdrawCallBack(HttpServletRequest request, HttpServletResponse response,
			@PathVariable String note, @PathVariable String uId) {
		LOGGER.info("单笔提现返回商户url");
		try {
			LOGGER.info("单笔提现银行返回商户" + note);
			PageInfo pageInfo = cashWithdrawResultService.queryAccountWithdraw("APP", note, uId);
			response.setContentLength(pageInfo.toString().getBytes().length);
			response.setContentType("application/xml; charset=UTF-8");
			response.getWriter().write(pageInfo.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 用户发起提现结果查询请求
	 * @param request req
	 * @param response res
	 * @param token token
	 * @param oldReqseqno oldReqseqno
	 * @return pageInfo
	 */
	@RequestMapping("/cashWithdrawResult")
	public @ResponseBody Object cashWithdrawResult(HttpServletRequest request, HttpServletResponse response,
			@PathVariable String token, String oldReqseqno) {
		LOGGER.info("用户发起提现结果查询请求");
		response.setContentType("application/xml; charset= utf-8");
		PageInfo pageInfo = new PageInfo();
		String uId = null;
		try {
			uId = getUid(AppCons.TOKEN_VERIFY + token);
			pageInfo = cashWithdrawResultService.queryAccountWithdraw("APP", oldReqseqno, uId);
		} catch (Exception e) {
			pageInfo.setCode(ResultInfo.SERVER_ERROR.getCode());
			pageInfo.setMsg(ResultInfo.SERVER_ERROR.getMsg());
		}
		return pageInfo;
	}

}
