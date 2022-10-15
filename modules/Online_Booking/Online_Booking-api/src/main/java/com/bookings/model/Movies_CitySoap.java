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

import com.bookings.service.persistence.Movies_CityPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bookings.service.http.Movies_CityServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Movies_CitySoap implements Serializable {

	public static Movies_CitySoap toSoapModel(Movies_City model) {
		Movies_CitySoap soapModel = new Movies_CitySoap();

		soapModel.setMovie_id(model.getMovie_id());
		soapModel.setCity_id(model.getCity_id());

		return soapModel;
	}

	public static Movies_CitySoap[] toSoapModels(Movies_City[] models) {
		Movies_CitySoap[] soapModels = new Movies_CitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Movies_CitySoap[][] toSoapModels(Movies_City[][] models) {
		Movies_CitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Movies_CitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new Movies_CitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Movies_CitySoap[] toSoapModels(List<Movies_City> models) {
		List<Movies_CitySoap> soapModels = new ArrayList<Movies_CitySoap>(
			models.size());

		for (Movies_City model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Movies_CitySoap[soapModels.size()]);
	}

	public Movies_CitySoap() {
	}

	public Movies_CityPK getPrimaryKey() {
		return new Movies_CityPK(_movie_id, _city_id);
	}

	public void setPrimaryKey(Movies_CityPK pk) {
		setMovie_id(pk.movie_id);
		setCity_id(pk.city_id);
	}

	public long getMovie_id() {
		return _movie_id;
	}

	public void setMovie_id(long movie_id) {
		_movie_id = movie_id;
	}

	public long getCity_id() {
		return _city_id;
	}

	public void setCity_id(long city_id) {
		_city_id = city_id;
	}

	private long _movie_id;
	private long _city_id;

}