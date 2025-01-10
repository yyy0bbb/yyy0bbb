package com.ict.dockertest01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class AppController {
  
  @GetMapping("/path")
  public String getIndex() {
      return "Welcome, Spring";
  }
  
}
