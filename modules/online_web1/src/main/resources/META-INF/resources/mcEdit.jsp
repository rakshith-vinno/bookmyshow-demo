<%@ include file="/init.jsp" %>


<portlet:actionURL name="saveMc" var="saveMov_cit">

</portlet:actionURL>



<aui:form name="fm" action="${saveMov_cit}">

	<aui:input type="text" name="movieName" label="Movie"> </aui:input>
	<aui:input type="text" name="cityName" label="City"> </aui:input>

    <aui:button-row>
    <aui:button cssClass="btn btn-primary" type="submit" value="scheduling"></aui:button>
    </aui:button-row>

</aui:form>