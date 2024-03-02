/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class EcoCriacao {
            // Criando 50 ecossistemas fictícios
        Vertice[] ecossistemas = new Vertice[50];
        ArrayList<Aresta> arestas = new ArrayList<>();
        String habitat = new String("");
        
        public void criacao(Vertice[] ecossistemas, ArrayList<Aresta> arestas){

        for (int i = 0; i < 50; i++) {
            String tipo = "Ecossistema " + (i + 1);
            ecossistemas[i].setTaxaDeMortalidade( (double) (Math.random() * 0.5)); // Valor aleatório entre 0 e 0.5
            int quantidadeRecursosAlimenticios = (int) (Math.random() * 100); // Valor aleatório entre 0 e 100
            
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira algum texto
            System.out.print("Qual o habitat: ");

            // Lê a entrada do teclado e a armazena em uma variável
            habitat = scanner.nextLine();

            // Imprime o que foi digitado pelo usuário

            // Não se esqueça de fechar o Scanner quando não precisar mais dele
            scanner.close();
            

            ecossistemas[i] = new Vertice(tipo, ecossistemas[i].getTaxaDeMortalidade());

            // Criando arestas
            for (int j = i - 1; j >= 0; j--) {
                double pesoAresta = Math.abs(ecossistemas[i].getTaxaDeMortalidade() - ecossistemas[j].getTaxaDeMortalidade());
                arestas.add(new Aresta(pesoAresta,ecossistemas[i], ecossistemas[j]));
            }
        }

        // Exibindo os ecossistemas criados
        for (int i = 0; i < 50; i++) {
            System.out.println("Ecossistema " + (i + 1) + ":");
           // System.out.println("Tipo de Habitat: " + ecossistemas[i].setDado(habitat));
            System.out.println("Taxa de Mortalidade: " + ecossistemas[i].getTaxaDeMortalidade());
            System.out.println("Habitat: " + ecossistemas[i].getDado());
            System.out.println();
        }
    }
}
