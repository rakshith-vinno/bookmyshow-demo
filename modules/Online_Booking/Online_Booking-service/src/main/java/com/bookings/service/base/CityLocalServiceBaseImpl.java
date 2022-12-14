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

package com.bookings.service.base;

import com.bookings.model.City;
import com.bookings.service.CityLocalService;
import com.bookings.service.CityLocalServiceUtil;
import com.bookings.service.persistence.CityPersistence;
import com.bookings.service.persistence.MoviesPersistence;
import com.bookings.service.persistence.Movies_CityPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the city local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.bookings.service.impl.CityLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bookings.service.impl.CityLocalServiceImpl
 * @generated
 */
public abstract class CityLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements CityLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CityLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>CityLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public City addCity(City city) {
		city.setNew(true);

		return cityPersistence.update(city);
	}

	/**
	 * Creates a new city with the primary key. Does not add the city to the database.
	 *
	 * @param city_id the primary key for the new city
	 * @return the new city
	 */
	@Override
	@Transactional(enabled = false)
	public City createCity(long city_id) {
		return cityPersistence.create(city_id);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public City deleteCity(long city_id) throws PortalException {
		return cityPersistence.remove(city_id);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public City deleteCity(City city) {
		return cityPersistence.remove(city);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			City.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return cityPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return cityPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return cityPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return cityPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return cityPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public City fetchCity(long city_id) {
		return cityPersistence.fetchByPrimaryKey(city_id);
	}

	/**
	 * Returns the city with the primary key.
	 *
	 * @param city_id the primary key of the city
	 * @return the city
	 * @throws PortalException if a city with the primary key could not be found
	 */
	@Override
	public City getCity(long city_id) throws PortalException {
		return cityPersistence.findByPrimaryKey(city_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(cityLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(City.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("city_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(cityLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(City.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("city_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(cityLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(City.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("city_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return cityLocalService.deleteCity((City)persistedModel);
	}

	public BasePersistence<City> getBasePersistence() {
		return cityPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cityPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<City> getCities(int start, int end) {
		return cityPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of cities.
	 *
	 * @return the number of cities
	 */
	@Override
	public int getCitiesCount() {
		return cityPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public City updateCity(City city) {
		return cityPersistence.update(city);
	}

	/**
	 * Returns the city local service.
	 *
	 * @return the city local service
	 */
	public CityLocalService getCityLocalService() {
		return cityLocalService;
	}

	/**
	 * Sets the city local service.
	 *
	 * @param cityLocalService the city local service
	 */
	public void setCityLocalService(CityLocalService cityLocalService) {
		this.cityLocalService = cityLocalService;
	}

	/**
	 * Returns the city persistence.
	 *
	 * @return the city persistence
	 */
	public CityPersistence getCityPersistence() {
		return cityPersistence;
	}

	/**
	 * Sets the city persistence.
	 *
	 * @param cityPersistence the city persistence
	 */
	public void setCityPersistence(CityPersistence cityPersistence) {
		this.cityPersistence = cityPersistence;
	}

	/**
	 * Returns the movies local service.
	 *
	 * @return the movies local service
	 */
	public com.bookings.service.MoviesLocalService getMoviesLocalService() {
		return moviesLocalService;
	}

	/**
	 * Sets the movies local service.
	 *
	 * @param moviesLocalService the movies local service
	 */
	public void setMoviesLocalService(
		com.bookings.service.MoviesLocalService moviesLocalService) {

		this.moviesLocalService = moviesLocalService;
	}

	/**
	 * Returns the movies persistence.
	 *
	 * @return the movies persistence
	 */
	public MoviesPersistence getMoviesPersistence() {
		return moviesPersistence;
	}

	/**
	 * Sets the movies persistence.
	 *
	 * @param moviesPersistence the movies persistence
	 */
	public void setMoviesPersistence(MoviesPersistence moviesPersistence) {
		this.moviesPersistence = moviesPersistence;
	}

	/**
	 * Returns the movies_ city local service.
	 *
	 * @return the movies_ city local service
	 */
	public com.bookings.service.Movies_CityLocalService
		getMovies_CityLocalService() {

		return movies_CityLocalService;
	}

	/**
	 * Sets the movies_ city local service.
	 *
	 * @param movies_CityLocalService the movies_ city local service
	 */
	public void setMovies_CityLocalService(
		com.bookings.service.Movies_CityLocalService movies_CityLocalService) {

		this.movies_CityLocalService = movies_CityLocalService;
	}

	/**
	 * Returns the movies_ city persistence.
	 *
	 * @return the movies_ city persistence
	 */
	public Movies_CityPersistence getMovies_CityPersistence() {
		return movies_CityPersistence;
	}

	/**
	 * Sets the movies_ city persistence.
	 *
	 * @param movies_CityPersistence the movies_ city persistence
	 */
	public void setMovies_CityPersistence(
		Movies_CityPersistence movies_CityPersistence) {

		this.movies_CityPersistence = movies_CityPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register(
			"com.bookings.model.City", cityLocalService);

		_setLocalServiceUtilService(cityLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.bookings.model.City");

		_setLocalServiceUtilService(null);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CityLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return City.class;
	}

	protected String getModelClassName() {
		return City.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = cityPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		CityLocalService cityLocalService) {

		try {
			Field field = CityLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, cityLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@BeanReference(type = CityLocalService.class)
	protected CityLocalService cityLocalService;

	@BeanReference(type = CityPersistence.class)
	protected CityPersistence cityPersistence;

	@BeanReference(type = com.bookings.service.MoviesLocalService.class)
	protected com.bookings.service.MoviesLocalService moviesLocalService;

	@BeanReference(type = MoviesPersistence.class)
	protected MoviesPersistence moviesPersistence;

	@BeanReference(type = com.bookings.service.Movies_CityLocalService.class)
	protected com.bookings.service.Movies_CityLocalService
		movies_CityLocalService;

	@BeanReference(type = Movies_CityPersistence.class)
	protected Movies_CityPersistence movies_CityPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry
		persistedModelLocalServiceRegistry;

}