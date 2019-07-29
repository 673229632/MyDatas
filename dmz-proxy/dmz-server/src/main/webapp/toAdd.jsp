<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>

<body>

<div class="main">
	<div class="optitle clearfix">
		<div class="title">
			<c:choose>  
  
		   <c:when test="${host !=null&&host!=''}">修改
		   </c:when>  
		     
		   <c:otherwise>  新增
		   </c:otherwise>  
		</c:choose> 
			
		</div>
	</div>
	<%-- /dmz-server/AddServlet?flag ='<c:if test='${host !=null&&host!=''}'>update </c:if>' --%>
	<form method="post" name ="myform" action="/dmz-server/AddServlet" onsubmit="return checkForm()">
		<input type="hidden" name="flag" id="flag" value="${host}" />
		<div class="content">
			<table class="box">
				<tr>
					<td class="field">host：</td>
					<td><input type="text" name="host" id="host" class="text" value="${host}" /></td>
				</tr>
				
				<tr>
					<td class="field">port：</td>
					<td><input type="text" name="port" id="port" class="text" value="${port}"/></td>
				</tr>
				
			</table>
		</div>
		<div class="buttons">
			<input type="submit" name="submit" id ="do" value="确认" class="input-button" />
			<input type="button" name="button" value="返回" class="input-button" onclick="history.back();" />
		</div>
	</form>
</div>
<%
     Object message = request.getAttribute("message");
     if(message!=null){
 
  %>     
   <script type="text/javascript">
		   function checkForm(){
		 	  alert(123);
		   } 
          alert("<%=message%>");
          window.location.href = "/dmz-server/GetFileServlet";
      </script>
  <%} %>
</body>


<script type="text/javascript">
   function checkForm(){
 	  var reg =/^\s*$/g;
 	  var reg2= /^[\x00-\xff]*$/;
 	  var host = document.myform.host;
 	  if(reg.test(host.value)){
 		  alert("host不能为空");
 		  return false;
 	  }
 	  if(!(reg2.test(host.value))){
 		 alert("请输入半角字符");
		  return false;
 	  }
 	  return true;
   } 
</script>

</html>
