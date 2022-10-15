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

import com.bookings.model.Movies_City;

import java.util.List;

/**
 * Provides the remote service utility for Movies_City. This utility wraps
 * <code>com.bookings.service.impl.Movies_CityServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityService
 * @generated
 */
public class Movies_CityServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bookings.service.impl.Movies_CityServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Movies_City addMovies_City(long movie_id, long city_id) {
		return getService().addMovies_City(movie_id, city_id);
	}

	public static List<Movies_City> getMovies_City(
		int startIndex, int lastIndex) {

		return getService().getMovies_City(startIndex, lastIndex);
	}

	public static int getMovies_CityCount() {
		return getService().getMovies_CityCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Movies_CityService getService() {
		return _service;
	}

	private static volatile Movies_CityService _service;

}