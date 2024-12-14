package com.mphasis.appstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.appstore.entity.Apps;
import com.mphasis.appstore.repository.AppsRepository;

@Service
public class AppsServiceImpl implements AppsService {

	@Autowired
	private AppsRepository appsRepository;
//	List<Apps> appList = new ArrayList<Apps>();
//	public AppsServiceImpl() {
//		appList.add(new Apps(1,"free","Instagram"));
//		appList.add(new Apps(2,"free","Facebook"));
//	}
	
	
	@Override
	public List<Apps> getallApps() {
		 return appsRepository.findAll();
	}

	@Override
	public void postApps(Apps apps) {
		
		appsRepository.save(apps);
		System.out.println(apps+" has been saved.");
	}

	@Override
	public Apps getbyId(long id) {
		// TODO Auto-generated method stub
		return appsRepository.findById(id).get();
	}

}
