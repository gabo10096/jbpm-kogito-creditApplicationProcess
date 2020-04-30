package com.bbva.kgtmx.services;

import javax.enterprise.context.ApplicationScoped;

import com.bbva.kgtmx.model.CreditApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class CreditApplicationService {

    private static final Logger logger = LoggerFactory.getLogger(CreditApplicationService.class);

    public CreditApplication approvedByAmount (CreditApplication creditApplication){
        logger.info("::: CREDIT APPLICATION APPROVED FOR AMOUNT LESS THAN $10,000 :::");
        logger.info(":::::: " + creditApplication.toString());
        return creditApplication;
    }

    public CreditApplication denied (CreditApplication creditApplication){
        logger.info("::: CREDIT APPLICATION DENIED IN MANUAL REVISION :::");
        logger.info(":::::: " + creditApplication.toString());
        return creditApplication;
    }

    public CreditApplication approvedByRevision (CreditApplication creditApplication){
        logger.info("::: CREDIT APPLICATION APPROVED IN MANUAL REVISION :::");
        logger.info(":::::: " + creditApplication.toString());
        return creditApplication;
    }

}