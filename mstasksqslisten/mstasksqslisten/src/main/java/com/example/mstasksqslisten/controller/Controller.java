package com.example.mstasksqslisten.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.web.bind.annotation.RestController;

import com.example.mstasksqslisten.MstasksqslistenApplication;

@RestController
public class Controller {
	Logger logger= LoggerFactory.getLogger(MstasksqslistenApplication.class);
	
	@Autowired
	@Value("${cloud.aws.end-point.uri}")
	private String endpoint;
	 
	@SqsListener("sqsservicetask1")
	public void loadMessageFromSQS(String message)  {
	    logger.info("message from SQS Queue {}",message);
	}
	
}
