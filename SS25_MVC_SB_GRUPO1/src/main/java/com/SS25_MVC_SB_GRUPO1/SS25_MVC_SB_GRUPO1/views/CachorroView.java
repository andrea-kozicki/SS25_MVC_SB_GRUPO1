package com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.views;

import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.services.CachorroService;

import java.util.List;
import java.util.Scanner;

import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.controllers.CachorroController;
import com.SS25_MVC_SB_GRUPO1.SS25_MVC_SB_GRUPO1.models.Cachorro;

public class CachorroView {
    private CachorroService service = new CachorroService();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            System.err.println("\n\nMenu");
            System.err.println("\n1. Add cachorro");
            System.err.println("\n2. Listar cachorro");
            System.err.println("\n3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarCachorro();
                    break;
                case 2:
                    List<Cachorro> cs = service.listar();
                    for (Cachorro c : cs) {
                        System.out.println(c.getNome());
                    }
                    break;
                case 3:
                    System.out.println("Saindo");
                    return;
                default:
                    break;
            }
        }
    }

    private void adicionarCachorro() {
        System.out.println("Digite o nome do caozinho:");
        String nome = scanner.nextLine();
        System.out.println("Digite a raça:");
        String raca = scanner.nextLine();
        service.cadastrar(nome, raca);
    }
}

