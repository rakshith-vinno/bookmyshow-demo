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

import com.bookings.model.Movies;
import com.bookings.model.impl.MoviesImpl;
import com.bookings.service.base.MoviesServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author Brian Wing Shun Chan
 */
public class MoviesServiceImpl extends MoviesServiceBaseImpl 
{
	public Movies addMovies(long id,String name,double rating, Date release_date,int length_min)
	{
		
		
		return 	moviesLocalService.addMovies(id, name, rating, release_date, length_min);	
		
		
	}
	
	public Movies addMovies(String name,double rating, Date release_date,int length_min)
	{
		
		
		return moviesLocalService.addMovies(name, rating, release_date, length_min);
	}
	
	
	
	
	
	
	
	
	
	
	public List<Movies> getMovies(int startIndex,int lastIndex)
	{
		
		List<Movies> movies=new ArrayList<Movies>();
		
		movies=moviesLocalService.getMovieses(startIndex, lastIndex);
		
		return movies;
	}
	
	public int getMoviesCount()
	{
		return moviesLocalService.getMoviesesCount();
	}
	
	
	
	
}