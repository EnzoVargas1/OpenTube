package com.java.OTServerSide.com.OT.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.OTServerSide.com.OT.models.Channel;
import com.java.OTServerSide.com.OT.models.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, Integer>{

}

