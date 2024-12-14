package com.mphasis.appstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.appstore.entity.Apps;
import com.mphasis.appstore.repository.AppsRepository;
import com.mphasis.appstore.service.AppsService;

@RestController
public class AppsController {
	
	@Autowired
	private AppsService appService;
	
	@Autowired
	private AppsRepository appsRepository;
	
	@GetMapping("/apps")
	public List<Apps> getallApps(){
		
		return appService.getallApps();
	}

	@GetMapping("/apps/{id}")
	public Apps grtbyId(@PathVariable long id) {
		
		return appService.getbyId(id);
	}
	
	@PostMapping("/apps/add")
	public void saveApps(@RequestBody Apps apps){
		
		 appService.postApps(apps);
	}
	
	@DeleteMapping("/apps/{id}")
	public void deleteApp(@PathVariable long id) {
		appsRepository.deleteById(id);
	}
	
}
