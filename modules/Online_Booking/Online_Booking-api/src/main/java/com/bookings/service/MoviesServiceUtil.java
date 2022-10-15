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

import com.bookings.model.Movies;

import java.util.List;

/**
 * Provides the remote service utility for Movies. This utility wraps
 * <code>com.bookings.service.impl.MoviesServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see MoviesService
 * @generated
 */
public class MoviesServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bookings.service.impl.MoviesServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Movies addMovies(
		long id, String name, double rating, java.util.Date release_date,
		int length_min) {

		return getService().addMovies(
			id, name, rating, release_date, length_min);
	}

	public static Movies addMovies(
		String name, double rating, java.util.Date release_date,
		int length_min) {

		return getService().addMovies(name, rating, release_date, length_min);
	}

	public static List<Movies> getMovies(int startIndex, int lastIndex) {
		return getService().getMovies(startIndex, lastIndex);
	}

	public static int getMoviesCount() {
		return getService().getMoviesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static MoviesService getService() {
		return _service;
	}

	private static volatile MoviesService _service;

}