package com.pucpralunos.abrigo.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pucpralunos.abrigo.dao.UsuarioDAO;
import com.pucpralunos.abrigo.models.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public UsuarioController() {}

    @GetMapping("/cadastrar")
    public void cadastrarUsuario(@RequestParam String nome, @RequestParam int idade, @RequestParam String senha) {
        usuarioDAO.addUsuario(nome, idade, senha);
    }

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }
}
