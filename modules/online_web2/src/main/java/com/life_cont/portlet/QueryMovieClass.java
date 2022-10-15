package com.life_cont.portlet;

import com.life_cont.constants.life_contPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;



@Component(
		
		immediate = true,
		property = {
				"javax.portlet.name=" + life_contPortletKeys.LIFE_CONT,
				"mvc.command.name=/create/queryFetch"
		},
		service = MVCRenderCommand.class
		
		)
public class QueryMovieClass implements MVCRenderCommand 
{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		System.out.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		return "/querryMovie.jsp";
	}

}
