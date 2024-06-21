package com.fundraising.controller;

import com.fundraising.service.FundraisingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundraisingController {
    private static final Logger logger = LoggerFactory.getLogger(FundraisingController.class);

    @Autowired
    private FundraisingService fundraisingService;

    @GetMapping("/handleRequest")
    public String handleFundraisingRequest() {
        logger.info("Handling fundraising request...");
        return "Fundraising request handled";
    }
}