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

package com.bookings.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Movies_City}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Movies_City
 * @generated
 */
public class Movies_CityWrapper
	implements ModelWrapper<Movies_City>, Movies_City {

	public Movies_CityWrapper(Movies_City movies_City) {
		_movies_City = movies_City;
	}

	@Override
	public Class<?> getModelClass() {
		return Movies_City.class;
	}

	@Override
	public String getModelClassName() {
		return Movies_City.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("movie_id", getMovie_id());
		attributes.put("city_id", getCity_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long movie_id = (Long)attributes.get("movie_id");

		if (movie_id != null) {
			setMovie_id(movie_id);
		}

		Long city_id = (Long)attributes.get("city_id");

		if (city_id != null) {
			setCity_id(city_id);
		}
	}

	@Override
	public Object clone() {
		return new Movies_CityWrapper((Movies_City)_movies_City.clone());
	}

	@Override
	public int compareTo(Movies_City movies_City) {
		return _movies_City.compareTo(movies_City);
	}

	/**
	 * Returns the city_id of this movies_ city.
	 *
	 * @return the city_id of this movies_ city
	 */
	@Override
	public long getCity_id() {
		return _movies_City.getCity_id();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _movies_City.getExpandoBridge();
	}

	/**
	 * Returns the movie_id of this movies_ city.
	 *
	 * @return the movie_id of this movies_ city
	 */
	@Override
	public long getMovie_id() {
		return _movies_City.getMovie_id();
	}

	/**
	 * Returns the primary key of this movies_ city.
	 *
	 * @return the primary key of this movies_ city
	 */
	@Override
	public com.bookings.service.persistence.Movies_CityPK getPrimaryKey() {
		return _movies_City.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _movies_City.getPrimaryKeyObj();
	}

	@Override
	public int hashCode() {
		return _movies_City.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _movies_City.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _movies_City.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _movies_City.isNew();
	}

	@Override
	public void persist() {
		_movies_City.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_movies_City.setCachedModel(cachedModel);
	}

	/**
	 * Sets the city_id of this movies_ city.
	 *
	 * @param city_id the city_id of this movies_ city
	 */
	@Override
	public void setCity_id(long city_id) {
		_movies_City.setCity_id(city_id);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_movies_City.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_movies_City.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_movies_City.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the movie_id of this movies_ city.
	 *
	 * @param movie_id the movie_id of this movies_ city
	 */
	@Override
	public void setMovie_id(long movie_id) {
		_movies_City.setMovie_id(movie_id);
	}

	@Override
	public void setNew(boolean n) {
		_movies_City.setNew(n);
	}

	/**
	 * Sets the primary key of this movies_ city.
	 *
	 * @param primaryKey the primary key of this movies_ city
	 */
	@Override
	public void setPrimaryKey(
		com.bookings.service.persistence.Movies_CityPK primaryKey) {

		_movies_City.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_movies_City.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Movies_City>
		toCacheModel() {

		return _movies_City.toCacheModel();
	}

	@Override
	public Movies_City toEscapedModel() {
		return new Movies_CityWrapper(_movies_City.toEscapedModel());
	}

	@Override
	public String toString() {
		return _movies_City.toString();
	}

	@Override
	public Movies_City toUnescapedModel() {
		return new Movies_CityWrapper(_movies_City.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _movies_City.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Movies_CityWrapper)) {
			return false;
		}

		Movies_CityWrapper movies_CityWrapper = (Movies_CityWrapper)object;

		if (Objects.equals(_movies_City, movies_CityWrapper._movies_City)) {
			return true;
		}

		return false;
	}

	@Override
	public Movies_City getWrappedModel() {
		return _movies_City;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _movies_City.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _movies_City.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_movies_City.resetOriginalValues();
	}

	private final Movies_City _movies_City;

}