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
import com.bookings.model.Movies_City;
import com.bookings.model.impl.Movies_CityImpl;
import com.bookings.service.base.Movies_CityServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class Movies_CityServiceImpl extends Movies_CityServiceBaseImpl 
{
	public Movies_City addMovies_City(long movie_id,long city_id)
	{
		
		
		
		return movies_CityLocalService.addMovies_City(movie_id, city_id);
	}
	
	
	public List<Movies_City> getMovies_City(int startIndex,int lastIndex)
	{
		
		List<Movies_City> movies_City=new ArrayList<Movies_City>();
		
		movies_City=movies_CityLocalService.getMovies_Cities(startIndex, lastIndex);
		
		return movies_City;
	}
	
	public int getMovies_CityCount()
	{
		return movies_CityLocalService.getMovies_CitiesCount();
	}
}