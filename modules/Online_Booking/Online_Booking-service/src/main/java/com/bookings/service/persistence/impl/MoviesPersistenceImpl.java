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

package com.bookings.service.persistence.impl;

import com.bookings.exception.NoSuchMoviesException;
import com.bookings.model.Movies;
import com.bookings.model.impl.MoviesImpl;
import com.bookings.model.impl.MoviesModelImpl;
import com.bookings.service.persistence.MoviesPersistence;
import com.bookings.service.persistence.MoviesUtil;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the movies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MoviesPersistenceImpl
	extends BasePersistenceImpl<Movies> implements MoviesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MoviesUtil</code> to access the movies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MoviesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the movieses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching movieses
	 */
	@Override
	public List<Movies> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Movies> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Movies> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Movies> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Movies> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Movies> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Movies> list = null;

		if (useFinderCache) {
			list = (List<Movies>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Movies movies : list) {
					if (!uuid.equals(movies.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MOVIES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MoviesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Movies>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movies
	 * @throws NoSuchMoviesException if a matching movies could not be found
	 */
	@Override
	public Movies findByUuid_First(
			String uuid, OrderByComparator<Movies> orderByComparator)
		throws NoSuchMoviesException {

		Movies movies = fetchByUuid_First(uuid, orderByComparator);

		if (movies != null) {
			return movies;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMoviesException(sb.toString());
	}

	/**
	 * Returns the first movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movies, or <code>null</code> if a matching movies could not be found
	 */
	@Override
	public Movies fetchByUuid_First(
		String uuid, OrderByComparator<Movies> orderByComparator) {

		List<Movies> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movies
	 * @throws NoSuchMoviesException if a matching movies could not be found
	 */
	@Override
	public Movies findByUuid_Last(
			String uuid, OrderByComparator<Movies> orderByComparator)
		throws NoSuchMoviesException {

		Movies movies = fetchByUuid_Last(uuid, orderByComparator);

		if (movies != null) {
			return movies;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMoviesException(sb.toString());
	}

	/**
	 * Returns the last movies in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movies, or <code>null</code> if a matching movies could not be found
	 */
	@Override
	public Movies fetchByUuid_Last(
		String uuid, OrderByComparator<Movies> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Movies> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the movieses before and after the current movies in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current movies
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next movies
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	@Override
	public Movies[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Movies> orderByComparator)
		throws NoSuchMoviesException {

		uuid = Objects.toString(uuid, "");

		Movies movies = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Movies[] array = new MoviesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, movies, uuid, orderByComparator, true);

			array[1] = movies;

			array[2] = getByUuid_PrevAndNext(
				session, movies, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Movies getByUuid_PrevAndNext(
		Session session, Movies movies, String uuid,
		OrderByComparator<Movies> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MOVIES_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MoviesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(movies)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Movies> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the movieses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Movies movies :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(movies);
		}
	}

	/**
	 * Returns the number of movieses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching movieses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MOVIES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "movies.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(movies.uuid IS NULL OR movies.uuid = '')";

	public MoviesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("id", "id_");

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
				"_dbColumnNames");

			field.setAccessible(true);

			field.set(this, dbColumnNames);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception, exception);
			}
		}

		setModelClass(Movies.class);
	}

	/**
	 * Caches the movies in the entity cache if it is enabled.
	 *
	 * @param movies the movies
	 */
	@Override
	public void cacheResult(Movies movies) {
		entityCache.putResult(
			MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
			movies.getPrimaryKey(), movies);

		movies.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the movieses in the entity cache if it is enabled.
	 *
	 * @param movieses the movieses
	 */
	@Override
	public void cacheResult(List<Movies> movieses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (movieses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Movies movies : movieses) {
			if (entityCache.getResult(
					MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
					movies.getPrimaryKey()) == null) {

				cacheResult(movies);
			}
			else {
				movies.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all movieses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MoviesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the movies.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Movies movies) {
		entityCache.removeResult(
			MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
			movies.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Movies> movieses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Movies movies : movieses) {
			entityCache.removeResult(
				MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
				movies.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
				primaryKey);
		}
	}

	/**
	 * Creates a new movies with the primary key. Does not add the movies to the database.
	 *
	 * @param id the primary key for the new movies
	 * @return the new movies
	 */
	@Override
	public Movies create(long id) {
		Movies movies = new MoviesImpl();

		movies.setNew(true);
		movies.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		movies.setUuid(uuid);

		return movies;
	}

	/**
	 * Removes the movies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the movies
	 * @return the movies that was removed
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	@Override
	public Movies remove(long id) throws NoSuchMoviesException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the movies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the movies
	 * @return the movies that was removed
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	@Override
	public Movies remove(Serializable primaryKey) throws NoSuchMoviesException {
		Session session = null;

		try {
			session = openSession();

			Movies movies = (Movies)session.get(MoviesImpl.class, primaryKey);

			if (movies == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMoviesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(movies);
		}
		catch (NoSuchMoviesException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Movies removeImpl(Movies movies) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(movies)) {
				movies = (Movies)session.get(
					MoviesImpl.class, movies.getPrimaryKeyObj());
			}

			if (movies != null) {
				session.delete(movies);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (movies != null) {
			clearCache(movies);
		}

		return movies;
	}

	@Override
	public Movies updateImpl(Movies movies) {
		boolean isNew = movies.isNew();

		if (!(movies instanceof MoviesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(movies.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(movies);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in movies proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Movies implementation " +
					movies.getClass());
		}

		MoviesModelImpl moviesModelImpl = (MoviesModelImpl)movies;

		if (Validator.isNull(movies.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			movies.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(movies);

				movies.setNew(false);
			}
			else {
				movies = (Movies)session.merge(movies);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!MoviesModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {moviesModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((moviesModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					moviesModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {moviesModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}
		}

		entityCache.putResult(
			MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
			movies.getPrimaryKey(), movies, false);

		movies.resetOriginalValues();

		return movies;
	}

	/**
	 * Returns the movies with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the movies
	 * @return the movies
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	@Override
	public Movies findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMoviesException {

		Movies movies = fetchByPrimaryKey(primaryKey);

		if (movies == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMoviesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return movies;
	}

	/**
	 * Returns the movies with the primary key or throws a <code>NoSuchMoviesException</code> if it could not be found.
	 *
	 * @param id the primary key of the movies
	 * @return the movies
	 * @throws NoSuchMoviesException if a movies with the primary key could not be found
	 */
	@Override
	public Movies findByPrimaryKey(long id) throws NoSuchMoviesException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the movies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the movies
	 * @return the movies, or <code>null</code> if a movies with the primary key could not be found
	 */
	@Override
	public Movies fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Movies movies = (Movies)serializable;

		if (movies == null) {
			Session session = null;

			try {
				session = openSession();

				movies = (Movies)session.get(MoviesImpl.class, primaryKey);

				if (movies != null) {
					cacheResult(movies);
				}
				else {
					entityCache.putResult(
						MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
					primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return movies;
	}

	/**
	 * Returns the movies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the movies
	 * @return the movies, or <code>null</code> if a movies with the primary key could not be found
	 */
	@Override
	public Movies fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, Movies> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Movies> map = new HashMap<Serializable, Movies>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Movies movies = fetchByPrimaryKey(primaryKey);

			if (movies != null) {
				map.put(primaryKey, movies);
			}

			return map;
		}

		if ((databaseInMaxParameters > 0) &&
			(primaryKeys.size() > databaseInMaxParameters)) {

			Iterator<Serializable> iterator = primaryKeys.iterator();

			while (iterator.hasNext()) {
				Set<Serializable> page = new HashSet<>();

				for (int i = 0;
					 (i < databaseInMaxParameters) && iterator.hasNext(); i++) {

					page.add(iterator.next());
				}

				map.putAll(fetchByPrimaryKeys(page));
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
				primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Movies)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler sb = new StringBundler(
			(uncachedPrimaryKeys.size() * 2) + 1);

		sb.append(_SQL_SELECT_MOVIES_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			sb.append((long)primaryKey);

			sb.append(",");
		}

		sb.setIndex(sb.index() - 1);

		sb.append(")");

		String sql = sb.toString();

		Session session = null;

		try {
			session = openSession();

			Query query = session.createQuery(sql);

			for (Movies movies : (List<Movies>)query.list()) {
				map.put(movies.getPrimaryKeyObj(), movies);

				cacheResult(movies);

				uncachedPrimaryKeys.remove(movies.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					MoviesModelImpl.ENTITY_CACHE_ENABLED, MoviesImpl.class,
					primaryKey, nullModel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the movieses.
	 *
	 * @return the movieses
	 */
	@Override
	public List<Movies> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Movies> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Movies> findAll(
		int start, int end, OrderByComparator<Movies> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Movies> findAll(
		int start, int end, OrderByComparator<Movies> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Movies> list = null;

		if (useFinderCache) {
			list = (List<Movies>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MOVIES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MOVIES;

				sql = sql.concat(MoviesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Movies>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the movieses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Movies movies : findAll()) {
			remove(movies);
		}
	}

	/**
	 * Returns the number of movieses.
	 *
	 * @return the number of movieses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MOVIES);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MoviesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the movies persistence.
	 */
	public void afterPropertiesSet() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			MoviesModelImpl.ENTITY_CACHE_ENABLED,
			MoviesModelImpl.FINDER_CACHE_ENABLED, MoviesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			MoviesModelImpl.ENTITY_CACHE_ENABLED,
			MoviesModelImpl.FINDER_CACHE_ENABLED, MoviesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			MoviesModelImpl.ENTITY_CACHE_ENABLED,
			MoviesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			MoviesModelImpl.ENTITY_CACHE_ENABLED,
			MoviesModelImpl.FINDER_CACHE_ENABLED, MoviesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			MoviesModelImpl.ENTITY_CACHE_ENABLED,
			MoviesModelImpl.FINDER_CACHE_ENABLED, MoviesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			MoviesModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			MoviesModelImpl.ENTITY_CACHE_ENABLED,
			MoviesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_setMoviesUtilPersistence(this);
	}

	public void destroy() {
		_setMoviesUtilPersistence(null);

		entityCache.removeCache(MoviesImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setMoviesUtilPersistence(
		MoviesPersistence moviesPersistence) {

		try {
			Field field = MoviesUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, moviesPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MOVIES =
		"SELECT movies FROM Movies movies";

	private static final String _SQL_SELECT_MOVIES_WHERE_PKS_IN =
		"SELECT movies FROM Movies movies WHERE id_ IN (";

	private static final String _SQL_SELECT_MOVIES_WHERE =
		"SELECT movies FROM Movies movies WHERE ";

	private static final String _SQL_COUNT_MOVIES =
		"SELECT COUNT(movies) FROM Movies movies";

	private static final String _SQL_COUNT_MOVIES_WHERE =
		"SELECT COUNT(movies) FROM Movies movies WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "movies.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Movies exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Movies exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MoviesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "id"});

}