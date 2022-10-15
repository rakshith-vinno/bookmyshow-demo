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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bookings.service.http.MoviesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MoviesSoap implements Serializable {

	public static MoviesSoap toSoapModel(Movies model) {
		MoviesSoap soapModel = new MoviesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setRating(model.getRating());
		soapModel.setRelease_date(model.getRelease_date());
		soapModel.setLength_min(model.getLength_min());

		return soapModel;
	}

	public static MoviesSoap[] toSoapModels(Movies[] models) {
		MoviesSoap[] soapModels = new MoviesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MoviesSoap[][] toSoapModels(Movies[][] models) {
		MoviesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MoviesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MoviesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MoviesSoap[] toSoapModels(List<Movies> models) {
		List<MoviesSoap> soapModels = new ArrayList<MoviesSoap>(models.size());

		for (Movies model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MoviesSoap[soapModels.size()]);
	}

	public MoviesSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Double getRating() {
		return _rating;
	}

	public void setRating(Double rating) {
		_rating = rating;
	}

	public Date getRelease_date() {
		return _release_date;
	}

	public void setRelease_date(Date release_date) {
		_release_date = release_date;
	}

	public int getLength_min() {
		return _length_min;
	}

	public void setLength_min(int length_min) {
		_length_min = length_min;
	}

	private String _uuid;
	private long _id;
	private String _name;
	private Double _rating;
	private Date _release_date;
	private int _length_min;

}