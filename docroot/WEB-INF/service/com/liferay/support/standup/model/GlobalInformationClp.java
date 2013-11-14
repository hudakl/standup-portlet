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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.support.standup.service.ClpSerializer;
import com.liferay.support.standup.service.GlobalInformationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniel Javorszky
 */
public class GlobalInformationClp extends BaseModelImpl<GlobalInformation>
	implements GlobalInformation {
	public GlobalInformationClp() {
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
	public long getPrimaryKey() {
		return _globalInformationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGlobalInformationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _globalInformationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getGlobalInformationId() {
		return _globalInformationId;
	}

	@Override
	public void setGlobalInformationId(long globalInformationId) {
		_globalInformationId = globalInformationId;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setGlobalInformationId",
						long.class);

				method.invoke(_globalInformationRemoteModel, globalInformationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_globalInformationRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_globalInformationRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_globalInformationRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public void setDate(Date date) {
		_date = date;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", Date.class);

				method.invoke(_globalInformationRemoteModel, date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessage() {
		return _message;
	}

	@Override
	public void setMessage(String message) {
		_message = message;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setMessage", String.class);

				method.invoke(_globalInformationRemoteModel, message);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Integer getDisplay() {
		return _display;
	}

	@Override
	public void setDisplay(Integer display) {
		_display = display;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setDisplay", Integer.class);

				method.invoke(_globalInformationRemoteModel, display);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Integer getStatus() {
		return _status;
	}

	@Override
	public void setStatus(Integer status) {
		_status = status;

		if (_globalInformationRemoteModel != null) {
			try {
				Class<?> clazz = _globalInformationRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", Integer.class);

				method.invoke(_globalInformationRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getGlobalInformationRemoteModel() {
		return _globalInformationRemoteModel;
	}

	public void setGlobalInformationRemoteModel(
		BaseModel<?> globalInformationRemoteModel) {
		_globalInformationRemoteModel = globalInformationRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _globalInformationRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_globalInformationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GlobalInformationLocalServiceUtil.addGlobalInformation(this);
		}
		else {
			GlobalInformationLocalServiceUtil.updateGlobalInformation(this);
		}
	}

	@Override
	public GlobalInformation toEscapedModel() {
		return (GlobalInformation)ProxyUtil.newProxyInstance(GlobalInformation.class.getClassLoader(),
			new Class[] { GlobalInformation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GlobalInformationClp clone = new GlobalInformationClp();

		clone.setGlobalInformationId(getGlobalInformationId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setDate(getDate());
		clone.setMessage(getMessage());
		clone.setDisplay(getDisplay());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(GlobalInformation globalInformation) {
		int value = 0;

		value = DateUtil.compareTo(getDate(), globalInformation.getDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GlobalInformationClp)) {
			return false;
		}

		GlobalInformationClp globalInformation = (GlobalInformationClp)obj;

		long primaryKey = globalInformation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{globalInformationId=");
		sb.append(getGlobalInformationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", display=");
		sb.append(getDisplay());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.liferay.support.standup.model.GlobalInformation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>globalInformationId</column-name><column-value><![CDATA[");
		sb.append(getGlobalInformationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>display</column-name><column-value><![CDATA[");
		sb.append(getDisplay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _globalInformationId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _date;
	private String _message;
	private Integer _display;
	private Integer _status;
	private BaseModel<?> _globalInformationRemoteModel;
}