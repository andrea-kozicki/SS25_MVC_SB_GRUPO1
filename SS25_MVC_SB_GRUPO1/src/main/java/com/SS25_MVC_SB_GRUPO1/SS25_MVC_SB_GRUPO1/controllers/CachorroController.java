package com.pucpralunos.abrigo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pucpralunos.abrigo.dao.CachorroDAO;
import com.pucpralunos.abrigo.models.Cachorro;

@RestController
@RequestMapping("/cachorros")
@CrossOrigin(origins = "*")
public class CachorroController {
    private CachorroService service = new CachorroService();

    @PostMapping("/cadastrar")
    public void cadastrarCachorro(@RequestParam String nome, @RequestParam String raca) {
        service.cadastrar(nome, raca);
    }

    @GetMapping("/listar")
    public List<Cachorro> listarCachorros() {
        return service.listar();
    }
}

