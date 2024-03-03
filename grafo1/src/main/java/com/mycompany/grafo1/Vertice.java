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
public class Vertice<TIPO> {
    private TIPO dado;
    private TIPO habitat;
    private Double TaxaDeMortalidade;

    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList <Aresta<TIPO>> arestasSaida;
    
    public Vertice(TIPO valor, Double TDM){
        this.dado = valor;
        this.TaxaDeMortalidade = TDM;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>> ();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>  ();
    }

     public Double getTaxaDeMortalidade() {
        return TaxaDeMortalidade;
    }

    public void setTaxaDeMortalidade(Double TaxaDeMortalidade) {
        this.TaxaDeMortalidade = TaxaDeMortalidade;
    }
    
    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<TIPO>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }

    
    
    public void adicionarArestaEntrada(Aresta<TIPO> aresta){
        this.arestasEntrada.add(aresta);
    }
    
    public void adicionarArestaSaida(Aresta<TIPO> aresta){
        this.arestasSaida.add(aresta);
    }

}