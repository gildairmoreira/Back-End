package com.gildairmoreira.todolist.controller;

import org.springframework.web.bind.annotation.RestController;
@RestController

public class MinhaPrimeiraController {
  public String primeiraMensagem() {
    return "Funcionou";
  
  }
}
