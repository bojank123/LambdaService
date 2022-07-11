package com.htecgroup.pegasusbev1.api.v1.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/test")
  String  test()
  {
    return "mrs";
  }

}
