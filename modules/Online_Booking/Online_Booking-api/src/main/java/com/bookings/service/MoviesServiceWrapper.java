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
 * Provides a wrapper for {@link MoviesService}.
 *
 * @author Brian Wing Shun Chan
 * @see MoviesService
 * @generated
 */
public class MoviesServiceWrapper
	implements MoviesService, ServiceWrapper<MoviesService> {

	public MoviesServiceWrapper(MoviesService moviesService) {
		_moviesService = moviesService;
	}

	@Override
	public com.bookings.model.Movies addMovies(
		long id, String name, double rating, java.util.Date release_date,
		int length_min) {

		return _moviesService.addMovies(
			id, name, rating, release_date, length_min);
	}

	@Override
	public com.bookings.model.Movies addMovies(
		String name, double rating, java.util.Date release_date,
		int length_min) {

		return _moviesService.addMovies(name, rating, release_date, length_min);
	}

	@Override
	public java.util.List<com.bookings.model.Movies> getMovies(
		int startIndex, int lastIndex) {

		return _moviesService.getMovies(startIndex, lastIndex);
	}

	@Override
	public int getMoviesCount() {
		return _moviesService.getMoviesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _moviesService.getOSGiServiceIdentifier();
	}

	@Override
	public MoviesService getWrappedService() {
		return _moviesService;
	}

	@Override
	public void setWrappedService(MoviesService moviesService) {
		_moviesService = moviesService;
	}

	private MoviesService _moviesService;

}