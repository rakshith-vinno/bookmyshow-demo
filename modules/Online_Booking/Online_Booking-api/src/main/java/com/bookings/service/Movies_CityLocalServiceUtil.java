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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Movies_City. This utility wraps
 * <code>com.bookings.service.impl.Movies_CityLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityLocalService
 * @generated
 */
public class Movies_CityLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bookings.service.impl.Movies_CityLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Movies_City addMovies_City(long movie_id, long city_id) {
		return getService().addMovies_City(movie_id, city_id);
	}

	/**
	 * Adds the movies_ city to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Movies_CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movies_City the movies_ city
	 * @return the movies_ city that was added
	 */
	public static Movies_City addMovies_City(Movies_City movies_City) {
		return getService().addMovies_City(movies_City);
	}

	/**
	 * Creates a new movies_ city with the primary key. Does not add the movies_ city to the database.
	 *
	 * @param movies_CityPK the primary key for the new movies_ city
	 * @return the new movies_ city
	 */
	public static Movies_City createMovies_City(
		com.bookings.service.persistence.Movies_CityPK movies_CityPK) {

		return getService().createMovies_City(movies_CityPK);
	}

	/**
	 * Deletes the movies_ city from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Movies_CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movies_City the movies_ city
	 * @return the movies_ city that was removed
	 */
	public static Movies_City deleteMovies_City(Movies_City movies_City) {
		return getService().deleteMovies_City(movies_City);
	}

	/**
	 * Deletes the movies_ city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Movies_CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city that was removed
	 * @throws PortalException if a movies_ city with the primary key could not be found
	 */
	public static Movies_City deleteMovies_City(
			com.bookings.service.persistence.Movies_CityPK movies_CityPK)
		throws PortalException {

		return getService().deleteMovies_City(movies_CityPK);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.Movies_CityModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.Movies_CityModelImpl</code>.
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

	public static Movies_City fetchMovies_City(
		com.bookings.service.persistence.Movies_CityPK movies_CityPK) {

		return getService().fetchMovies_City(movies_CityPK);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Object[]> getAllTable(
		String moviename, String cityname) {

		return getService().getAllTable(moviename, cityname);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the movies_ cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.Movies_CityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movies_ cities
	 * @param end the upper bound of the range of movies_ cities (not inclusive)
	 * @return the range of movies_ cities
	 */
	public static List<Movies_City> getMovies_Cities(int start, int end) {
		return getService().getMovies_Cities(start, end);
	}

	/**
	 * Returns the number of movies_ cities.
	 *
	 * @return the number of movies_ cities
	 */
	public static int getMovies_CitiesCount() {
		return getService().getMovies_CitiesCount();
	}

	/**
	 * Returns the movies_ city with the primary key.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city
	 * @throws PortalException if a movies_ city with the primary key could not be found
	 */
	public static Movies_City getMovies_City(
			com.bookings.service.persistence.Movies_CityPK movies_CityPK)
		throws PortalException {

		return getService().getMovies_City(movies_CityPK);
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
	 * Updates the movies_ city in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Movies_CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movies_City the movies_ city
	 * @return the movies_ city that was updated
	 */
	public static Movies_City updateMovies_City(Movies_City movies_City) {
		return getService().updateMovies_City(movies_City);
	}

	public static Movies_CityLocalService getService() {
		return _service;
	}

	private static volatile Movies_CityLocalService _service;

}