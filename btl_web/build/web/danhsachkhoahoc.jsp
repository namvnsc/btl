<%-- 
    Document   : khoahoc
    Created on : Nov 17, 2019, 5:12:43 PM
    Author     : Admin
--%>

<%@page import="Model.KhoaHoc" %>
<%@page import="DAO.KhoaHocDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link h
        <link href="css/item.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <h1> Các khóa học hiện có </h1>
        <%ArrayList<KhoaHoc> dsKhoaHoc = (new KhoaHocDAO()).getAll();%>
        <center>
            <%for(KhoaHoc kh: dsKhoaHoc){%>
            <form action="DanhSachBaiHocServlet" method="get">
                    <button onclick="this.submit()" name="maKhoaHoc" value="<%=kh.getMa()%>" class="DivKhoaHoc">
                        <img class="AnhKhoaHoc" src="<%=kh.getUrlAnh()%>">
                        <div class="DivMoTaKhoaHoc">
                            <h2 class="TextTenKhoaHoc"><%=kh.getTen()%></h2>
                            <h3 class="TextMoTaKhoaHoc"><%=kh.getMoTa()%></h3>
                        </div>
                    </button>
                </form>
            <%}%>
        </center>
    </body>
</html>
