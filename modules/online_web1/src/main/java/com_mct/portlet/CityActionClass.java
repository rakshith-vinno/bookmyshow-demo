package com_mct.portlet;

import com.bookings.service.CityService;
import com.bookings.service.Movies_CityService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com_mct.constants.M_C_ThirPortletKeys;




@Component(immediate = true,
property = {"javax.portlet.name=" + M_C_ThirPortletKeys.M_C_THIR,
		"mvc.command.name=saveCit"},
service = MVCActionCommand.class)
public class CityActionClass extends BaseMVCActionCommand
{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception 
	{
		//long city_id=ParamUtil.get(actionRequest, "city_id", 0);
		String city_Name=ParamUtil.get(actionRequest, "city_Name", "");
		
		System.out.println("  "+city_Name);
		_cityService.addCity(city_Name);
		
	}
	
	
	private  CityService _cityService;

	@Reference(unbind ="_")
	protected void setCityService(CityService  cityService)
	{
		_cityService=cityService;
	}

}
