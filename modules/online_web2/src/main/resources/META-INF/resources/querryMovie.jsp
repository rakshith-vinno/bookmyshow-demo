<%@ include file="/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="com.bookings.service.MoviesLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="java.math.BigInteger" %>


<portlet:actionURL name="queMov" var="queMovie">

</portlet:actionURL>


<h2>Enter movie Id</h2>

<aui:form name="fm" action="${queMovie}">

	<aui:input type="number" name="id" label="Movie  Id"> </aui:input>
	

    <aui:button-row>
    <aui:button cssClass="btn btn-primary" type="submit" value="Enter"  >
    
    
    </aui:button>
    </aui:button-row>

</aui:form>


























