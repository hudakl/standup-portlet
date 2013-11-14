/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.support.standup.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GlobalInformationLocalService}.
 *
 * @author Daniel Javorszky
 * @see GlobalInformationLocalService
 * @generated
 */
public class GlobalInformationLocalServiceWrapper
	implements GlobalInformationLocalService,
		ServiceWrapper<GlobalInformationLocalService> {
	public GlobalInformationLocalServiceWrapper(
		GlobalInformationLocalService globalInformationLocalService) {
		_globalInformationLocalService = globalInformationLocalService;
	}

	/**
	* Adds the global information to the database. Also notifies the appropriate model listeners.
	*
	* @param globalInformation the global information
	* @return the global information that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.GlobalInformation addGlobalInformation(
		com.liferay.support.standup.model.GlobalInformation globalInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.addGlobalInformation(globalInformation);
	}

	/**
	* Creates a new global information with the primary key. Does not add the global information to the database.
	*
	* @param globalInformationId the primary key for the new global information
	* @return the new global information
	*/
	@Override
	public com.liferay.support.standup.model.GlobalInformation createGlobalInformation(
		long globalInformationId) {
		return _globalInformationLocalService.createGlobalInformation(globalInformationId);
	}

	/**
	* Deletes the global information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param globalInformationId the primary key of the global information
	* @return the global information that was removed
	* @throws PortalException if a global information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.GlobalInformation deleteGlobalInformation(
		long globalInformationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.deleteGlobalInformation(globalInformationId);
	}

	/**
	* Deletes the global information from the database. Also notifies the appropriate model listeners.
	*
	* @param globalInformation the global information
	* @return the global information that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.GlobalInformation deleteGlobalInformation(
		com.liferay.support.standup.model.GlobalInformation globalInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.deleteGlobalInformation(globalInformation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _globalInformationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.standup.model.impl.GlobalInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.standup.model.impl.GlobalInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.support.standup.model.GlobalInformation fetchGlobalInformation(
		long globalInformationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.fetchGlobalInformation(globalInformationId);
	}

	/**
	* Returns the global information with the primary key.
	*
	* @param globalInformationId the primary key of the global information
	* @return the global information
	* @throws PortalException if a global information with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.GlobalInformation getGlobalInformation(
		long globalInformationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.getGlobalInformation(globalInformationId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the global informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.standup.model.impl.GlobalInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of global informations
	* @param end the upper bound of the range of global informations (not inclusive)
	* @return the range of global informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.support.standup.model.GlobalInformation> getGlobalInformations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.getGlobalInformations(start, end);
	}

	/**
	* Returns the number of global informations.
	*
	* @return the number of global informations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getGlobalInformationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.getGlobalInformationsCount();
	}

	/**
	* Updates the global information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param globalInformation the global information
	* @return the global information that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.GlobalInformation updateGlobalInformation(
		com.liferay.support.standup.model.GlobalInformation globalInformation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformationLocalService.updateGlobalInformation(globalInformation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _globalInformationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_globalInformationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _globalInformationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public GlobalInformationLocalService getWrappedGlobalInformationLocalService() {
		return _globalInformationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedGlobalInformationLocalService(
		GlobalInformationLocalService globalInformationLocalService) {
		_globalInformationLocalService = globalInformationLocalService;
	}

	@Override
	public GlobalInformationLocalService getWrappedService() {
		return _globalInformationLocalService;
	}

	@Override
	public void setWrappedService(
		GlobalInformationLocalService globalInformationLocalService) {
		_globalInformationLocalService = globalInformationLocalService;
	}

	private GlobalInformationLocalService _globalInformationLocalService;
}