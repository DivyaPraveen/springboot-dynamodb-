package com.poc.trackernosql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.util.Assert;
import software.amazon.ion.Timestamp;

import java.util.List;

@SpringBootTest
class TrackerNosqlApplicationTests {

	@Autowired
	TrackerRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void sampleTest() {

		Tracker tracker = new Tracker();
		tracker.setDescription("Race subscriber");
		tracker.setStatus("Fail");
		tracker.setTimestamp(Timestamp.now().toString());

		repository.save(tracker);


		List<Tracker> trackers = repository.findByStatus("Success");

		//Assert tracker has value
	}
}
