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
 * Provides a wrapper for {@link CityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CityLocalService
 * @generated
 */
public class CityLocalServiceWrapper
	implements CityLocalService, ServiceWrapper<CityLocalService> {

	public CityLocalServiceWrapper(CityLocalService cityLocalService) {
		_cityLocalService = cityLocalService;
	}

	/**
	 * Adds the city to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param city the city
	 * @return the city that was added
	 */
	@Override
	public com.bookings.model.City addCity(com.bookings.model.City city) {
		return _cityLocalService.addCity(city);
	}

	@Override
	public com.bookings.model.City addCity(long city_id, String city_Name) {
		return _cityLocalService.addCity(city_id, city_Name);
	}

	@Override
	public com.bookings.model.City addCity(String city_Name) {
		return _cityLocalService.addCity(city_Name);
	}

	/**
	 * Creates a new city with the primary key. Does not add the city to the database.
	 *
	 * @param city_id the primary key for the new city
	 * @return the new city
	 */
	@Override
	public com.bookings.model.City createCity(long city_id) {
		return _cityLocalService.createCity(city_id);
	}

	/**
	 * Deletes the city from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param city the city
	 * @return the city that was removed
	 */
	@Override
	public com.bookings.model.City deleteCity(com.bookings.model.City city) {
		return _cityLocalService.deleteCity(city);
	}

	/**
	 * Deletes the city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param city_id the primary key of the city
	 * @return the city that was removed
	 * @throws PortalException if a city with the primary key could not be found
	 */
	@Override
	public com.bookings.model.City deleteCity(long city_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cityLocalService.deleteCity(city_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cityLocalService.dynamicQuery();
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

		return _cityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.CityModelImpl</code>.
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

		return _cityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.CityModelImpl</code>.
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

		return _cityLocalService.dynamicQuery(
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

		return _cityLocalService.dynamicQueryCount(dynamicQuery);
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

		return _cityLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.bookings.model.City fetchCity(long city_id) {
		return _cityLocalService.fetchCity(city_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cityLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bookings.model.impl.CityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cities
	 * @param end the upper bound of the range of cities (not inclusive)
	 * @return the range of cities
	 */
	@Override
	public java.util.List<com.bookings.model.City> getCities(
		int start, int end) {

		return _cityLocalService.getCities(start, end);
	}

	/**
	 * Returns the number of cities.
	 *
	 * @return the number of cities
	 */
	@Override
	public int getCitiesCount() {
		return _cityLocalService.getCitiesCount();
	}

	@Override
	public java.util.List<com.bookings.model.City> getCity() {
		return _cityLocalService.getCity();
	}

	/**
	 * Returns the city with the primary key.
	 *
	 * @param city_id the primary key of the city
	 * @return the city
	 * @throws PortalException if a city with the primary key could not be found
	 */
	@Override
	public com.bookings.model.City getCity(long city_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cityLocalService.getCity(city_id);
	}

	@Override
	public java.util.List<com.bookings.model.City[]> getCityAllTable() {
		return _cityLocalService.getCityAllTable();
	}

	@Override
	public java.util.List<Object[]> getCityObject() {
		return _cityLocalService.getCityObject();
	}

	@Override
	public java.util.List<com.bookings.model.City[]> getCityThird(
		String cityname) {

		return _cityLocalService.getCityThird(cityname);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cityLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the city in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param city the city
	 * @return the city that was updated
	 */
	@Override
	public com.bookings.model.City updateCity(com.bookings.model.City city) {
		return _cityLocalService.updateCity(city);
	}

	@Override
	public CityLocalService getWrappedService() {
		return _cityLocalService;
	}

	@Override
	public void setWrappedService(CityLocalService cityLocalService) {
		_cityLocalService = cityLocalService;
	}

	private CityLocalService _cityLocalService;

}