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
import com.bookings.service.base.MoviesLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class MoviesLocalServiceImpl extends MoviesLocalServiceBaseImpl
{
	public Movies addMovies(long id,String name,double rating, Date release_date,int length_min)
	{
		Movies m=new MoviesImpl();
		m.setId(id);
		m.setName(name);
		m.setRating(rating);
		m.setRelease_date(release_date);
		m.setLength_min(length_min);
		
		moviesLocalService.addMovies(m);		
		
		
		return m;
	}
	
	public Movies addMovies(String name,double rating, Date release_date,int length_min)
	{
		Movies m=new MoviesImpl();
		//m.setId(id);
		m.setName(name);
		m.setRating(rating);
		m.setRelease_date(release_date);
		m.setLength_min(length_min);
		
		moviesLocalService.addMovies(m);		
		
		
		return m;
	}
	
	public List<Object[]>  getAllTable(long id)
	{
		Session session=moviesPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  m.id_, m.name, m.rating, m.release_date,  c.city_Name,c.city_id  "
		 		+ " from Movies m join Movies_City mc on "
		 		+ " m.id_=mc.movie_id join City c on mc.city_id=c.city_id"
		 		+ " where m.id_=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(id);
		 
		 return query.list();
	}
	
	
	
	public List<Object[]>  getMoviEIdlist(String name)
	{
		Session session=moviesPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  m.id_, m.name, m.rating, m.release_date,  c.city_Name,c.city_id  "
		 		+ " from Movies m join Movies_City mc on "
		 		+ " m.id_=mc.movie_id join City c on mc.city_id=c.city_id"
		 		+ " where m.name=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(name);
		 
		 return query.list();
	}
	
	
	public List<Object[]>  getMovieID(String name)
	{
		Session session=moviesPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  m.id_ "
		 		+ " from Movies m "
		 		+ " where m.name=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(name);
		 
		 return query.list();
	}
	
	public List<Movies[]>  getMovieThird(String name)
	{
		Session session=moviesPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  m.id_,m.name"
		 		+ " from Movies m "
		 		+ " where m.name=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(name);
		 
		 return query.list();
	}
	
	public List<Movies>  getMovieiiiiiiiii(String name)
	{
		Session session=moviesPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  m.*"
		 		+ " from Movies m "
		 		+ " where m.name=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(name);
		 
		 return query.list();
	}
	
	public List<Object>  getMovieObj(String name)
	{
		Session session=moviesPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  m.*"
		 		+ " from Movies m "
		 		+ " where m.name=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(name);
		 
		 return query.list();
	}

	@Override
	public List<Object[]> getMoviEIdlist(String name, String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> getMoviEIdlist1(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}