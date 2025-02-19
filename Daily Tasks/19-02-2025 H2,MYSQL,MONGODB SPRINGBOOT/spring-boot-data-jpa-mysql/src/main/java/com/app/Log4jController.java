package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4jController {
	private final static Logger LOGGER = LoggerFactory.getLogger(Log4jController.class);

    @RequestMapping
    public void test() {
    	LOGGER.error("This is a test");
    }
	
}
