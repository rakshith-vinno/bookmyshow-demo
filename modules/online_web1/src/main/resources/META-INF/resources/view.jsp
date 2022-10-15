<%@ include file="/init.jsp" %>

<%@page import="java.util.List"%>
<%@page import="com.bookings.service.CityLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<p>
	<b><liferay-ui:message key="m_c_thir.caption"/></b>
</p>

<portlet:renderURL var="createMovieEditRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/movieEdit" />
</portlet:renderURL>
<a href="${createMovieEditRenderClass}" >
<input type="submit" value="Add Movie "></input>
</a>
&nbsp&nbsp&nbsp&nbsp





<portlet:renderURL var="createCityEditRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/cityEdit" />
</portlet:renderURL>
<a href="${createCityEditRenderClass}" >
<input type="submit" value="Add City " color="green"></input>
</a>&nbsp&nbsp&nbsp&nbsp





<portlet:renderURL var="createMCEditRenderClass">
	<portlet:param name="mvcRenderCommandName" value="/create/mcEdit" />
</portlet:renderURL>
<a href="${createMCEditRenderClass}" >
<input type="submit" value="SCHEDULE"></input>
</a>


&nbsp&nbsp&nbsp&nbsp



<portlet:renderURL var="createMovieFetchRenderClass">

	<portlet:param name="mvcRenderCommandName" value="/create/movieFetch" />

</portlet:renderURL>
<a href="${createMovieFetchRenderClass}" >
<input type="submit" value="Movie List"></input>
</a>

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





