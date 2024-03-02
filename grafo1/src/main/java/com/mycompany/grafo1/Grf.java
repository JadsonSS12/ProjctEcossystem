/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafo1;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 * @param <TIPO>
 */
public class Grf <TIPO>{
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;


    public Grf(){

        this.vertices = new ArrayList<Vertice<TIPO>> ();
        this.arestas = new ArrayList<Aresta<TIPO>> ();
    }
    
    public void adicionarVertice(TIPO dado, Double tdm){
        Vertice<TIPO> novoVertice = new Vertice<TIPO> (dado, tdm);
        this.vertices.add(novoVertice);
    }
    
    public void adicionarAresta(TIPO dadoInicio, Double peso, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaEntrada(aresta);
        fim.adicionarArestaSaida(aresta);
        this.arestas.add(aresta);
    }
    
    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
}