package com.life_cont.portlet;

import com.bookings.service.Movies_CityService;
import com.life_cont.constants.life_contPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		
		immediate = true,
		property = {
				"javax.portlet.name=" + life_contPortletKeys.LIFE_CONT,
				"mvc.command.name=/create/m_cFetch"
		},
		service = MVCRenderCommand.class
		
		)
public class M_CFetchClass implements MVCRenderCommand
{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		int delta= ParamUtil.getInteger(renderRequest, "delta");
		int cur= ParamUtil.getInteger(renderRequest, "curr");
		
		int from = delta*(cur-1)+1;
		int to = delta == 0 ? 10: delta*cur;
		
		renderRequest.setAttribute("totmccount", _movies_CityService.getMovies_CityCount());
		renderRequest.setAttribute("mc",  _movies_CityService.getMovies_City(from, to));
		return "/mcRetrive.jsp";
	}
	
	
	private  Movies_CityService _movies_CityService;

	@Reference(unbind ="_")
	protected void setMovies_CityService(Movies_CityService  movies_CityService)
	{
		_movies_CityService=movies_CityService;
	}

}
