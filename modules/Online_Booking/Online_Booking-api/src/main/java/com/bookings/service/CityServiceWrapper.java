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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CityService}.
 *
 * @author Brian Wing Shun Chan
 * @see CityService
 * @generated
 */
public class CityServiceWrapper
	implements CityService, ServiceWrapper<CityService> {

	public CityServiceWrapper(CityService cityService) {
		_cityService = cityService;
	}

	@Override
	public com.bookings.model.City addCity(long city_id, String city_Name) {
		return _cityService.addCity(city_id, city_Name);
	}

	@Override
	public com.bookings.model.City addCity(String city_Name) {
		return _cityService.addCity(city_Name);
	}

	@Override
	public java.util.List<com.bookings.model.City> getCity(
		int startIndex, int lastIndex) {

		return _cityService.getCity(startIndex, lastIndex);
	}

	@Override
	public int getCityCount() {
		return _cityService.getCityCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cityService.getOSGiServiceIdentifier();
	}

	@Override
	public CityService getWrappedService() {
		return _cityService;
	}

	@Override
	public void setWrappedService(CityService cityService) {
		_cityService = cityService;
	}

	private CityService _cityService;

}