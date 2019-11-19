<%-- 
    Document   : danhsachbaihoc
    Created on : Nov 18, 2019, 3:00:52 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%String maKhoaHoc = (String)request.getParameter("maKhoaHoc");%>
        <h1><%=maKhoaHoc%></h1>
    </body>
</html>
