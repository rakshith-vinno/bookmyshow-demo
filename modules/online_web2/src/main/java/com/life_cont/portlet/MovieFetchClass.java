package com.life_cont.portlet;

import com.bookings.service.MoviesService;
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
				"mvc.command.name=/create/movieFetch"
		},
		service = MVCRenderCommand.class
		
		)
public class MovieFetchClass implements MVCRenderCommand
{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException 
	{
		
		int delta= ParamUtil.getInteger(renderRequest, "delta");
		int cur= ParamUtil.getInteger(renderRequest, "cur");
		
		int from = delta*(cur-1);
		int to = delta == 0 ? 10 : delta*cur;
		
		renderRequest.setAttribute("totcount", _moviesService.getMoviesCount());
		renderRequest.setAttribute("moviesss", _moviesService.getMovies(from, to));
		
		return "/movieRetrive.jsp";
	}
	
	
	private  MoviesService _moviesService;

	@Reference(unbind ="_")
	protected void setMoviesService(MoviesService  moviesService)
	{
		_moviesService=moviesService;
	}

}
