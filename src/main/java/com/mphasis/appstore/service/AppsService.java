package com.mphasis.appstore.service;

import java.util.List;

import com.mphasis.appstore.entity.Apps;

public interface AppsService {
	
	public void postApps(Apps apps);
	public List<Apps> getallApps();
	public Apps getbyId(long id);

}
