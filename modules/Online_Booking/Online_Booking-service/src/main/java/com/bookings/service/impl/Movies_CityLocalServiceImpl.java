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
import com.bookings.model.impl.CityImpl;
import com.bookings.model.impl.MoviesImpl;
import com.bookings.model.impl.Movies_CityImpl;
import com.bookings.service.base.Movies_CityLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class Movies_CityLocalServiceImpl
	extends Movies_CityLocalServiceBaseImpl 
	{
	
	public Movies_City addMovies_City(long movie_id,long city_id)
	{
		Movies_City mc=new Movies_CityImpl();
		
		mc.setMovie_id(movie_id);
		mc.setCity_id(city_id);
		
		movies_CityLocalService.addMovies_City(mc);
				
		
		
		return mc;
	}
	
	
	public List<Object[]>  getAllTable(String moviename,String cityname)
	{
		Session session=movies_CityPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select m.id_,c.city_id"+
				 " from Movies m join Movies_City mc on m.id_=mc.movie_id join"+
				 " City c on mc.city_id=c.city_id"+
				 " where m.name= ? and c.city_Name= ? "
				 );
		 
		 query.setCacheable(false);
		 query.addEntity("Movies", MoviesImpl.class);
		 query.addEntity("City", CityImpl.class);
		 
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(moviename);
		 pos.add(cityname);
		 
		 return query.list();
	}
	
	
	
	
}