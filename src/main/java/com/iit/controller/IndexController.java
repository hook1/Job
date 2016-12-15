package com.iit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by taras on 14.12.2016.
 */
@Controller
@RequestMapping(value = {"/", "/home", "/index"})
public class IndexController {

    @RequestMapping(value = "/connction", method = RequestMethod.GET)
    public
    @ResponseBody
    String connection() {
        return "OK";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
