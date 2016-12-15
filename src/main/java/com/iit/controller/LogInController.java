package com.iit.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by taras on 14.12.2016.
 */
@RequestMapping(value = "/logIn")
public class LogInController {
    public String getLogInPage() {
        return "logIn";
    }

}
