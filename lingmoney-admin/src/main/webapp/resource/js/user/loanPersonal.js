var toolbar = [ {
	text : '同意',
	iconCls : 'icon-ok',
	handler : function() {
		publish();
	}
}, '-', {
	text : '不同意',
	iconCls : 'icon-ok',
	handler : function() {
		noPublish();
	}
}, '-', {
	text : '删除',
	iconCls : 'icon-remove',
	handler : function() {
		del();
	}
}];

function formatTimer(value,row){
	if(value){
		return new Date(value).format("yyyy-MM-dd hh:mm:ss");
	}
	return "";
}

function formatStatus(value){
    if(value==0){
        return '正在申请';
      }else if(value==1){
        return '<font color="green">申请成功</font>';
      }else{
    	return '<font color="red">申请失败</font>';
      }
}
function formatHouse(value){
    if(value==0){
        return '无';
      }else if(value==1){
        return '<font color="green">有</font>';
      }else{
    	return '<font color="red">未知</font>';
      }
}
function formatCar(value){
    if(value==0){
        return '无';
      }else if(value==1){
        return '<font color="green">有</font>';
      }else{
    	return '<font color="red">未知</font>';
      }
}
function formatCredit(value){
    if(value==0){
        return '已使用过';
      }else if(value==1){
        return '<font color="green">未使用过</font>';
      }else{
    	return '<font color="red">未知</font>';
      }
}
// 删除
function del(){
	var rows = $("#adGrid").datagrid("getSelections");
	if (rows.length == 0) {
	    $.messager.alert("提示", "请选择一条记录", "error");
	    return
	}
	showLoading();
	$.messager.confirm('确认','您确认想要删除记录吗？',function(r){    
	    if (r){  
	$.getJSON("/rest/user/loanpersonal/delete?r=" + Math.random() + "&id=" + rows[0].id,
	    function(info) {
	       if(info.code==200){
	    	   $.messager.alert('提示', '删除成功', 'info');
	    	   $("#adGrid").datagrid('reload');
	       }else{
	    	   $.messager.alert('错误提示', info.msg, 'error');
	       }
	       });    
	    }else{
	    	return
	    }   
	});
	closeLoading();
}

function publish(){
	var rows = $("#adGrid").datagrid("getSelections");
	if (rows.length == 0) {
	    $.messager.alert("提示", "请选择一条记录", "error");
	    return
	}
	if(rows[0].statusPer==1){
		$.messager.alert("提示", "已同意申请", "error");
	    return
	}
	showLoading();
	$.getJSON("/rest/user/loanpersonal/publish?r=" + Math.random() + "&id=" + rows[0].id,
	    function(info) {
	       if(info.code==200){
	    	   $.messager.alert('提示', '申请成功', 'info');
	    	   $("#adGrid").datagrid('reload');
	       }else{
	    	   $.messager.alert('错误提示', info.msg, 'error');
	       }
	});
	closeLoading();
}



function noPublish(){
	var rows = $("#adGrid").datagrid("getSelections");
	if (rows.length == 0) {
	    $.messager.alert("提示", "请选择一条记录", "error");
	    return
	}
	if(rows[0].statusPer==2){
		$.messager.alert("提示", "已拒绝申请", "error");
	    return
	}
	showLoading();
	$.getJSON("/rest/user/loanpersonal/nopublish?r=" + Math.random() + "&id=" + rows[0].id,
	    function(info) {
	       if(info.code==200){
	    	   $.messager.alert('提示', '申请失败', 'info');
	    	   $("#adGrid").datagrid('reload');
	       }else{
	    	   $.messager.alert('错误提示', info.msg, 'error');
	       }
	});
	closeLoading();
}

// 查询
function search(){
	$('#adGrid').datagrid('load',{
		page:1,
		namePer:$("#namePers").val()
	});
}




