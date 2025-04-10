package com.alunospucpr.abrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cachorros")
public class CachorroController {
    private final CachorroService cachorroService;

    @Autowired
    public CachorroController(CachorroService cachorroService) {
        this.cachorroService = cachorroService;
    }

    @PostMapping("/cadastrar") 
    public void cadastrarCachorro(@RequestBody Cachorro cachorro) {
        cachorroService.cadastrarCachorro(cachorro);
    }

    @GetMapping 
    public List<Cachorro> listarCachorros() {
        return cachorroService.listarCachorros();
    }
}
