
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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




<h1>List Of Movies</h1>


<liferay-ui:search-container delta="10" emptyResultsMessage="no-entries-were-found" total="${totcount}">

	<liferay-ui:search-container-results results="${moviesss}" />
	
	<liferay-ui:search-container-row className="com.bookings.model.Movies"
		keyProperty="id" modelVar="entry" escapedModel="<%=true%>">
		<liferay-ui:search-container-column-text property="id" />
		<liferay-ui:search-container-column-text property="name" />
		<liferay-ui:search-container-column-text property="rating" />
		<liferay-ui:search-container-column-text property="release_date" />
		<liferay-ui:search-container-column-text property="length_min" />

	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
	<aui:button type="submit" value="back" onclick="javascript:history.go(-1)"></aui:button>
</liferay-ui:search-container>








