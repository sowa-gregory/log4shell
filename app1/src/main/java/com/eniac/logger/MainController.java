package com.eniac.logger;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class MainController {

    private static final Logger logger = LogManager.getLogger("l4s-app1");
    private int counter = 0;

    @GetMapping("/")
    public String ala(@RequestHeader("User-Agent") String userAgent) {
        logger.info("Received a request from User-Agent:" + userAgent);
        return "Log4Shell app 1:"+Integer.toString(counter++);
    }

    @GetMapping("/test")
    public String bela(Hello hello)
    {
	return "done";	
}

}
