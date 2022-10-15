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

import aQute.bnd.annotation.ProviderType;

import com.bookings.exception.NoSuchMovies_CityException;
import com.bookings.model.Movies_City;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the movies_ city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityUtil
 * @generated
 */
@ProviderType
public interface Movies_CityPersistence extends BasePersistence<Movies_City> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Movies_CityUtil} to access the movies_ city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Movies_City> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Caches the movies_ city in the entity cache if it is enabled.
	 *
	 * @param movies_City the movies_ city
	 */
	public void cacheResult(Movies_City movies_City);

	/**
	 * Caches the movies_ cities in the entity cache if it is enabled.
	 *
	 * @param movies_Cities the movies_ cities
	 */
	public void cacheResult(java.util.List<Movies_City> movies_Cities);

	/**
	 * Creates a new movies_ city with the primary key. Does not add the movies_ city to the database.
	 *
	 * @param movies_CityPK the primary key for the new movies_ city
	 * @return the new movies_ city
	 */
	public Movies_City create(Movies_CityPK movies_CityPK);

	/**
	 * Removes the movies_ city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city that was removed
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	public Movies_City remove(Movies_CityPK movies_CityPK)
		throws NoSuchMovies_CityException;

	public Movies_City updateImpl(Movies_City movies_City);

	/**
	 * Returns the movies_ city with the primary key or throws a <code>NoSuchMovies_CityException</code> if it could not be found.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	public Movies_City findByPrimaryKey(Movies_CityPK movies_CityPK)
		throws NoSuchMovies_CityException;

	/**
	 * Returns the movies_ city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city, or <code>null</code> if a movies_ city with the primary key could not be found
	 */
	public Movies_City fetchByPrimaryKey(Movies_CityPK movies_CityPK);

	/**
	 * Returns all the movies_ cities.
	 *
	 * @return the movies_ cities
	 */
	public java.util.List<Movies_City> findAll();

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
	public java.util.List<Movies_City> findAll(int start, int end);

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
	public java.util.List<Movies_City> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Movies_City>
			orderByComparator);

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
	public java.util.List<Movies_City> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Movies_City>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the movies_ cities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of movies_ cities.
	 *
	 * @return the number of movies_ cities
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}