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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Movies. This utility wraps
 * <code>com.bookings.service.impl.MoviesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MoviesLocalService
 * @generated
 */
public class MoviesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bookings.service.impl.MoviesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Movies addMovies(
		long id, String name, double rating, java.util.Date release_date,
		int length_min) {

		return getService().addMovies(
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
	public static Movies addMovies(Movies movies) {
		return getService().addMovies(movies);
	}

	public static Movies addMovies(
		String name, double rating, java.util.Date release_date,
		int length_min) {

		return getService().addMovies(name, rating, release_date, length_min);
	}

	/**
	 * Creates a new movies with the primary key. Does not add the movies to the database.
	 *
	 * @param id the primary key for the new movies
	 * @return the new movies
	 */
	public static Movies createMovies(long id) {
		return getService().createMovies(id);
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
	public static Movies deleteMovies(long id) throws PortalException {
		return getService().deleteMovies(id);
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
	public static Movies deleteMovies(Movies movies) {
		return getService().deleteMovies(movies);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Movies fetchMovies(long id) {
		return getService().fetchMovies(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Object[]> getAllTable(long id) {
		return getService().getAllTable(id);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<Object[]> getMovieID(String name) {
		return getService().getMovieID(name);
	}

	public static List<Object[]> getMoviEIdlist(String name) {
		return getService().getMoviEIdlist(name);
	}

	public static List<Object[]> getMoviEIdlist(String name, String cityName) {
		return getService().getMoviEIdlist(name, cityName);
	}

	public static List<Object[]> getMoviEIdlist1(String name) {
		return getService().getMoviEIdlist1(name);
	}

	public static List<Movies> getMovieiiiiiiiii(String name) {
		return getService().getMovieiiiiiiiii(name);
	}

	public static List<Object> getMovieObj(String name) {
		return getService().getMovieObj(name);
	}

	/**
	 * Returns the movies with the primary key.
	 *
	 * @param id the primary key of the movies
	 * @return the movies
	 * @throws PortalException if a movies with the primary key could not be found
	 */
	public static Movies getMovies(long id) throws PortalException {
		return getService().getMovies(id);
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
	public static List<Movies> getMovieses(int start, int end) {
		return getService().getMovieses(start, end);
	}

	/**
	 * Returns the number of movieses.
	 *
	 * @return the number of movieses
	 */
	public static int getMoviesesCount() {
		return getService().getMoviesesCount();
	}

	public static List<Movies[]> getMovieThird(String name) {
		return getService().getMovieThird(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static Movies updateMovies(Movies movies) {
		return getService().updateMovies(movies);
	}

	public static MoviesLocalService getService() {
		return _service;
	}

	private static volatile MoviesLocalService _service;

}