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
		
		ParamUtil.print(actionRequest);
		String movie=actionRequest.getParameter("movie");
		String city = actionRequest.getParameter("city");
		System.out.println(movie+"^^^^^^^^^^^^^^^^^^^^"+city);
		

	    
	    
		
		try {
		List<Movies[]> data=MoviesLocalServiceUtil.getMovieThird(movie);
		
		List<City[]> cit=CityLocalServiceUtil.getCityThird(city);
		
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
	
		
		
		
		
		
		
		
		
		
//	    try{
//   List<Object[]> data=MoviesLocalServiceUtil.getOnlyMovieObject();
//        for (Object[] objects : data) { 
//        BigInteger movieId = (BigInteger) objects[1];
//	    String moviename = (String) objects[2];
//	    System.out.println(movieId+"  "+moviename);
//        }}
//	    catch (Exception e) {
//			// TODO: handle exception
//		}
		
		ParamUtil.print(actionRequest);
		
	}
	
	
	
	private  Movies_CityService _movies_CityService;

	@Reference(unbind ="_")
	protected void setMovies_CityService(Movies_CityService  movies_CityService)
	{
		_movies_CityService=movies_CityService;
	}

}
