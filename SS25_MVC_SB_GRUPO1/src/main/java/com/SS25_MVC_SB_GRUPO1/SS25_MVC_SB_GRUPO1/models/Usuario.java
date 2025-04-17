package com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.models;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e meu email é " + this.email);
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
}
