package br.com.gildairmoreira.ioc_di;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired
    MeuComponent meuComponent;

    @GetMapping("/")
    public String ChamandoCompoent() {
        var resultado = meuComponent.chamarMeuComponent();
        return resultado;
    }
    
}
