package com.example.inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

  @GetMapping("/hello")
  String hello() {
    return "Hello World";
  }

}
