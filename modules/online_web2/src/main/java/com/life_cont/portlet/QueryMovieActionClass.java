package com.life_cont.portlet;

import com.bookings.service.MoviesLocalServiceUtil;
import com.life_cont.constants.life_contPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.math.BigInteger;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.RequestDispatcher;

import org.osgi.service.component.annotations.Component;



@Component(immediate = true,
property = {"javax.portlet.name=" + life_contPortletKeys.LIFE_CONT,
		"mvc.command.name=queMov"},
service = MVCActionCommand.class)
public class QueryMovieActionClass extends BaseMVCActionCommand
{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception
	{
		long id=ParamUtil.get(actionRequest, "id", 0);
		System.out.println(id+"  ...................");
		
		try {
			List <Object[]> data = MoviesLocalServiceUtil.getAllTable(id);
		
			for (Object[] objects : data) {
				BigInteger Id = (BigInteger) objects[0];
				String Mname = (String)objects[1];
				Double MRating = (Double)objects[2];
				//Date release = (Date)objects[3];
				String cityname = (String)objects[4];
				BigInteger ctyId = (BigInteger)objects[5];
				System.out.println("Movie id->  "+Id+"  Moviename   -->  "+Mname+"    MRating-->   "+MRating+"    cityname_-->   "+cityname+"   ctyId ---> "+ctyId);
				
				
				//<%long id=ParamUtil.get(request, "id", 0); %>
				
				actionRequest.setAttribute("idd", id+"");
				//getPortletContext().getRequestDispatcher("/call.jsp").include(renderRequest, renderResponse);

// getPortletConfig(actionRequest).getPortletContext().getRequestDispatcher("/call.jsp").include(actionRequest, actionResponse);
			}

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
