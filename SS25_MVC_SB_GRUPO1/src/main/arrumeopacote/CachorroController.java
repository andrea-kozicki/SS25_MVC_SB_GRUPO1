package com.alunospucpr.abrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CachorroController {
    private final CachorroService cachorroService;

    
    @Autowired
    public CachorroController(CachorroService cachorroService) {
        this.cachorroService = cachorroService;
    }
    // @GetMapping("/cadastrarCachorro")
    // public void cadastrarCachorro(@RequestBody() Cachorro cachorro) {
    public void cadastrarCachorro(Cachorro cachorro) {
        cachorroService.cadastrarCachorro(cachorro);
    }
    // @GetMapping("/cachorros")
    public List<Cachorro> listarCachorros() {
        return cachorroService.listarCachorros();
    }
}