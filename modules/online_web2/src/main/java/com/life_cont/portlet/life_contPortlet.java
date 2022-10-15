package com.life_cont.portlet;

import com.bookings.model.City;
import com.bookings.service.CityLocalServiceUtil;
import com.bookings.service.CityService;
import com.bookings.service.MoviesLocalServiceUtil;
import com.bookings.service.MoviesService;
import com.bookings.service.Movies_CityService;
import com.life_cont.constants.life_contPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author akshay
 */
@Component(
		immediate = true,
		property = {
				"com.liferay.portlet.display-category=category.sample",
				"com.liferay.portlet.header-portlet-css=/css/main.css",
				"com.liferay.portlet.instanceable=true",
				"javax.portlet.display-name=life_cont",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"javax.portlet.name=" + life_contPortletKeys.LIFE_CONT,
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
		)
public class life_contPortlet extends MVCPortlet 
{
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

//				int delta= ParamUtil.getInteger(renderRequest, "delta"); int cur=
//						ParamUtil.getInteger(renderRequest, "cur");
//		
//				int from = delta*(cur-1)+1; int to = delta == 0 ? 10 : delta*cur;
//		
//		
//				renderRequest.setAttribute("totcount", _moviesService.getMoviesCount());
//				renderRequest.setAttribute("moviesss", _moviesService.getMovies(from,to));
		
		//		renderRequest.setAttribute("totcitycount", _cityService.getCityCount());
		//		renderRequest.setAttribute("citiesss",_cityService.getCity(from, to));
		//		
		//		renderRequest.setAttribute("totmccount", _movies_CityService.getMovies_CityCount());
		//		renderRequest.setAttribute("mc", _movies_CityService.getMovies_City(from, to));
				
				
				
//				try {
//					List <Object[]> data = MoviesLocalServiceUtil.getAllTable(1);
//				
//					for (Object[] objects : data) {
//						BigInteger Id = (BigInteger) objects[0];
//						String Mname = (String)objects[1];
//						Double MRating = (Double)objects[2];
//						//Date release = (Date)objects[3];
//						String cityname = (String)objects[4];
//						BigInteger ctyId = (BigInteger)objects[5];
//						System.out.println("Movie id->  "+Id+"  Moviename   -->  "+Mname+"    MRating-->   "+MRating+"    cityname_-->   "+cityname+"   ctyId ---> "+ctyId);
//						
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
		
		
		try {
			List <Object[]> data = CityLocalServiceUtil.getCityObject();
		
			for (Object[] objects : data) 
			{
				
				String Id = (String) objects[2];
				BigInteger  Mname =  (BigInteger) objects[1];
			
			System.out.println(Id+"\t"+Mname);
			
		}
		
		System.out.println(data);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
				
		String  check=(String) renderRequest.getAttribute("idd");
		if(check ==null)
		{
			System.out.println("first  null");
		}
		else {
			long id=Long.parseLong(check);
			getPortletContext().getRequestDispatcher("/call.jsp").include(renderRequest, renderResponse);
		}
		
//				long id=(long) renderRequest.getAttribute("idd");
//				if(id== 0)
//				{
//					getPortletContext().getRequestDispatcher("/view.jsp").include(renderRequest, renderResponse);
//
//				}else {		
//					getPortletContext().getRequestDispatcher("/call.jsp").include(renderRequest, renderResponse);
//				}
				
				
				
		super.doView(renderRequest, renderResponse);
	}
	
	
	
	

	private  MoviesService _moviesService;
	@Reference(unbind ="_")
	protected void setMoviesService(MoviesService  moviesService)
	{
		_moviesService=moviesService;
	}



	private  CityService _cityService;
	@Reference(unbind ="_")
	protected void setCityService(CityService  cityService)
	{
		_cityService=cityService;
	}


	private  Movies_CityService _movies_CityService;
	@Reference(unbind ="_")
	protected void setMovies_CityService(Movies_CityService  movies_CityService)
	{
		_movies_CityService=movies_CityService;
	}

}