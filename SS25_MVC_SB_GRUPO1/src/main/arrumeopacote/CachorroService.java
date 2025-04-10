package com.alunospucpr.abrigo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CachorroService {
    private List<Cachorro> cachorros = new ArrayList<>();

    public void cadastrarCachorro(Cachorro cachorro) {
        cachorros.add(cachorro);
    }

    public List<Cachorro> listarCachorros() {
        return cachorros;
    }
}