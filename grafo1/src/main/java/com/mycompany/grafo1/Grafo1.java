/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grafo1;

/**
 *
 * @author Usuário
 */
public class Grafo1 {

    public static void main(String[] args) {
        Vertice u = new Vertice("string", 2.12);
        
        Grf grf = new Grf();
        
        
        grf.adicionarVertice(u, u.getTaxaDeMortalidade());
        grf.adicionarVertice("do", 3.14);
        
        grf.adicionarAresta(u, u.getTaxaDeMortalidade(), "do");
    }
}
