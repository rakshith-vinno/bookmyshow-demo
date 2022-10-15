package com_mct.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com_mct.constants.M_C_ThirPortletKeys;

@Component(immediate = true,
property = {"javax.portlet.name=" + M_C_ThirPortletKeys.M_C_THIR,
		"mvc.command.name=/create/cityEdit"},
service = MVCRenderCommand.class)
public class CityRenderClass implements MVCRenderCommand 
{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/cityEdit.jsp";
	}

}
