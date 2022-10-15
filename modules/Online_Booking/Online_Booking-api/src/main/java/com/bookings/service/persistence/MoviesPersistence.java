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

import com.bookings.exception.NoSuchMoviesException;
import com.bookings.model.Movies;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the movies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MoviesUtil
 * @generated
 */
@ProviderType
public interface MoviesPersistence extends BasePersistence<Movies> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MoviesUtil} to access the movies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Movies> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the movieses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching movieses
	 */
	public java.util.List<Movies> findByUuid(String uuid);

	/**
	 * Returns a range of all the movieses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of movieses
	 * @param end the upper bound of the range of movieses (not inclusive)
	 * @return the range of matching movieses
	 */
	public java.util.List<Movies> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the movieses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of movieses
	 * @param end the upper bound of the range of movieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching movieses
	 */
	public java.util.List<Movies> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Movies>
			orderByComparator);

	/**
	 * Returns an ordered range of all the movieses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of movieses
	 * @param end the upper bound of the range of movieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching movieses
	 */
	public java.util.List<Movies> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Movies>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movies
	 * @throws NoSuchMoviesException if a matching movies could not be found
	 */
	public Movies findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Movies>
				orderByComparator)
		throws NoSuchMoviesException;

	/**
	 * Returns the first movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movies, or <code>null</code> if a matching movies could not be found
	 */
	public Movies fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Movies>
			orderByComparator);

	/**
	 * Returns the last movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movies
	 * @throws NoSuchMoviesException if a matching movies could not be found
	 */
	public Movies findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Movies>
				orderByComparator)
		throws NoSuchMoviesException;

	/**
	 * Returns the last movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movies, or <code>null</code> if a matching movies could not be found
	 */
	public Movies fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Movies>
			orderByComparator);

	/**
	 * Returns the movieses before and after the current movies in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current movies
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next movies
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	public Movies[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Movies>
				orderByComparator)
		throws NoSuchMoviesException;

	/**
	 * Removes all the movieses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of movieses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching movieses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the movies in the entity cache if it is enabled.
	 *
	 * @param movies the movies
	 */
	public void cacheResult(Movies movies);

	/**
	 * Caches the movieses in the entity cache if it is enabled.
	 *
	 * @param movieses the movieses
	 */
	public void cacheResult(java.util.List<Movies> movieses);

	/**
	 * Creates a new movies with the primary key. Does not add the movies to the database.
	 *
	 * @param id the primary key for the new movies
	 * @return the new movies
	 */
	public Movies create(long id);

	/**
	 * Removes the movies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the movies
	 * @return the movies that was removed
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	public Movies remove(long id) throws NoSuchMoviesException;

	public Movies updateImpl(Movies movies);

	/**
	 * Returns the movies with the primary key or throws a <code>NoSuchMoviesException</code> if it could not be found.
	 *
	 * @param id the primary key of the movies
	 * @return the movies
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	public Movies findByPrimaryKey(long id) throws NoSuchMoviesException;

	/**
	 * Returns the movies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the movies
	 * @return the movies, or <code>null</code> if a movies with the primary key could not be found
	 */
	public Movies fetchByPrimaryKey(long id);

	/**
	 * Returns all the movieses.
	 *
	 * @return the movieses
	 */
	public java.util.List<Movies> findAll();

	/**
	 * Returns a range of all the movieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movieses
	 * @param end the upper bound of the range of movieses (not inclusive)
	 * @return the range of movieses
	 */
	public java.util.List<Movies> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the movieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movieses
	 * @param end the upper bound of the range of movieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of movieses
	 */
	public java.util.List<Movies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Movies>
			orderByComparator);

	/**
	 * Returns an ordered range of all the movieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MoviesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movieses
	 * @param end the upper bound of the range of movieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of movieses
	 */
	public java.util.List<Movies> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Movies>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the movieses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of movieses.
	 *
	 * @return the number of movieses
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}