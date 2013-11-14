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

package com.liferay.support.standup.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link GlobalInformation}.
 * </p>
 *
 * @author Daniel Javorszky
 * @see GlobalInformation
 * @generated
 */
public class GlobalInformationWrapper implements GlobalInformation,
	ModelWrapper<GlobalInformation> {
	public GlobalInformationWrapper(GlobalInformation globalInformation) {
		_globalInformation = globalInformation;
	}

	@Override
	public Class<?> getModelClass() {
		return GlobalInformation.class;
	}

	@Override
	public String getModelClassName() {
		return GlobalInformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("globalInformationId", getGlobalInformationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("date", getDate());
		attributes.put("message", getMessage());
		attributes.put("display", getDisplay());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long globalInformationId = (Long)attributes.get("globalInformationId");

		if (globalInformationId != null) {
			setGlobalInformationId(globalInformationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Integer display = (Integer)attributes.get("display");

		if (display != null) {
			setDisplay(display);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this global information.
	*
	* @return the primary key of this global information
	*/
	@Override
	public long getPrimaryKey() {
		return _globalInformation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this global information.
	*
	* @param primaryKey the primary key of this global information
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_globalInformation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the global information ID of this global information.
	*
	* @return the global information ID of this global information
	*/
	@Override
	public long getGlobalInformationId() {
		return _globalInformation.getGlobalInformationId();
	}

	/**
	* Sets the global information ID of this global information.
	*
	* @param globalInformationId the global information ID of this global information
	*/
	@Override
	public void setGlobalInformationId(long globalInformationId) {
		_globalInformation.setGlobalInformationId(globalInformationId);
	}

	/**
	* Returns the company ID of this global information.
	*
	* @return the company ID of this global information
	*/
	@Override
	public long getCompanyId() {
		return _globalInformation.getCompanyId();
	}

	/**
	* Sets the company ID of this global information.
	*
	* @param companyId the company ID of this global information
	*/
	@Override
	public void setCompanyId(long companyId) {
		_globalInformation.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this global information.
	*
	* @return the group ID of this global information
	*/
	@Override
	public long getGroupId() {
		return _globalInformation.getGroupId();
	}

	/**
	* Sets the group ID of this global information.
	*
	* @param groupId the group ID of this global information
	*/
	@Override
	public void setGroupId(long groupId) {
		_globalInformation.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this global information.
	*
	* @return the user ID of this global information
	*/
	@Override
	public long getUserId() {
		return _globalInformation.getUserId();
	}

	/**
	* Sets the user ID of this global information.
	*
	* @param userId the user ID of this global information
	*/
	@Override
	public void setUserId(long userId) {
		_globalInformation.setUserId(userId);
	}

	/**
	* Returns the user uuid of this global information.
	*
	* @return the user uuid of this global information
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _globalInformation.getUserUuid();
	}

	/**
	* Sets the user uuid of this global information.
	*
	* @param userUuid the user uuid of this global information
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_globalInformation.setUserUuid(userUuid);
	}

	/**
	* Returns the date of this global information.
	*
	* @return the date of this global information
	*/
	@Override
	public java.util.Date getDate() {
		return _globalInformation.getDate();
	}

	/**
	* Sets the date of this global information.
	*
	* @param date the date of this global information
	*/
	@Override
	public void setDate(java.util.Date date) {
		_globalInformation.setDate(date);
	}

	/**
	* Returns the message of this global information.
	*
	* @return the message of this global information
	*/
	@Override
	public java.lang.String getMessage() {
		return _globalInformation.getMessage();
	}

	/**
	* Sets the message of this global information.
	*
	* @param message the message of this global information
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_globalInformation.setMessage(message);
	}

	/**
	* Returns the display of this global information.
	*
	* @return the display of this global information
	*/
	@Override
	public java.lang.Integer getDisplay() {
		return _globalInformation.getDisplay();
	}

	/**
	* Sets the display of this global information.
	*
	* @param display the display of this global information
	*/
	@Override
	public void setDisplay(java.lang.Integer display) {
		_globalInformation.setDisplay(display);
	}

	/**
	* Returns the status of this global information.
	*
	* @return the status of this global information
	*/
	@Override
	public java.lang.Integer getStatus() {
		return _globalInformation.getStatus();
	}

	/**
	* Sets the status of this global information.
	*
	* @param status the status of this global information
	*/
	@Override
	public void setStatus(java.lang.Integer status) {
		_globalInformation.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _globalInformation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_globalInformation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _globalInformation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_globalInformation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _globalInformation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _globalInformation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_globalInformation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _globalInformation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_globalInformation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_globalInformation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_globalInformation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GlobalInformationWrapper((GlobalInformation)_globalInformation.clone());
	}

	@Override
	public int compareTo(GlobalInformation globalInformation) {
		return _globalInformation.compareTo(globalInformation);
	}

	@Override
	public int hashCode() {
		return _globalInformation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<GlobalInformation> toCacheModel() {
		return _globalInformation.toCacheModel();
	}

	@Override
	public GlobalInformation toEscapedModel() {
		return new GlobalInformationWrapper(_globalInformation.toEscapedModel());
	}

	@Override
	public GlobalInformation toUnescapedModel() {
		return new GlobalInformationWrapper(_globalInformation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _globalInformation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _globalInformation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_globalInformation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GlobalInformationWrapper)) {
			return false;
		}

		GlobalInformationWrapper globalInformationWrapper = (GlobalInformationWrapper)obj;

		if (Validator.equals(_globalInformation,
					globalInformationWrapper._globalInformation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public GlobalInformation getWrappedGlobalInformation() {
		return _globalInformation;
	}

	@Override
	public GlobalInformation getWrappedModel() {
		return _globalInformation;
	}

	@Override
	public void resetOriginalValues() {
		_globalInformation.resetOriginalValues();
	}

	private GlobalInformation _globalInformation;
}