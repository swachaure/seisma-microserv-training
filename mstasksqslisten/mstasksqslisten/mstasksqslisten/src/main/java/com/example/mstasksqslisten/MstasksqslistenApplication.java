package com.example.mstasksqslisten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication(exclude = ContextRegionProviderAutoConfiguration.class)
@RestController
public class MstasksqslistenApplication {
	
	Logger logger= LoggerFactory.getLogger(MstasksqslistenApplication.class);
	
	@Autowired
	@Value("${cloud.aws.end-point.uri}")
	private String endpoint;
	 
	@SqsListener("sqsservicetask1")
	public void loadMessageFromSQS(String message)  {
	    logger.info("message from SQS Queue {}",message);
 }
	 //CSV TO JSON //librab unrecovery exeception wh //file format   return back to queue 
	 
	public static void main(String[] args) {
		SpringApplication.run(MstasksqslistenApplication.class, args);
	}

}


