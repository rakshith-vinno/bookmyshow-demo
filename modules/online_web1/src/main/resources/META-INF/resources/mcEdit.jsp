<%@page import="java.util.List"%>
<%@page import="com.bookings.service.CityLocalServiceUtil"%>
<%@page import="com.bookings.service.MoviesLocalServiceUtil"%>

<%@page import="java.math.BigInteger" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />

<portlet:actionURL name="saveMc" var="saveMov_cit">

</portlet:actionURL>

<style>
    options {
        width: 150px;
        margin: 40px;
    }
   
</style>




<h1>WELCOME</h1>

<aui:form action="${saveMov_cit}" method="post" name="saveMc">
        <aui:fieldset>
        <aui:select label="select movie" name="movie">
        
      <%try{%>
        <% List<Object[]> data=MoviesLocalServiceUtil.getOnlyMovieObject();%>
        <% for (Object[] objects : data) { %>
        <%BigInteger movieId = (BigInteger) objects[1];%>
	    <%String moviename = (String) objects[2];%>

	 <aui:option  label="<%=moviename%>" value="${movieId}" selected="true"></aui:option>
	 
 <% }%> 
	
<% }catch(Exception e){e.getMessage();}%>
        </aui:select>
   		</aui:fieldset>
   		<aui:fieldset>
   		
   		
   		
   		
   		
        <aui:select label="select city" name="city">
         
       <%try{%>
        <% List <Object[]> data = CityLocalServiceUtil.getCityObject();%>
        <% for (Object[] objects : data) { %>
         <%BigInteger cityId = (BigInteger) objects[1];%>
	    <%String cityname = (String) objects[2];%>
	  
	    
	
         <aui:option  label="<%=cityname%>" value="${cityId}" selected="true"></aui:option>
	
 <% }%> 
	
<% }catch(Exception e){e.getMessage();}%>
            
        </aui:select>
        </aui:fieldset>
      
        
         <aui:button type="submit" value="Register" />
         &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<aui:button type="submit" value="back" onclick="javascript:history.go(-1)"></aui:button>
    


</aui:form>

	









