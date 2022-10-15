/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bookings.service;

import aQute.bnd.annotation.ProviderType;

import com.bookings.model.Movies_City;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for Movies_City. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(
	property = {
		"json.web.service.context.name=online_booking",
		"json.web.service.context.path=Movies_City"
	},
	service = Movies_CityService.class
)
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface Movies_CityService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.bookings.service.impl.Movies_CityServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the movies_ city remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link Movies_CityServiceUtil} if injection and service tracking are not available.
	 */
	public Movies_City addMovies_City(long movie_id, long city_id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Movies_City> getMovies_City(int startIndex, int lastIndex);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMovies_CityCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

}