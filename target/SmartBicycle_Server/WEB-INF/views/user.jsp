<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    {"id":${SelectId},"username":${SelectUsername},"switch1":${SelectSwitch1},"switch2":${SelectSwitch2},"camera":${SelectCamera}}

<%--<head>--%>
    <%--<title>用户数据</title>--%>
<%--</head>--%>
<%--<style type="text/css">--%>
    <%--*{--%>
        <%--padding:0;--%>
        <%--margin:0;--%>
    <%--}--%>
    <%--body{--%>
        <%--width:800px;--%>
        <%--margin:0 auto;--%>
    <%--}--%>
    <%--#top{--%>
        <%--width:800px;--%>
        <%--height:50px;--%>
        <%--/*background:red;*/--%>
    <%--}--%>
<%--</style>--%>
<%--<body>--%>
<%--&lt;%&ndash;显示我们的设置的标题&ndash;%&gt;--%>
<%--<h1>--%>
    <%--<div id="top"--%>
         <%--align="center">--%>
    <%--3dPrinterMonitor--%>
    <%--</div>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<h2>--%>
    <%--<div align="center">--%>
    <%--${title}--%>
<%--</h2>--%>
<%--&lt;%&ndash;显示我们从数据库取出来的用户数据&ndash;%&gt;--%>
<%--<br/>--%>

<%--<table>--%>
    <%--<div align="center">--%>
    <%--&lt;%&ndash;<thead>&ndash;%&gt;--%>
    <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;ID&ndash;%&gt;--%>
        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;用户名&ndash;%&gt;--%>
        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;日期&ndash;%&gt;--%>
        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;日运动量(km/day)&ndash;%&gt;--%>
        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;总运动量(km)&ndash;%&gt;--%>
        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;总运动时间(hour)&ndash;%&gt;--%>
        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;总运动次数(times)&ndash;%&gt;--%>
        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</thead>&ndash;%&gt;--%>
    <%--&lt;%&ndash;<tbody>&ndash;%&gt;--%>
    <%--&lt;%&ndash;&lt;%&ndash;struts2的遍历标签,循环取出用户的信息&ndash;%&gt;&ndash;%&gt;--%>
    <%--&lt;%&ndash;<s:iterator value="users" id="user">&ndash;%&gt;--%>
        <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td>${user.id}</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td>${user.username}</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td>${user.switch1}</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td>${user.switch2}</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td>${user.camera}</td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</s:iterator>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</tbody>&ndash;%&gt;--%>
        <%--<tr>--%>
            <%--<td>${SelectId}</td>--%>
            <%--<td>${SelectSwitch1}</td>--%>
            <%--<td>${SelectSwitch2}</td>--%>
            <%--<td>${SelectCamera}</td>--%>
        <%--</tr>--%>
<%--</table>--%>

<%--</body>--%>

