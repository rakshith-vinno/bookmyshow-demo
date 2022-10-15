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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Movies_CityService}.
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityService
 * @generated
 */
public class Movies_CityServiceWrapper
	implements Movies_CityService, ServiceWrapper<Movies_CityService> {

	public Movies_CityServiceWrapper(Movies_CityService movies_CityService) {
		_movies_CityService = movies_CityService;
	}

	@Override
	public com.bookings.model.Movies_City addMovies_City(
		long movie_id, long city_id) {

		return _movies_CityService.addMovies_City(movie_id, city_id);
	}

	@Override
	public java.util.List<com.bookings.model.Movies_City> getMovies_City(
		int startIndex, int lastIndex) {

		return _movies_CityService.getMovies_City(startIndex, lastIndex);
	}

	@Override
	public int getMovies_CityCount() {
		return _movies_CityService.getMovies_CityCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _movies_CityService.getOSGiServiceIdentifier();
	}

	@Override
	public Movies_CityService getWrappedService() {
		return _movies_CityService;
	}

	@Override
	public void setWrappedService(Movies_CityService movies_CityService) {
		_movies_CityService = movies_CityService;
	}

	private Movies_CityService _movies_CityService;

}