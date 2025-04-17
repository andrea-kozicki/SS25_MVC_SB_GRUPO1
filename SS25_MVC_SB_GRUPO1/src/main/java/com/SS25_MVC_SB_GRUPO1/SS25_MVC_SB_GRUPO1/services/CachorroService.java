package com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.services;

import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.models.Cachorro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CachorroService {

    private List<Cachorro> cachorros = new ArrayList<>();

    public void cadastrar(String nome, String raca) {
        Cachorro c = new Cachorro(nome, raca);
        cachorros.add(c);
    }

    public List<Cachorro> listar() {
        return cachorros;
    }
}
