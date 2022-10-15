<%@ include file="/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="com.bookings.service.MoviesLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="java.math.BigInteger" %>



<h3 style="green">Movie telecasting in these cities</h3>
<%try{%>
<%long id=ParamUtil.get(request, "id", 0); %>
<% List <Object[]> data=MoviesLocalServiceUtil.getAllTable(id);%>



<FORM METHOD="GET" >
<style>
  .tb { border-collapse: collapse; }
  .tb th, .tb td { padding: 5px; border: solid 1px #777; }
  .tb th { background-color: lightblue; }
</style>
<TABLE class="tb" BORDER="1" style="width:75%" >

<tr>
    <th>Movie Id</th>
    <th>Movie Name</th>
    <th>Rating</th>
    <th>cityname</th>
    <th>ctyId</th>
</tr>
<% for (Object[] objects : data) { %>
	<%BigInteger Id = (BigInteger) objects[0];%>
	<%String Mname = (String)objects[1];%>
	<%Double MRating = (Double)objects[2];%>
	<%String cityname = (String)objects[4];%>
	<%BigInteger ctyId = (BigInteger)objects[5];%>
	<tr>
	<td><%=Id%></td>
	<td><%=Mname%></td>
	<td><%=MRating%></td>
	<td><%=cityname%></td>
	<td><%=ctyId%></td>
	</tr>
	<br>
<% }%>

</TABLE>
</FORM>
	
<% }catch(Exception e){e.getMessage();}%>


<aui:button type="submit" value="back" onclick="javascript:history.go(-2)"></aui:button>




