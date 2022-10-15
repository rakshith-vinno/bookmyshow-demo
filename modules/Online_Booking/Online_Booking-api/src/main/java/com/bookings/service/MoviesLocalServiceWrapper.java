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
 * Provides a wrapper for {@link MoviesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MoviesLocalService
 * @generated
 */
public class MoviesLocalServiceWrapper
	implements MoviesLocalService, ServiceWrapper<MoviesLocalService> {

	public MoviesLocalServiceWrapper(MoviesLocalService moviesLocalService) {
		_moviesLocalService = moviesLocalService;
	}

	@Override
	public com.bookings.model.Movies addMovies(
		long id, String name, double rating, java.util.Date release_date,
		int length_min) {

		return _moviesLocalService.addMovies(
			id, name, rating, release_date, length_min);
	}

	/**
	 * Adds the movies to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MoviesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movies the movies
	 * @return the movies that was added
	 */
	@Override
	public com.bookings.model.Movies addMovies(
		com.bookings.model.Movies movies) {

		return _moviesLocalService.addMovies(movies);
	}

	@Override
	public com.bookings.model.Movies addMovies(
		String name, double rating, java.util.Date release_date,
		int length_min) {

		return _moviesLocalService.addMovies(
			name, rating, release_date, length_min);
	}

	/**
	 * Creates a new movies with the primary key. Does not add the movies to the database.
	 *
	 * @param id the primary key for the new movies
	 * @return the new movies
	 */
	@Override
	public com.bookings.model.Movies createMovies(long id) {
		return _moviesLocalService.createMovies(id);
	}

	/**
	 * Deletes the movies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MoviesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the movies
	 * @return the movies that was removed
	 * @throws PortalException if a movies with the primary key could not be found
	 */
	@Override
	public com.bookings.model.Movies deleteMovies(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _moviesLocalService.deleteMovies(id);
	}

	/**
	 * Deletes the movies from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MoviesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movies the movies
	 * @return the movies that was removed
	 */
	@Override
	public com.bookings.model.Movies deleteMovies(
		com.bookings.model.Movies movies) {

		return _moviesLocalService.deleteMovies(movies);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _moviesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _moviesLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _moviesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _moviesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _moviesLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _moviesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _moviesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.bookings.model.Movies fetchMovies(long id) {
		return _moviesLocalService.fetchMovies(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _moviesLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<Object[]> getAllTable(long id) {
		return _moviesLocalService.getAllTable(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _moviesLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<Object[]> getMovieID(String name) {
		return _moviesLocalService.getMovieID(name);
	}

	@Override
	public java.util.List<Object[]> getMoviEIdlist(String name) {
		return _moviesLocalService.getMoviEIdlist(name);
	}

	@Override
	public java.util.List<Object[]> getMoviEIdlist(
		String name, String cityName) {

		return _moviesLocalService.getMoviEIdlist(name, cityName);
	}

	@Override
	public java.util.List<Object[]> getMoviEIdlist1(String name) {
		return _moviesLocalService.getMoviEIdlist1(name);
	}

	@Override
	public java.util.List<com.bookings.model.Movies> getMovieiiiiiiiii(
		String name) {

		return _moviesLocalService.getMovieiiiiiiiii(name);
	}

	@Override
	public java.util.List<Object> getMovieObj(String name) {
		return _moviesLocalService.getMovieObj(name);
	}

	/**
	 * Returns the movies with the primary key.
	 *
	 * @param id the primary key of the movies
	 * @return the movies
	 * @throws PortalException if a movies with the primary key could not be found
	 */
	@Override
	public com.bookings.model.Movies getMovies(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _moviesLocalService.getMovies(id);
	}

	/**
	 * Returns a range of all the movieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movieses
	 * @param end the upper bound of the range of movieses (not inclusive)
	 * @return the range of movieses
	 */
	@Override
	public java.util.List<com.bookings.model.Movies> getMovieses(
		int start, int end) {

		return _moviesLocalService.getMovieses(start, end);
	}

	/**
	 * Returns the number of movieses.
	 *
	 * @return the number of movieses
	 */
	@Override
	public int getMoviesesCount() {
		return _moviesLocalService.getMoviesesCount();
	}

	@Override
	public java.util.List<com.bookings.model.Movies[]> getMovieThird(
		String name) {

		return _moviesLocalService.getMovieThird(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _moviesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _moviesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the movies in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MoviesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movies the movies
	 * @return the movies that was updated
	 */
	@Override
	public com.bookings.model.Movies updateMovies(
		com.bookings.model.Movies movies) {

		return _moviesLocalService.updateMovies(movies);
	}

	@Override
	public MoviesLocalService getWrappedService() {
		return _moviesLocalService;
	}

	@Override
	public void setWrappedService(MoviesLocalService moviesLocalService) {
		_moviesLocalService = moviesLocalService;
	}

	private MoviesLocalService _moviesLocalService;

}