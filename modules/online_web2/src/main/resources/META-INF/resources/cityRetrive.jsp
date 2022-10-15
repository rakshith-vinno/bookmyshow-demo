<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
	
<%@ include file="/init.jsp"%>
<%@ page import="com.bookings.model.City"%> 





<h1>List Of Cities</h1>

<liferay-ui:search-container delta="5" emptyResultsMessage="no-entries-were-found" total="${totcitycount}">

	<liferay-ui:search-container-results results="${citiesss}" />
	
	<liferay-ui:search-container-row className="com.bookings.model.City"
		keyProperty="city_id" modelVar="entry" escapedModel="<%=true%>">
		<liferay-ui:search-container-column-text property="city_id" />
		<liferay-ui:search-container-column-text property="city_Name" />

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
	<aui:button type="submit" value="back" onclick="javascript:history.go(-1)"></aui:button>
</liferay-ui:search-container>

<h1>Ended</h1>
