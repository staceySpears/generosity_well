package com.fundraising.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DonationService {
    private static final Logger logger = LoggerFactory.getLogger(DonationService.class);

    public void processDonation() {
        logger.info("Processing a donation...");
        try {
            // Donation processing logic here
        } catch (Exception e) {
            logger.error("An error occurred: ", e);
        }
    }
}