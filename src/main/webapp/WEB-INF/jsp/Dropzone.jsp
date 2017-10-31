<%--
  Created by IntelliJ IDEA.
  User: HUNGTA
  Date: 10/29/17
  Time: 8:33 PM
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

    <title>Upload File Dropzone</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Upload Image</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">

            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="panel panel-default" id="fileupload_main_panel">
        <div class="panel-body">
            <div class="row">
                <div class="col-md-12">
                    <form enctype="multipart/form-data"
                          action="/upload" method="POST"
                          class="dropzone" id="fileUploadForm">

                        <span id="fileUploadStatus"> </span>

                    </form>
                </div>
            </div>
        </div>
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
