package com.teamname.bookservice.controller;

import com.teamname.bookservice.model.User;
import com.teamname.bookservice.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/home") //, produces = "application/json")
public class HomeController {

  @Autowired
  UserDao userDao;

  @RequestMapping("/home")
  public String home() {
    return "index";
  }

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  @ResponseBody
  public User test() {
    return userDao.findUserById(new Long(123456));
    // return userDao.findUserById(new Long(123456)).getFirstName();
  }
}
