<%--
  Created by IntelliJ IDEA.
  User: HUNGTA
  Date: 10/30/17
  Time: 12:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <spring:url value="/lib/bootstrap-3.3.7-dist/css/bootstrap.min.css" var="springCss" />
    <link href="${springCss}" rel="stylesheet" />

    <spring:url value="/lib/dropzone-4.3.0/dist/dropzone.css" var="dropzoneCss" />
    <link href="${dropzoneCss}" rel="stylesheet" />

    <spring:url value="/css/style.css" var="styleCss" />
    <link href="${styleCss}" rel="stylesheet" />
    <title>Show List Image</title>
</head>
<body>

<style>
    img {
        filter: gray; /* IE6-9 */
        -webkit-filter: grayscale(1); /* Google Chrome, Safari 6+ & Opera 15+ */
        -webkit-box-shadow: 0px 2px 6px 2px rgba(0,0,0,0.75);
        -moz-box-shadow: 0px 2px 6px 2px rgba(0,0,0,0.75);
        box-shadow: 0px 2px 6px 2px rgba(0,0,0,0.75);
        margin-bottom:20px;
    }

    img:hover {
        filter: none; /* IE6-9 */
        -webkit-filter: grayscale(0); /* Google Chrome, Safari 6+ & Opera 15+ */

    }
</style>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Upload Image Sample</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">

            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="starter-template">
        <h1>List Image</h1>
    </div>

    <div class="row">
<c:forEach var="image" items="${images}">
        <div class="col-md-3 col-sm-4 col-xs-6">
            <img class="img-responsive" src='<c:out value="${image.path}"/>' />
        </div>
</c:forEach>
    </div>
</div>
</body>
<spring:url value="/lib/jquery-3.1.1.js" var="Jquery" />
<script type="text/javascript" src="${Jquery}"></script>

<spring:url value="/lib/bootstrap-3.3.7-dist/js/bootstrap.min.js" var="bootstrapJs" />
<script type="text/javascript" src="${bootstrapJs}"></script>

<spring:url value="/lib/dropzone-4.3.0/dist/dropzone.js" var="dropzoneJs" />
<script type="text/javascript" src="${dropzoneJs}"></script>

</html>
