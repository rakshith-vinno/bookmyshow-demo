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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bookings.service.http.CityServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CitySoap implements Serializable {

	public static CitySoap toSoapModel(City model) {
		CitySoap soapModel = new CitySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCity_id(model.getCity_id());
		soapModel.setCity_Name(model.getCity_Name());

		return soapModel;
	}

	public static CitySoap[] toSoapModels(City[] models) {
		CitySoap[] soapModels = new CitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CitySoap[][] toSoapModels(City[][] models) {
		CitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CitySoap[] toSoapModels(List<City> models) {
		List<CitySoap> soapModels = new ArrayList<CitySoap>(models.size());

		for (City model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CitySoap[soapModels.size()]);
	}

	public CitySoap() {
	}

	public long getPrimaryKey() {
		return _city_id;
	}

	public void setPrimaryKey(long pk) {
		setCity_id(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCity_id() {
		return _city_id;
	}

	public void setCity_id(long city_id) {
		_city_id = city_id;
	}

	public String getCity_Name() {
		return _city_Name;
	}

	public void setCity_Name(String city_Name) {
		_city_Name = city_Name;
	}

	private String _uuid;
	private long _city_id;
	private String _city_Name;

}