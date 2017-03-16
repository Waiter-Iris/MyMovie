<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<body>
	<a href="showAllVtype!findAll">查看所有</a>

	<%-- <s:form action="showAllCar!save" method="post">
		<s:textfield label="品牌" name="car.brand" />
		<s:textfield label="价格" name="car.price" />
		<s:textfield label="型号" name="car.size" />
		<s:textfield label="颜色" name="car.color" />
		<s:submit value="提交" />
	</s:form> --%>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>分类名称</th>
			<th>地区ID</th>
		</tr>
		<c:forEach items="${vtypes }" var="vtype">
			<tr>
				<td>${vtype.vtypeId }</td>
				<td>${vtype.vtypeName }</td>
				<td>${vtype.areaId }</td>
			<tr>
		</c:forEach>
	</table>
</body>
</html>
