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

import com.bookings.model.Movies;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Movies in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MoviesCacheModel implements CacheModel<Movies>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MoviesCacheModel)) {
			return false;
		}

		MoviesCacheModel moviesCacheModel = (MoviesCacheModel)object;

		if (id == moviesCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", rating=");
		sb.append(rating);
		sb.append(", release_date=");
		sb.append(release_date);
		sb.append(", length_min=");
		sb.append(length_min);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Movies toEntityModel() {
		MoviesImpl moviesImpl = new MoviesImpl();

		if (uuid == null) {
			moviesImpl.setUuid("");
		}
		else {
			moviesImpl.setUuid(uuid);
		}

		moviesImpl.setId(id);

		if (name == null) {
			moviesImpl.setName("");
		}
		else {
			moviesImpl.setName(name);
		}

		moviesImpl.setRating(rating);

		if (release_date == Long.MIN_VALUE) {
			moviesImpl.setRelease_date(null);
		}
		else {
			moviesImpl.setRelease_date(new Date(release_date));
		}

		moviesImpl.setLength_min(length_min);

		moviesImpl.resetOriginalValues();

		return moviesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		name = objectInput.readUTF();

		rating = objectInput.readDouble();
		release_date = objectInput.readLong();

		length_min = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeDouble(rating);
		objectOutput.writeLong(release_date);

		objectOutput.writeInt(length_min);
	}

	public String uuid;
	public long id;
	public String name;
	public double rating;
	public long release_date;
	public int length_min;

}