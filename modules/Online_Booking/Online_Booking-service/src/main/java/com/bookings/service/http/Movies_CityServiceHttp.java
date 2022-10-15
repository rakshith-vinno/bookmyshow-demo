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

package com.bookings.service.http;

import com.bookings.service.Movies_CityServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>Movies_CityServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Movies_CityServiceSoap
 * @generated
 */
public class Movies_CityServiceHttp {

	public static com.bookings.model.Movies_City addMovies_City(
		HttpPrincipal httpPrincipal, long movie_id, long city_id) {

		try {
			MethodKey methodKey = new MethodKey(
				Movies_CityServiceUtil.class, "addMovies_City",
				_addMovies_CityParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, movie_id, city_id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bookings.model.Movies_City)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.bookings.model.Movies_City> getMovies_City(
		HttpPrincipal httpPrincipal, int startIndex, int lastIndex) {

		try {
			MethodKey methodKey = new MethodKey(
				Movies_CityServiceUtil.class, "getMovies_City",
				_getMovies_CityParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, startIndex, lastIndex);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.bookings.model.Movies_City>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getMovies_CityCount(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				Movies_CityServiceUtil.class, "getMovies_CityCount",
				_getMovies_CityCountParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		Movies_CityServiceHttp.class);

	private static final Class<?>[] _addMovies_CityParameterTypes0 =
		new Class[] {long.class, long.class};
	private static final Class<?>[] _getMovies_CityParameterTypes1 =
		new Class[] {int.class, int.class};
	private static final Class<?>[] _getMovies_CityCountParameterTypes2 =
		new Class[] {};

}