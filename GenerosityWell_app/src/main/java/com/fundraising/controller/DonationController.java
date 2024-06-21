package com.fundraising.controller;

import com.fundraising.service.DonationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DonationController {
    private static final Logger logger = LoggerFactory.getLogger(DonationController.class);
    private DonationService donationService = new DonationService();

    public void handleDonationRequest() {
        logger.info("Handling donation request...");
        donationService.processDonation();
    }
}