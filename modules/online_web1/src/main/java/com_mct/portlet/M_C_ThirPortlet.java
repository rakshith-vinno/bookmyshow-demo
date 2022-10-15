package com_mct.portlet;

import com_mct.constants.M_C_ThirPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author akshay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=M_C_Thir",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + M_C_ThirPortletKeys.M_C_THIR,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class M_C_ThirPortlet extends MVCPortlet {
}