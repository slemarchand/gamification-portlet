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

package gamification.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the BadgeInstance service. Represents a row in the &quot;GM_BadgeInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link gamification.model.impl.BadgeInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link gamification.model.impl.BadgeInstanceImpl}.
 * </p>
 *
 * @author Sebastien Le Marchand
 * @see BadgeInstance
 * @see gamification.model.impl.BadgeInstanceImpl
 * @see gamification.model.impl.BadgeInstanceModelImpl
 * @generated
 */
public interface BadgeInstanceModel extends BaseModel<BadgeInstance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a badge instance model instance should use the {@link BadgeInstance} interface instead.
	 */

	/**
	 * Returns the primary key of this badge instance.
	 *
	 * @return the primary key of this badge instance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this badge instance.
	 *
	 * @param primaryKey the primary key of this badge instance
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the badge instance ID of this badge instance.
	 *
	 * @return the badge instance ID of this badge instance
	 */
	public long getBadgeInstanceId();

	/**
	 * Sets the badge instance ID of this badge instance.
	 *
	 * @param badgeInstanceId the badge instance ID of this badge instance
	 */
	public void setBadgeInstanceId(long badgeInstanceId);

	/**
	 * Returns the company ID of this badge instance.
	 *
	 * @return the company ID of this badge instance
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this badge instance.
	 *
	 * @param companyId the company ID of this badge instance
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this badge instance.
	 *
	 * @return the user ID of this badge instance
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this badge instance.
	 *
	 * @param userId the user ID of this badge instance
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this badge instance.
	 *
	 * @return the user uuid of this badge instance
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this badge instance.
	 *
	 * @param userUuid the user uuid of this badge instance
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this badge instance.
	 *
	 * @return the create date of this badge instance
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this badge instance.
	 *
	 * @param createDate the create date of this badge instance
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this badge instance.
	 *
	 * @return the modified date of this badge instance
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this badge instance.
	 *
	 * @param modifiedDate the modified date of this badge instance
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the badge name of this badge instance.
	 *
	 * @return the badge name of this badge instance
	 */
	@AutoEscape
	public String getBadgeName();

	/**
	 * Sets the badge name of this badge instance.
	 *
	 * @param badgeName the badge name of this badge instance
	 */
	public void setBadgeName(String badgeName);

	/**
	 * Returns the badge level of this badge instance.
	 *
	 * @return the badge level of this badge instance
	 */
	public int getBadgeLevel();

	/**
	 * Sets the badge level of this badge instance.
	 *
	 * @param badgeLevel the badge level of this badge instance
	 */
	public void setBadgeLevel(int badgeLevel);

	/**
	 * Returns the data of this badge instance.
	 *
	 * @return the data of this badge instance
	 */
	@AutoEscape
	public String getData();

	/**
	 * Sets the data of this badge instance.
	 *
	 * @param data the data of this badge instance
	 */
	public void setData(String data);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(BadgeInstance badgeInstance);

	@Override
	public int hashCode();

	@Override
	public CacheModel<BadgeInstance> toCacheModel();

	@Override
	public BadgeInstance toEscapedModel();

	@Override
	public BadgeInstance toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}