package com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.controllers;

import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @PostMapping
    public String adicionarUsuario(@RequestParam String nome, @RequestParam String email) {
        Usuario novoUsuario = new Usuario(nome, email);
        usuarios.add(novoUsuario);
        return "Usuário " + nome + " adicionado com sucesso!";
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
