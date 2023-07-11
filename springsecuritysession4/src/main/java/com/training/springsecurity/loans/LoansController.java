package com.training.springsecurity.loans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("myLoans")
    public String getMyLoansDetails() {
        return "Getting my loans details";
    }
}
