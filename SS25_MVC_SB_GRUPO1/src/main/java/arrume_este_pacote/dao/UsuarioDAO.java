package com.pucpralunos.abrigo.dao;

import com.pucpralunos.abrigo.models.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private List<Usuario> usuarios = new ArrayList<>();

    public void addUsuario(String nome, int idade, String senha) {
        Usuario usuario = new Usuario(nome, idade, senha);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
