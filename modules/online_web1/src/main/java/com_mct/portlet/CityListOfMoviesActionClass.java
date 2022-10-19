package com_mct.portlet;

import com.bookings.model.City;
import com.bookings.model.Movies;
import com.bookings.service.CityLocalServiceUtil;
import com.bookings.service.MoviesLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import java.math.BigInteger;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com_mct.constants.M_C_ThirPortletKeys;

@Component(immediate = true,
property = {"javax.portlet.name=" + M_C_ThirPortletKeys.M_C_THIR,
		"mvc.command.name=citysearchName"},
service = MVCActionCommand.class)
public class CityListOfMoviesActionClass extends BaseMVCActionCommand
{

	
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
	
		System.out.println("hooooooooooooookdddddddddddddddddddd");
		

		
		String city = actionRequest.getParameter("cityTable");
		System.out.println(city+".......................................................");
		
		try {
			
			List<Object[]> cit=CityLocalServiceUtil.getAllTable(city);
				
				for (Object[] objects :  cit)
				{
					String l1 = (String) objects[0];
					Double l2 = (Double) objects[1];
					
			System.out.print(objects[2]);
					Integer l4 = (Integer) objects[3];
					System.out.println("\t"+"\t:\t"+l1+"\t:\t"+l2+"\t:\t"+l4);
					
				}
				
//				if(city_id==0 && movie_id==0)
//				{
//					System.out.println("Null Value ,Movie or city nit in database");
//				}
//				else {
//					_movies_CityService.addMovies_City(movie_id, city_id);
//				}
				
				
				actionRequest.setAttribute("b",cit);

			} catch (Exception e) 
			{e.printStackTrace();}
		
	}

}
