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
import com.bookings.service.base.CityLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class CityLocalServiceImpl extends CityLocalServiceBaseImpl
{
	public List<Object[]>  getAllTable(String  cityname)
	{
		Session session=cityPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  m.name, m.rating, m.release_date, m.length_min "
		 		+ " from Movies m join Movies_City mc on "
		 		+ " m.id_=mc.movie_id join City c on mc.city_id=c.city_id"
		 		+ " where c.city_Name=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(cityname);
		 
		 return query.list();
	}
	
	
	
	
	
	
	
	
	
	public City addCity(long city_id,String city_Name)
	{
		City c=new CityImpl();
		
		c.setCity_id(city_id);
		c.setCity_Name(city_Name);
		
		cityLocalService.addCity(c);
				
		
		
		return c;
	}
	
	
	
	
	public List<City[]>  getCityThird(String cityname)
	{
		Session session=moviesPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select  c.city_id, c.city_Name"
		 		+ " from City c "
		 		+ " where c.city_Name=?");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 pos.add(cityname);
		 
		 return query.list();
	}
	
	
	public City addCity(String city_Name)
	{
		City c=new CityImpl();
		
		//c.setCity_id(city_id);
		c.setCity_Name(city_Name);
		
		cityLocalService.addCity(c);
		return c;
	}
	
	
	public List<City>  getCity()
	{
		Session session=cityPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select * "
		 		+ " from City c ");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 
		 return (List<City>) query.list();

	}
	
	public List<City[]>  getCityAllTable()
	{
		Session session=cityPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select * "
		 		+ " from City c ");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 
		 return (List<City[]>) query.list();
	}
	public List<Object[]>  getCityObject()
	{
		Session session=cityPersistence.openSession();
		 SQLQuery query=session.createSQLQuery(
				 "select * "
		 		+ " from City c ");
		 
		 QueryPos pos=QueryPos.getInstance(query);
		 
		 return  query.list();
	}
}