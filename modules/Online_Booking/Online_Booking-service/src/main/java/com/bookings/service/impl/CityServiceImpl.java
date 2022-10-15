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

package com.bookings.service.impl;

import com.bookings.model.City;
import com.bookings.model.Movies;
import com.bookings.model.impl.CityImpl;
import com.bookings.service.base.CityServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class CityServiceImpl extends CityServiceBaseImpl
{
	public City addCity(long city_id,String city_Name)
	{
		
		
		
		return cityLocalService.addCity(city_id, city_Name);
	}
	
	
	public City addCity(String city_Name)
	{
		
		return cityLocalService.addCity(city_Name);
	}
	
	
	
	
	
	
	
	public List<City> getCity(int startIndex,int lastIndex)
	{
		
		List<City> city=new ArrayList<City>();
		
		city=cityLocalService.getCities(startIndex, lastIndex);
		
		return city;
	}
	
	public int getCityCount()
	{
		return cityLocalService.getCitiesCount();
	}
}