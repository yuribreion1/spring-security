package com.training.springsecurity.account;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private static final Log logger = LogFactory.getLog(AccountController.class);

    @GetMapping("/myAccount")
    public String getMyAccountDetails() {
        logger.info("Trying to access the account data");
        return "Here is my account details from DB";
    }
}
