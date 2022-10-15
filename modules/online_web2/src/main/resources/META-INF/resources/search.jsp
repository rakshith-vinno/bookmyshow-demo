<%@ include file="/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="com.bookings.service.CityLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="java.math.BigInteger" %>
<h1>search</h1>

<style>
    select {
        width: 250px;
        margin: 40px;
    }
   
</style>
<%try{%>
<%long id=ParamUtil.get(request, "id", 0); %>
<% List <Object[]> data = CityLocalServiceUtil.getCityObject();
%>
<select name="cities" >
<% for (Object[] objects : data) { %>
	<%String cityname = (String) objects[2];%>
	

	
	<option><%=cityname%></option>
	
	
<% }%>

</select>
	
<% }catch(Exception e){e.getMessage();}%>















