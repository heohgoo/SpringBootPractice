package com.studyproject.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/test")
    public void logTest() {
        logger.trace("Trace level");
        logger.debug("Debug level");
        logger.info("INFO level");
        logger.warn("WARN level");
        logger.error("Error level");
    }
}
