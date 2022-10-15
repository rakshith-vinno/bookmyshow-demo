<%@ include file="/init.jsp" %>


<portlet:actionURL name="saveCit" var="saveCity">

</portlet:actionURL>


<aui:form name="fm" action="${saveCity}">

	
	<aui:input type="text" name="city_Name" label="City_Name"> </aui:input>

    <aui:button-row>
    <aui:button cssClass="btn btn-primary" type="submit" value="submit City"></aui:button>
    </aui:button-row>

</aui:form>