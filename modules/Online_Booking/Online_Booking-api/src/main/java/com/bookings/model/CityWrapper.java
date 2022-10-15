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
 * This class is a wrapper for {@link City}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see City
 * @generated
 */
public class CityWrapper implements City, ModelWrapper<City> {

	public CityWrapper(City city) {
		_city = city;
	}

	@Override
	public Class<?> getModelClass() {
		return City.class;
	}

	@Override
	public String getModelClassName() {
		return City.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("city_id", getCity_id());
		attributes.put("city_Name", getCity_Name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long city_id = (Long)attributes.get("city_id");

		if (city_id != null) {
			setCity_id(city_id);
		}

		String city_Name = (String)attributes.get("city_Name");

		if (city_Name != null) {
			setCity_Name(city_Name);
		}
	}

	@Override
	public Object clone() {
		return new CityWrapper((City)_city.clone());
	}

	@Override
	public int compareTo(City city) {
		return _city.compareTo(city);
	}

	/**
	 * Returns the city_id of this city.
	 *
	 * @return the city_id of this city
	 */
	@Override
	public long getCity_id() {
		return _city.getCity_id();
	}

	/**
	 * Returns the city_ name of this city.
	 *
	 * @return the city_ name of this city
	 */
	@Override
	public String getCity_Name() {
		return _city.getCity_Name();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _city.getExpandoBridge();
	}

	/**
	 * Returns the primary key of this city.
	 *
	 * @return the primary key of this city
	 */
	@Override
	public long getPrimaryKey() {
		return _city.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _city.getPrimaryKeyObj();
	}

	/**
	 * Returns the uuid of this city.
	 *
	 * @return the uuid of this city
	 */
	@Override
	public String getUuid() {
		return _city.getUuid();
	}

	@Override
	public int hashCode() {
		return _city.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _city.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _city.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _city.isNew();
	}

	@Override
	public void persist() {
		_city.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_city.setCachedModel(cachedModel);
	}

	/**
	 * Sets the city_id of this city.
	 *
	 * @param city_id the city_id of this city
	 */
	@Override
	public void setCity_id(long city_id) {
		_city.setCity_id(city_id);
	}

	/**
	 * Sets the city_ name of this city.
	 *
	 * @param city_Name the city_ name of this city
	 */
	@Override
	public void setCity_Name(String city_Name) {
		_city.setCity_Name(city_Name);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_city.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_city.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_city.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_city.setNew(n);
	}

	/**
	 * Sets the primary key of this city.
	 *
	 * @param primaryKey the primary key of this city
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_city.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_city.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the uuid of this city.
	 *
	 * @param uuid the uuid of this city
	 */
	@Override
	public void setUuid(String uuid) {
		_city.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<City> toCacheModel() {
		return _city.toCacheModel();
	}

	@Override
	public City toEscapedModel() {
		return new CityWrapper(_city.toEscapedModel());
	}

	@Override
	public String toString() {
		return _city.toString();
	}

	@Override
	public City toUnescapedModel() {
		return new CityWrapper(_city.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _city.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CityWrapper)) {
			return false;
		}

		CityWrapper cityWrapper = (CityWrapper)object;

		if (Objects.equals(_city, cityWrapper._city)) {
			return true;
		}

		return false;
	}

	@Override
	public City getWrappedModel() {
		return _city;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _city.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _city.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_city.resetOriginalValues();
	}

	private final City _city;

}