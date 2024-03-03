/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grafo1;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class Grafo1 {

    public static void main(String[] args) {
        Vertice u = new Vertice("string", 2.12);
        Vertice[] ecossistemas = new Vertice[50];
        ArrayList<Aresta> arestas = new ArrayList<>();
        String habitat = new String("dado");
        
        EcoCriacao g = new EcoCriacao();
        
        
        g.criacao(ecossistemas, arestas, habitat);
        
        /*Grf grf = new Grf();
        
        
        grf.adicionarVertice(u, u.getTaxaDeMortalidade());
        grf.adicionarVertice("do", 3.14);
        
        grf.adicionarAresta(u, u.getTaxaDeMortalidade(), "do");*/
    }
}
