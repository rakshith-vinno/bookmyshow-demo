package com_mct.portlet;

import com.bookings.service.CityService;
import com.bookings.service.MoviesService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com_mct.constants.M_C_ThirPortletKeys;


@Component(immediate = true,
property = {"javax.portlet.name=" + M_C_ThirPortletKeys.M_C_THIR,
		"mvc.command.name=saveMov"},
service = MVCActionCommand.class)
public class MovieActionClass extends BaseMVCActionCommand
{
	Date dateO;

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception 
	{
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String date = "10/05/2030";
		try{
		   dateO = df.parse(date);
		} catch(Exception e){
		}
		
		
		
		
		//long id=ParamUtil.get(actionRequest, "id", 0);
		String name=ParamUtil.get(actionRequest, "name", "");
		Double rating=ParamUtil.get(actionRequest, "rating", 0.0);
        //Object release_date = ParamUtil.get(actionRequest, "release_date", "");
		//Date release_date = ParamUtil.get(actionRequest, "release_date", new SimpleDateFormat("yyyy/MM/dd"),dateO);
		
		Date release_date= ParamUtil.getDate(actionRequest, "release_date", new SimpleDateFormat("yyyy/MM/dd"));
		int length_min=ParamUtil.get(actionRequest, "length_min", 0);

		
		
		System.out.println(" "+name+" "+rating+" "+release_date+" "+length_min);
//		System.out.println(df.format(new Date()));
		//System.out.println(id+" "+name+" "+rating+" "+d1+" "+length_min);

		_moviesService.addMovies(name, rating, release_date, length_min);
		
	}
	
	
	private  MoviesService _moviesService;

	@Reference(unbind ="_")
	protected void setMoviesService(MoviesService  moviesService)
	{
		_moviesService=moviesService;
	}
	
	
	
	
	
	

}
