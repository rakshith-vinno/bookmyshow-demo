<%@ include file="/init.jsp"%>


<portlet:actionURL name="saveMov" var="saveMovie">

</portlet:actionURL>


<h2>Add new Movie to Booking Portal</h2>

<aui:form name="fm" action="${saveMovie}">

	
	<aui:input type="text" name="name" label="Movie Name"> </aui:input>
	<aui:input type="double" name="rating" label="Rating"> </aui:input>
	<aui:input type="date" name="release_date" label="Release _Date"> </aui:input>
	<aui:input type="text" name="length_min" label="Time"> </aui:input>

    <aui:button-row>
    <aui:button cssClass="btn btn-primary" type="submit" value="submit Movie"></aui:button>
    </aui:button-row>

</aui:form>