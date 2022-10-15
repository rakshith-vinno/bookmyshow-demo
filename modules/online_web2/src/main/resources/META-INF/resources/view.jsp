
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.bookings.service.CityLocalServiceUtil"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
	
	<%@ page import="com.bookings.model.Movies"%> 
<%@ include file="/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="com.bookings.service.CityLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<p>
	<b><liferay-ui:message key="life_cont.caption" /></b>
</p>






<portlet:renderURL var="createMovieFetchRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/movieFetch" />
</portlet:renderURL>
<a href="${createMovieFetchRenderClass}"> <input type="submit" value="Movie List"></input></a>
&nbsp&nbsp&nbsp



<portlet:renderURL var="createCityFetchRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/cityFetch" />
</portlet:renderURL>
<a href="${createCityFetchRenderClass}"> <input type="submit" value="City List"></input></a>
&nbsp&nbsp&nbsp

<portlet:renderURL var="createMovie_CityFetchRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/m_cFetch" />
</portlet:renderURL>
<a href="${createMovie_CityFetchRenderClass}"> <input type="submit" value="Telecasting List"></input></a>


<br><br><br><br>

<h5>Queries</h5>

<portlet:renderURL var="createQueryRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/queryFetch" />
</portlet:renderURL>
<a href="${createQueryRenderClass}"> <input type="submit" value="Movie Query"></input></a>
&nbsp&nbsp&nbsp

<portlet:renderURL var="createQueryRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/queryFetch" />
</portlet:renderURL>
<a href="${createQueryRenderClass}"> <input type="submit" value="City Query"></input></a>


<br><br>


<br><br>

<portlet:renderURL var="searchURL">
    <portlet:param name="mvcRenderCommandName" 
    value="/guestbook/view_search.jsp" />
</portlet:renderURL>


<style>
    options {
        width: 150px;
        margin: 40px;
    }
   
</style>




<h1>WELCOME</h1>

<aui:form action="${searchURL}" name="fm">
    <aui:fieldset>
        <aui:select label="Select Cities:" id="options" name="selectField1" required="true" showEmptyOption="true">
        
        <%try{%>
        <%long id=ParamUtil.get(request, "id", 0); %>
        <% List <Object[]> data = CityLocalServiceUtil.getCityObject();%>
        <% for (Object[] objects : data) { %>
	    <%String cityname = (String) objects[2];%>
	    
	
        <aui:option value="Option 1"><%=cityname%></aui:option>
	
<% }%>
	
<% }catch(Exception e){e.getMessage();}%>
            
        </aui:select>
         <aui:button type="submit" value="search" />
    </aui:fieldset>
</aui:form>
