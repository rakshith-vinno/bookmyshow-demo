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

package com.bookings.service.persistence;

import com.bookings.model.Movies_City;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the movies_ city service. This utility wraps <code>com.bookings.service.persistence.impl.Movies_CityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityPersistence
 * @generated
 */
public class Movies_CityUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Movies_City movies_City) {
		getPersistence().clearCache(movies_City);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Movies_City> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Movies_City> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Movies_City> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Movies_City> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Movies_City> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Movies_City update(Movies_City movies_City) {
		return getPersistence().update(movies_City);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Movies_City update(
		Movies_City movies_City, ServiceContext serviceContext) {

		return getPersistence().update(movies_City, serviceContext);
	}

	/**
	 * Caches the movies_ city in the entity cache if it is enabled.
	 *
	 * @param movies_City the movies_ city
	 */
	public static void cacheResult(Movies_City movies_City) {
		getPersistence().cacheResult(movies_City);
	}

	/**
	 * Caches the movies_ cities in the entity cache if it is enabled.
	 *
	 * @param movies_Cities the movies_ cities
	 */
	public static void cacheResult(List<Movies_City> movies_Cities) {
		getPersistence().cacheResult(movies_Cities);
	}

	/**
	 * Creates a new movies_ city with the primary key. Does not add the movies_ city to the database.
	 *
	 * @param movies_CityPK the primary key for the new movies_ city
	 * @return the new movies_ city
	 */
	public static Movies_City create(Movies_CityPK movies_CityPK) {
		return getPersistence().create(movies_CityPK);
	}

	/**
	 * Removes the movies_ city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city that was removed
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	public static Movies_City remove(Movies_CityPK movies_CityPK)
		throws com.bookings.exception.NoSuchMovies_CityException {

		return getPersistence().remove(movies_CityPK);
	}

	public static Movies_City updateImpl(Movies_City movies_City) {
		return getPersistence().updateImpl(movies_City);
	}

	/**
	 * Returns the movies_ city with the primary key or throws a <code>NoSuchMovies_CityException</code> if it could not be found.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	public static Movies_City findByPrimaryKey(Movies_CityPK movies_CityPK)
		throws com.bookings.exception.NoSuchMovies_CityException {

		return getPersistence().findByPrimaryKey(movies_CityPK);
	}

	/**
	 * Returns the movies_ city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city, or <code>null</code> if a movies_ city with the primary key could not be found
	 */
	public static Movies_City fetchByPrimaryKey(Movies_CityPK movies_CityPK) {
		return getPersistence().fetchByPrimaryKey(movies_CityPK);
	}

	/**
	 * Returns all the movies_ cities.
	 *
	 * @return the movies_ cities
	 */
	public static List<Movies_City> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the movies_ cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Movies_CityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movies_ cities
	 * @param end the upper bound of the range of movies_ cities (not inclusive)
	 * @return the range of movies_ cities
	 */
	public static List<Movies_City> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the movies_ cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Movies_CityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movies_ cities
	 * @param end the upper bound of the range of movies_ cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of movies_ cities
	 */
	public static List<Movies_City> findAll(
		int start, int end, OrderByComparator<Movies_City> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the movies_ cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Movies_CityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movies_ cities
	 * @param end the upper bound of the range of movies_ cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of movies_ cities
	 */
	public static List<Movies_City> findAll(
		int start, int end, OrderByComparator<Movies_City> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the movies_ cities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of movies_ cities.
	 *
	 * @return the number of movies_ cities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static Movies_CityPersistence getPersistence() {
		return _persistence;
	}

	private static volatile Movies_CityPersistence _persistence;

}