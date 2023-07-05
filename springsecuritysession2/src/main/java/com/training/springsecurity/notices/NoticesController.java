package com.training.springsecurity.notices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("notices")
    public String getNotices() {
        return "Getting my notices";
    }
}
