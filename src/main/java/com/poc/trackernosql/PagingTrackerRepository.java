//package com.poc.trackernosql;
//
//import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
//import org.socialsignin.spring.data.dynamodb.repository.EnableScanCount;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.PagingAndSortingRepository;
//
//
//public interface PagingTrackerRepository extends PagingAndSortingRepository<Tracker, String> {
//
//	Page<Tracker> findBymessageId(String messageId, Pageable pageable);
//
//	@EnableScan
//	@EnableScanCount
//	Page<Tracker> findAll(Pageable pageable);
//
//}
