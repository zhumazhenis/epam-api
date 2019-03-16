package com.teamname.bookservice.wish.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/wish-list", method = RequestMethod.GET, produces = "application/json")
public class WishController {
}
