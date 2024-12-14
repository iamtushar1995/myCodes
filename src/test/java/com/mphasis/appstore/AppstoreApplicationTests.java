package com.mphasis.appstore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mphasis.appstore.entity.Apps;
import com.mphasis.appstore.repository.AppsRepository;
import com.mphasis.appstore.service.AppsService;

@SpringBootTest
class AppstoreApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private AppsService service;

	@MockBean
	private AppsRepository repository;

	@Test
	public void getApps() {
		 List<Apps> appsList = Stream.of(
	                new Apps(1, "free", "Yahoo"),
	                new Apps(2, "free", "Amazon")
	        ).collect(Collectors.toList());

	        when(repository.findAll()).thenReturn(appsList);
		
		assertEquals(2, service.getallApps().size());
	}

}
