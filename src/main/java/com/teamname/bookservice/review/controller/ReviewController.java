package com.teamname.bookservice.review.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/reviews", method = RequestMethod.GET, produces = "application/json")
public class ReviewController {
}
