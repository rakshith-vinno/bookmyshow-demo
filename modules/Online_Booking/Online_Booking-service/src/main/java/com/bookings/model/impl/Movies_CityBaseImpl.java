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
import com.bookings.service.Movies_CityLocalServiceUtil;

/**
 * The extended model base implementation for the Movies_City service. Represents a row in the &quot;Movies_City&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Movies_CityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityImpl
 * @see Movies_City
 * @generated
 */
public abstract class Movies_CityBaseImpl
	extends Movies_CityModelImpl implements Movies_City {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a movies_ city model instance should use the <code>Movies_City</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			Movies_CityLocalServiceUtil.addMovies_City(this);
		}
		else {
			Movies_CityLocalServiceUtil.updateMovies_City(this);
		}
	}

}