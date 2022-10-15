package com_mct.portlet;

import com.bookings.model.City;
import com.bookings.model.Movies;
import com.bookings.service.CityLocalServiceUtil;
import com.bookings.service.MoviesLocalServiceUtil;
import com.bookings.service.Movies_CityLocalServiceUtil;
import com.bookings.service.Movies_CityService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.math.BigInteger;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com_mct.constants.M_C_ThirPortletKeys;






@Component(immediate = true,
property = {"javax.portlet.name=" + M_C_ThirPortletKeys.M_C_THIR,
		"mvc.command.name=saveMc"},
service = MVCActionCommand.class)
public class M_CActionClass extends BaseMVCActionCommand
{

	 static long movie_id;
	 static	long city_id;
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception 
	{
		
		
		
		
		String movie_name=ParamUtil.get(actionRequest, "movieName", "");
		String city_name=ParamUtil.get(actionRequest, "cityName", "");
		System.out.println("Id    :"+movie_name+"  ctyId   :"+city_name);
		
		try {
		List<Movies[]> data=MoviesLocalServiceUtil.getMovieThird(movie_name);
		
		List<City[]> cit=CityLocalServiceUtil.getCityThird(city_name);
		System.out.println(data);
	  
			for (Object[] objects : data)
			{
				BigInteger l1 = (BigInteger) objects[0];
				  movie_id= l1.longValue();
				System.out.println("movie_id 1   :"+movie_id);
				
			}
			
			for (Object[] objects :  cit)
			{
				BigInteger l2 = (BigInteger) objects[0];
				 city_id=l2.longValue();
				System.out.println("CityID  2  :"+city_id);
				
			}
			
			if(city_id==0 && movie_id==0)
			{
				System.out.println("Null Value ,Movie or city nit in database");
			}
			else {
				_movies_CityService.addMovies_City(movie_id, city_id);
			}
			

		} catch (Exception e) 
		{e.printStackTrace();}
		
		
		
	}
	
	
	
	private  Movies_CityService _movies_CityService;

	@Reference(unbind ="_")
	protected void setMovies_CityService(Movies_CityService  movies_CityService)
	{
		_movies_CityService=movies_CityService;
	}

}
