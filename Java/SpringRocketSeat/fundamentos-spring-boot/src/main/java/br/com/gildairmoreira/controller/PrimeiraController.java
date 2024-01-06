package br.com.gildairmoreira.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


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

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        
        return "metodBodyParams"+ usuario.username();
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeadersParams(@RequestHeader("name") String name) {
        
        return "metodo Com Headers Params"+ name;
    
    }
    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeadersParams(@RequestHeader Map<String, String> headers) {
        
        return "metodo Com Headers Params"+ headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")    
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){

        var usuario = new Usuario("GildairMoreira");

        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }

        return ResponseEntity.badRequest().body("Numero menor que 5");
    }

    record Usuario (String username) {

    }

}
