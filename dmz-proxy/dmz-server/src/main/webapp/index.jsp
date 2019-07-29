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
		<em><input type="button" name="button" value="添加数据" class="input-button" onclick="location.href='/dmz-server/ToAddServlet'" /></em>
	</div>
	<div class="content">
		<table class="list">
			<tr style="background-color:#ccc;" >
				<td style ="width:20px;text-align: center;">NO</td>
				<td style ="width:200px;text-align: center;">host</td>
				<td style ="width:100px;text-align: center">port</td>
				<td style ="width:80px;text-align: center">操作</td>
			</tr>
			
			<c:forEach var="item" items="${list }" varStatus="s">
				<tr <c:if test="${s.index % 2 == 1 }" >style="background-color:#ddd;"</c:if>>
					<td>
					${s.index+1}
					</td>
					<td>
					${item.host}
					</td>
					<td>${item.port}</td>
					<td style ="text-align: center">
						<a href="/dmz-server/ToUpdateServlet?host=${item.host}">修改</a>
						<a href="javascript:if(confirm('您确定要删除吗？')){window.location.href='/dmz-server/DeleteServlet?host=${item.host}'}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
</body>
</html>