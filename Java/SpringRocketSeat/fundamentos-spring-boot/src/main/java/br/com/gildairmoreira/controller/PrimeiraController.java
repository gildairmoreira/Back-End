package br.com.gildairmoreira.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O Parametro é: " + id;
    }

    @GetMapping("/metodoComQuerryParams")
    public String metodoComQuerryParams(@RequestParam String id) {
        return "O Parametro com metodoComQuerryParams é: " + id;
    }

    @GetMapping("/metodoComQuerryParams2")
    public String metodoComQuerryParams2(@RequestParam Map<String, String> allParams) {
        return "O Parametro com metodoComQuerryParams2 é: " + allParams.entrySet();
    }

}
