package com.training.springsecurity.card;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("myCards")
    public String getCardsDetails() {
        return "Getting my cards details";
    }
}
