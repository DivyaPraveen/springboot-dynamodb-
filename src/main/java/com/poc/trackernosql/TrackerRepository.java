package com.poc.trackernosql;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface TrackerRepository extends CrudRepository<Tracker, String> {
	//Scanning for this query is enabled using Enable scan
	List<Tracker> findByStatus(String status);

}
