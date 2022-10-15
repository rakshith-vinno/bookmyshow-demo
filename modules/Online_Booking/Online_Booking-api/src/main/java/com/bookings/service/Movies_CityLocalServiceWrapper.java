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
 * Provides a wrapper for {@link Movies_CityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityLocalService
 * @generated
 */
public class Movies_CityLocalServiceWrapper
	implements Movies_CityLocalService,
			   ServiceWrapper<Movies_CityLocalService> {

	public Movies_CityLocalServiceWrapper(
		Movies_CityLocalService movies_CityLocalService) {

		_movies_CityLocalService = movies_CityLocalService;
	}

	@Override
	public com.bookings.model.Movies_City addMovies_City(
		long movie_id, long city_id) {

		return _movies_CityLocalService.addMovies_City(movie_id, city_id);
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
	@Override
	public com.bookings.model.Movies_City addMovies_City(
		com.bookings.model.Movies_City movies_City) {

		return _movies_CityLocalService.addMovies_City(movies_City);
	}

	/**
	 * Creates a new movies_ city with the primary key. Does not add the movies_ city to the database.
	 *
	 * @param movies_CityPK the primary key for the new movies_ city
	 * @return the new movies_ city
	 */
	@Override
	public com.bookings.model.Movies_City createMovies_City(
		com.bookings.service.persistence.Movies_CityPK movies_CityPK) {

		return _movies_CityLocalService.createMovies_City(movies_CityPK);
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
	@Override
	public com.bookings.model.Movies_City deleteMovies_City(
		com.bookings.model.Movies_City movies_City) {

		return _movies_CityLocalService.deleteMovies_City(movies_City);
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
	@Override
	public com.bookings.model.Movies_City deleteMovies_City(
			com.bookings.service.persistence.Movies_CityPK movies_CityPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movies_CityLocalService.deleteMovies_City(movies_CityPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movies_CityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _movies_CityLocalService.dynamicQuery();
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

		return _movies_CityLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _movies_CityLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _movies_CityLocalService.dynamicQuery(
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

		return _movies_CityLocalService.dynamicQueryCount(dynamicQuery);
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

		return _movies_CityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.bookings.model.Movies_City fetchMovies_City(
		com.bookings.service.persistence.Movies_CityPK movies_CityPK) {

		return _movies_CityLocalService.fetchMovies_City(movies_CityPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _movies_CityLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<Object[]> getAllTable(
		String moviename, String cityname) {

		return _movies_CityLocalService.getAllTable(moviename, cityname);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _movies_CityLocalService.getIndexableActionableDynamicQuery();
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
	@Override
	public java.util.List<com.bookings.model.Movies_City> getMovies_Cities(
		int start, int end) {

		return _movies_CityLocalService.getMovies_Cities(start, end);
	}

	/**
	 * Returns the number of movies_ cities.
	 *
	 * @return the number of movies_ cities
	 */
	@Override
	public int getMovies_CitiesCount() {
		return _movies_CityLocalService.getMovies_CitiesCount();
	}

	/**
	 * Returns the movies_ city with the primary key.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city
	 * @throws PortalException if a movies_ city with the primary key could not be found
	 */
	@Override
	public com.bookings.model.Movies_City getMovies_City(
			com.bookings.service.persistence.Movies_CityPK movies_CityPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movies_CityLocalService.getMovies_City(movies_CityPK);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _movies_CityLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movies_CityLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.bookings.model.Movies_City updateMovies_City(
		com.bookings.model.Movies_City movies_City) {

		return _movies_CityLocalService.updateMovies_City(movies_City);
	}

	@Override
	public Movies_CityLocalService getWrappedService() {
		return _movies_CityLocalService;
	}

	@Override
	public void setWrappedService(
		Movies_CityLocalService movies_CityLocalService) {

		_movies_CityLocalService = movies_CityLocalService;
	}

	private Movies_CityLocalService _movies_CityLocalService;

}