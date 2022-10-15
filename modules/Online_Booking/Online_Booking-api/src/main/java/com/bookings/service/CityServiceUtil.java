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

package com.bookings.service;

import com.bookings.model.City;

import java.util.List;

/**
 * Provides the remote service utility for City. This utility wraps
 * <code>com.bookings.service.impl.CityServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CityService
 * @generated
 */
public class CityServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bookings.service.impl.CityServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static City addCity(long city_id, String city_Name) {
		return getService().addCity(city_id, city_Name);
	}

	public static City addCity(String city_Name) {
		return getService().addCity(city_Name);
	}

	public static List<City> getCity(int startIndex, int lastIndex) {
		return getService().getCity(startIndex, lastIndex);
	}

	public static int getCityCount() {
		return getService().getCityCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static CityService getService() {
		return _service;
	}

	private static volatile CityService _service;

}