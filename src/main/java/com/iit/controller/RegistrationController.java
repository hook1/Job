package com.iit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by taras on 14.12.2016.
 */
@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

    public String getRegistrationPage() {
        return "registration";
    }

}
