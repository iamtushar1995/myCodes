package com.mphasis.appstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table

public class Apps {
	@Id
	private long appId;
	private String appName;
	private String appPrice;

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppPrice() {
		return appPrice;
	}

	public void setAppPrice(String appPrice) {
		this.appPrice = appPrice;
	}

	public Apps(long appId, String appName, String appPrice) {
		super();
		this.appId = appId;
		this.appName = appName;
		this.appPrice = appPrice;
	}

	public Apps() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apps [appId=" + appId + ", appName=" + appName + ", appPrice=" + appPrice + "]";
	}

}
