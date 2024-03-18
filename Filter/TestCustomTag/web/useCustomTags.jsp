<%-- 
    Document   : useCustomTags
    Created on : Mar 18, 2024, 4:56:12 PM
    Author     : hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/mycustomtagslib"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomTags Page</title>
    </head>
    <body>
        <mytag:TagHandler1/>
            <mytag:TagHandler1/>
        <mytag:TagHandler1/>
        <mytag:TagHandler1/>
    </body>
</html>
