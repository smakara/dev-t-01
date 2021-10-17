package com.econetwireless.epay.dao.subscriberrequest.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.econetwireless.epay.domain.SubscriberRequest;

/**
 * Created by tnyamakura on 17/3/2017.
 */
public interface SubscriberRequestDao extends JpaRepository<SubscriberRequest, Long> {
	List<SubscriberRequest> findByPartnerCode(@Param("partnerCode") String partnerCode);

	SubscriberRequest persist(SubscriberRequest subscriberRequest);

	void update(SubscriberRequest createdSubscriberRequest);
}
