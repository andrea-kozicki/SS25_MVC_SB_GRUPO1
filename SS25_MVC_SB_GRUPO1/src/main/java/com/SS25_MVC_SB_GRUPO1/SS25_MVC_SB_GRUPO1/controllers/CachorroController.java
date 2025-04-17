package com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.controllers;

import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.services.CachorroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.dao.CachorroDAO;
import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.models.Cachorro;

@RestController
@RequestMapping("/cachorros")
@CrossOrigin(origins = "*")
public class CachorroController {

    @Autowired
    private CachorroService service;

    @PostMapping("/cadastrar")
    public void cadastrarCachorro(@RequestParam String nome, @RequestParam String raca) {
        service.cadastrar(nome, raca);
    }

    @GetMapping("/listar")
    public List<Cachorro> listarCachorros() {
        return service.listar();
    }
}
