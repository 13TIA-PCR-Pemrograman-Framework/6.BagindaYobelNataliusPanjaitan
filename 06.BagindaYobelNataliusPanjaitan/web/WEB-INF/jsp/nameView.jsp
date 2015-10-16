<%-- 
    Document   : nameView
    Created on : Oct 9, 2015, 8:08:50 AM
    Author     : LabGSG
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Judul TA Mahasiswa PCR</title>
    </head>
    <body>
        <h2>Data Judul TA Mahasiswa PCR</h2>
        <spring:nestedPath path="name">
        <form action="" method="post">
            <table>
                <tr>
                <td>Nama</td><td>:</td>
            <spring:bind path="nama">
                <td>
                <input type="text" name="${status.expression}" value="${status.value}">
                </td>
                </tr>
            </spring:bind>
                <tr>
                <td>Nim</td><td>:</td>
            <spring:bind path="nim">
                <td><input type="text" name="${status.expression}" value="${status.value}"></td>
            </spring:bind>
                </tr>
                <tr>
                <td>Kelas</td><td>:</td>
            <spring:bind path="kelas">
                <td>
                <input type="text" name="${status.expression}" value="${status.value}">
                </td>
                </tr>
            </spring:bind>
                <tr>
                <td>Judul</td><td>:</td>
            <spring:bind path="judul">
                <td><input type="text" name="${status.expression}" value="${status.value}"></td>
            </spring:bind>
                </tr>
                <tr>
                    <td><input type="submit" value="OK"></td>
                </tr>
               
            </table>
        </form>
        </spring:nestedPath>
    </body>
</html>
