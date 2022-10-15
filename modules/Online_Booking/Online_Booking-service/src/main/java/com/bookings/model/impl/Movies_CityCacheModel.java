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

package com.bookings.model.impl;

import com.bookings.model.Movies_City;
import com.bookings.service.persistence.Movies_CityPK;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Movies_City in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Movies_CityCacheModel
	implements CacheModel<Movies_City>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Movies_CityCacheModel)) {
			return false;
		}

		Movies_CityCacheModel movies_CityCacheModel =
			(Movies_CityCacheModel)object;

		if (movies_CityPK.equals(movies_CityCacheModel.movies_CityPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, movies_CityPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{movie_id=");
		sb.append(movie_id);
		sb.append(", city_id=");
		sb.append(city_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Movies_City toEntityModel() {
		Movies_CityImpl movies_CityImpl = new Movies_CityImpl();

		movies_CityImpl.setMovie_id(movie_id);
		movies_CityImpl.setCity_id(city_id);

		movies_CityImpl.resetOriginalValues();

		return movies_CityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		movie_id = objectInput.readLong();

		city_id = objectInput.readLong();

		movies_CityPK = new Movies_CityPK(movie_id, city_id);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(movie_id);

		objectOutput.writeLong(city_id);
	}

	public long movie_id;
	public long city_id;
	public transient Movies_CityPK movies_CityPK;

}