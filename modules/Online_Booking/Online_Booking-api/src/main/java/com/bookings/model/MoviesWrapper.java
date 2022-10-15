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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Movies}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Movies
 * @generated
 */
public class MoviesWrapper implements ModelWrapper<Movies>, Movies {

	public MoviesWrapper(Movies movies) {
		_movies = movies;
	}

	@Override
	public Class<?> getModelClass() {
		return Movies.class;
	}

	@Override
	public String getModelClassName() {
		return Movies.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("rating", getRating());
		attributes.put("release_date", getRelease_date());
		attributes.put("length_min", getLength_min());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Double rating = (Double)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}

		Date release_date = (Date)attributes.get("release_date");

		if (release_date != null) {
			setRelease_date(release_date);
		}

		Integer length_min = (Integer)attributes.get("length_min");

		if (length_min != null) {
			setLength_min(length_min);
		}
	}

	@Override
	public Object clone() {
		return new MoviesWrapper((Movies)_movies.clone());
	}

	@Override
	public int compareTo(Movies movies) {
		return _movies.compareTo(movies);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _movies.getExpandoBridge();
	}

	/**
	 * Returns the ID of this movies.
	 *
	 * @return the ID of this movies
	 */
	@Override
	public long getId() {
		return _movies.getId();
	}

	/**
	 * Returns the length_min of this movies.
	 *
	 * @return the length_min of this movies
	 */
	@Override
	public int getLength_min() {
		return _movies.getLength_min();
	}

	/**
	 * Returns the name of this movies.
	 *
	 * @return the name of this movies
	 */
	@Override
	public String getName() {
		return _movies.getName();
	}

	/**
	 * Returns the primary key of this movies.
	 *
	 * @return the primary key of this movies
	 */
	@Override
	public long getPrimaryKey() {
		return _movies.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _movies.getPrimaryKeyObj();
	}

	/**
	 * Returns the rating of this movies.
	 *
	 * @return the rating of this movies
	 */
	@Override
	public Double getRating() {
		return _movies.getRating();
	}

	/**
	 * Returns the release_date of this movies.
	 *
	 * @return the release_date of this movies
	 */
	@Override
	public Date getRelease_date() {
		return _movies.getRelease_date();
	}

	/**
	 * Returns the uuid of this movies.
	 *
	 * @return the uuid of this movies
	 */
	@Override
	public String getUuid() {
		return _movies.getUuid();
	}

	@Override
	public int hashCode() {
		return _movies.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _movies.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _movies.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _movies.isNew();
	}

	@Override
	public void persist() {
		_movies.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_movies.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_movies.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_movies.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_movies.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the ID of this movies.
	 *
	 * @param id the ID of this movies
	 */
	@Override
	public void setId(long id) {
		_movies.setId(id);
	}

	/**
	 * Sets the length_min of this movies.
	 *
	 * @param length_min the length_min of this movies
	 */
	@Override
	public void setLength_min(int length_min) {
		_movies.setLength_min(length_min);
	}

	/**
	 * Sets the name of this movies.
	 *
	 * @param name the name of this movies
	 */
	@Override
	public void setName(String name) {
		_movies.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_movies.setNew(n);
	}

	/**
	 * Sets the primary key of this movies.
	 *
	 * @param primaryKey the primary key of this movies
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_movies.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_movies.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the rating of this movies.
	 *
	 * @param rating the rating of this movies
	 */
	@Override
	public void setRating(Double rating) {
		_movies.setRating(rating);
	}

	/**
	 * Sets the release_date of this movies.
	 *
	 * @param release_date the release_date of this movies
	 */
	@Override
	public void setRelease_date(Date release_date) {
		_movies.setRelease_date(release_date);
	}

	/**
	 * Sets the uuid of this movies.
	 *
	 * @param uuid the uuid of this movies
	 */
	@Override
	public void setUuid(String uuid) {
		_movies.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Movies> toCacheModel() {
		return _movies.toCacheModel();
	}

	@Override
	public Movies toEscapedModel() {
		return new MoviesWrapper(_movies.toEscapedModel());
	}

	@Override
	public String toString() {
		return _movies.toString();
	}

	@Override
	public Movies toUnescapedModel() {
		return new MoviesWrapper(_movies.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _movies.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MoviesWrapper)) {
			return false;
		}

		MoviesWrapper moviesWrapper = (MoviesWrapper)object;

		if (Objects.equals(_movies, moviesWrapper._movies)) {
			return true;
		}

		return false;
	}

	@Override
	public Movies getWrappedModel() {
		return _movies;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _movies.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _movies.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_movies.resetOriginalValues();
	}

	private final Movies _movies;

}