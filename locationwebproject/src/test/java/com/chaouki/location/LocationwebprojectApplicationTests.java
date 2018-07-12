package com.chaouki.location;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chaouki.location.entities.Location;
import com.chaouki.location.repo.LocationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationwebprojectApplicationTests {

	@Autowired
	LocationRepository locationRepo ; 
	
	
	@Test
	public void contextLoads() {
	}
	
	//the junit test works great here !!
	@Test
	public void createLocation() {
		Location loc = new Location();
		loc.setCode("test");
		loc.setId(10);
		loc.setName("test");
		loc.setType("test");
		this.locationRepo.save(loc) ;
		
	}

}
