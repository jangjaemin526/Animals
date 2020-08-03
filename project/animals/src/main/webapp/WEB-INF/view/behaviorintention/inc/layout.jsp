<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!doctype HTML>
<html>
<head>
	 <link href="/css/behaviorintention.css" type="text/css" rel="stylesheet" />
</head>
<body>
<tiles:insertAttribute name="header" />

<tiles:insertAttribute name="main" />

<tiles:insertAttribute name="footer" />
</body>
</html>