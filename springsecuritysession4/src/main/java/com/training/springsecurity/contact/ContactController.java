package com.training.springsecurity.contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("contact")
    public String getContacts() {
        return "Getting my contact details from DB";
    }
}
