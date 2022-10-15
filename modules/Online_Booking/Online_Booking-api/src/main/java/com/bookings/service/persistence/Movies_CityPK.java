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

package com.bookings.service.persistence;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Movies_CityPK implements Comparable<Movies_CityPK>, Serializable {

	public long movie_id;
	public long city_id;

	public Movies_CityPK() {
	}

	public Movies_CityPK(long movie_id, long city_id) {
		this.movie_id = movie_id;
		this.city_id = city_id;
	}

	public long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	@Override
	public int compareTo(Movies_CityPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (movie_id < pk.movie_id) {
			value = -1;
		}
		else if (movie_id > pk.movie_id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (city_id < pk.city_id) {
			value = -1;
		}
		else if (city_id > pk.city_id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Movies_CityPK)) {
			return false;
		}

		Movies_CityPK pk = (Movies_CityPK)object;

		if ((movie_id == pk.movie_id) && (city_id == pk.city_id)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, movie_id);
		hashCode = HashUtil.hash(hashCode, city_id);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("movie_id=");

		sb.append(movie_id);
		sb.append(", city_id=");

		sb.append(city_id);

		sb.append("}");

		return sb.toString();
	}

}