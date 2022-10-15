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

import com.bookings.exception.NoSuchMovies_CityException;
import com.bookings.model.Movies_City;
import com.bookings.model.impl.Movies_CityImpl;
import com.bookings.model.impl.Movies_CityModelImpl;
import com.bookings.service.persistence.Movies_CityPK;
import com.bookings.service.persistence.Movies_CityPersistence;
import com.bookings.service.persistence.Movies_CityUtil;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the movies_ city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Movies_CityPersistenceImpl
	extends BasePersistenceImpl<Movies_City> implements Movies_CityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Movies_CityUtil</code> to access the movies_ city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Movies_CityImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public Movies_CityPersistenceImpl() {
		setModelClass(Movies_City.class);
	}

	/**
	 * Caches the movies_ city in the entity cache if it is enabled.
	 *
	 * @param movies_City the movies_ city
	 */
	@Override
	public void cacheResult(Movies_City movies_City) {
		entityCache.putResult(
			Movies_CityModelImpl.ENTITY_CACHE_ENABLED, Movies_CityImpl.class,
			movies_City.getPrimaryKey(), movies_City);

		movies_City.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the movies_ cities in the entity cache if it is enabled.
	 *
	 * @param movies_Cities the movies_ cities
	 */
	@Override
	public void cacheResult(List<Movies_City> movies_Cities) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (movies_Cities.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Movies_City movies_City : movies_Cities) {
			if (entityCache.getResult(
					Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
					Movies_CityImpl.class, movies_City.getPrimaryKey()) ==
						null) {

				cacheResult(movies_City);
			}
			else {
				movies_City.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all movies_ cities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Movies_CityImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the movies_ city.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Movies_City movies_City) {
		entityCache.removeResult(
			Movies_CityModelImpl.ENTITY_CACHE_ENABLED, Movies_CityImpl.class,
			movies_City.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Movies_City> movies_Cities) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Movies_City movies_City : movies_Cities) {
			entityCache.removeResult(
				Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
				Movies_CityImpl.class, movies_City.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
				Movies_CityImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new movies_ city with the primary key. Does not add the movies_ city to the database.
	 *
	 * @param movies_CityPK the primary key for the new movies_ city
	 * @return the new movies_ city
	 */
	@Override
	public Movies_City create(Movies_CityPK movies_CityPK) {
		Movies_City movies_City = new Movies_CityImpl();

		movies_City.setNew(true);
		movies_City.setPrimaryKey(movies_CityPK);

		return movies_City;
	}

	/**
	 * Removes the movies_ city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city that was removed
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	@Override
	public Movies_City remove(Movies_CityPK movies_CityPK)
		throws NoSuchMovies_CityException {

		return remove((Serializable)movies_CityPK);
	}

	/**
	 * Removes the movies_ city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the movies_ city
	 * @return the movies_ city that was removed
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	@Override
	public Movies_City remove(Serializable primaryKey)
		throws NoSuchMovies_CityException {

		Session session = null;

		try {
			session = openSession();

			Movies_City movies_City = (Movies_City)session.get(
				Movies_CityImpl.class, primaryKey);

			if (movies_City == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMovies_CityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(movies_City);
		}
		catch (NoSuchMovies_CityException noSuchEntityException) {
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
	protected Movies_City removeImpl(Movies_City movies_City) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(movies_City)) {
				movies_City = (Movies_City)session.get(
					Movies_CityImpl.class, movies_City.getPrimaryKeyObj());
			}

			if (movies_City != null) {
				session.delete(movies_City);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (movies_City != null) {
			clearCache(movies_City);
		}

		return movies_City;
	}

	@Override
	public Movies_City updateImpl(Movies_City movies_City) {
		boolean isNew = movies_City.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(movies_City);

				movies_City.setNew(false);
			}
			else {
				movies_City = (Movies_City)session.merge(movies_City);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			Movies_CityModelImpl.ENTITY_CACHE_ENABLED, Movies_CityImpl.class,
			movies_City.getPrimaryKey(), movies_City, false);

		movies_City.resetOriginalValues();

		return movies_City;
	}

	/**
	 * Returns the movies_ city with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the movies_ city
	 * @return the movies_ city
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	@Override
	public Movies_City findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMovies_CityException {

		Movies_City movies_City = fetchByPrimaryKey(primaryKey);

		if (movies_City == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMovies_CityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return movies_City;
	}

	/**
	 * Returns the movies_ city with the primary key or throws a <code>NoSuchMovies_CityException</code> if it could not be found.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city
	 * @throws NoSuchMovies_CityException if a movies_ city with the primary key could not be found
	 */
	@Override
	public Movies_City findByPrimaryKey(Movies_CityPK movies_CityPK)
		throws NoSuchMovies_CityException {

		return findByPrimaryKey((Serializable)movies_CityPK);
	}

	/**
	 * Returns the movies_ city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the movies_ city
	 * @return the movies_ city, or <code>null</code> if a movies_ city with the primary key could not be found
	 */
	@Override
	public Movies_City fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			Movies_CityModelImpl.ENTITY_CACHE_ENABLED, Movies_CityImpl.class,
			primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Movies_City movies_City = (Movies_City)serializable;

		if (movies_City == null) {
			Session session = null;

			try {
				session = openSession();

				movies_City = (Movies_City)session.get(
					Movies_CityImpl.class, primaryKey);

				if (movies_City != null) {
					cacheResult(movies_City);
				}
				else {
					entityCache.putResult(
						Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
						Movies_CityImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
					Movies_CityImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return movies_City;
	}

	/**
	 * Returns the movies_ city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param movies_CityPK the primary key of the movies_ city
	 * @return the movies_ city, or <code>null</code> if a movies_ city with the primary key could not be found
	 */
	@Override
	public Movies_City fetchByPrimaryKey(Movies_CityPK movies_CityPK) {
		return fetchByPrimaryKey((Serializable)movies_CityPK);
	}

	@Override
	public Map<Serializable, Movies_City> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Movies_City> map =
			new HashMap<Serializable, Movies_City>();

		for (Serializable primaryKey : primaryKeys) {
			Movies_City movies_City = fetchByPrimaryKey(primaryKey);

			if (movies_City != null) {
				map.put(primaryKey, movies_City);
			}
		}

		return map;
	}

	/**
	 * Returns all the movies_ cities.
	 *
	 * @return the movies_ cities
	 */
	@Override
	public List<Movies_City> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Movies_City> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Movies_City> findAll(
		int start, int end, OrderByComparator<Movies_City> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Movies_City> findAll(
		int start, int end, OrderByComparator<Movies_City> orderByComparator,
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

		List<Movies_City> list = null;

		if (useFinderCache) {
			list = (List<Movies_City>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MOVIES_CITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MOVIES_CITY;

				sql = sql.concat(Movies_CityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Movies_City>)QueryUtil.list(
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
	 * Removes all the movies_ cities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Movies_City movies_City : findAll()) {
			remove(movies_City);
		}
	}

	/**
	 * Returns the number of movies_ cities.
	 *
	 * @return the number of movies_ cities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MOVIES_CITY);

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
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Movies_CityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the movies_ city persistence.
	 */
	public void afterPropertiesSet() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
			Movies_CityModelImpl.FINDER_CACHE_ENABLED, Movies_CityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
			Movies_CityModelImpl.FINDER_CACHE_ENABLED, Movies_CityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			Movies_CityModelImpl.ENTITY_CACHE_ENABLED,
			Movies_CityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_setMovies_CityUtilPersistence(this);
	}

	public void destroy() {
		_setMovies_CityUtilPersistence(null);

		entityCache.removeCache(Movies_CityImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setMovies_CityUtilPersistence(
		Movies_CityPersistence movies_CityPersistence) {

		try {
			Field field = Movies_CityUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, movies_CityPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MOVIES_CITY =
		"SELECT movies_City FROM Movies_City movies_City";

	private static final String _SQL_COUNT_MOVIES_CITY =
		"SELECT COUNT(movies_City) FROM Movies_City movies_City";

	private static final String _ORDER_BY_ENTITY_ALIAS = "movies_City.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Movies_City exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		Movies_CityPersistenceImpl.class);

	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"movie_id", "city_id"});

}