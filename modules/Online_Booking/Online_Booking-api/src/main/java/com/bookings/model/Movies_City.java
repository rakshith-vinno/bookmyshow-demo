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

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Movies_City service. Represents a row in the &quot;Movies_City&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityModel
 * @generated
 */
@ImplementationClassName("com.bookings.model.impl.Movies_CityImpl")
@ProviderType
public interface Movies_City extends Movies_CityModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.bookings.model.impl.Movies_CityImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Movies_City, Long> MOVIE_ID_ACCESSOR =
		new Accessor<Movies_City, Long>() {

			@Override
			public Long get(Movies_City movies_City) {
				return movies_City.getMovie_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Movies_City> getTypeClass() {
				return Movies_City.class;
			}

		};
	public static final Accessor<Movies_City, Long> CITY_ID_ACCESSOR =
		new Accessor<Movies_City, Long>() {

			@Override
			public Long get(Movies_City movies_City) {
				return movies_City.getCity_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Movies_City> getTypeClass() {
				return Movies_City.class;
			}

		};

}