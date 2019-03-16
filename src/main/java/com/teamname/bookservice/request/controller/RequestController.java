package com.teamname.bookservice.request.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/requests", method = RequestMethod.GET, produces = "application/json")
public class RequestController {
}
