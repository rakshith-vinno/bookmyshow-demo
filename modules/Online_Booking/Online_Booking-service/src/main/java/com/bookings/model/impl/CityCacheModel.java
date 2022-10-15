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

import com.bookings.model.City;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing City in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CityCacheModel implements CacheModel<City>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CityCacheModel)) {
			return false;
		}

		CityCacheModel cityCacheModel = (CityCacheModel)object;

		if (city_id == cityCacheModel.city_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, city_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", city_id=");
		sb.append(city_id);
		sb.append(", city_Name=");
		sb.append(city_Name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public City toEntityModel() {
		CityImpl cityImpl = new CityImpl();

		if (uuid == null) {
			cityImpl.setUuid("");
		}
		else {
			cityImpl.setUuid(uuid);
		}

		cityImpl.setCity_id(city_id);

		if (city_Name == null) {
			cityImpl.setCity_Name("");
		}
		else {
			cityImpl.setCity_Name(city_Name);
		}

		cityImpl.resetOriginalValues();

		return cityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		city_id = objectInput.readLong();
		city_Name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(city_id);

		if (city_Name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city_Name);
		}
	}

	public String uuid;
	public long city_id;
	public String city_Name;

}