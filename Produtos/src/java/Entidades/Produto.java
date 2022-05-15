/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author mrglass
 */
public class Produto {
    private int Id;
    private String Nome;
    private double Preco;
    private LocalDate Data;

    public Produto(String Nome, double Preco, LocalDate Data) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.Data = Data;
    }
    
    public Produto(String Nome, double Preco, LocalDate Data, int Id) {
        this.Id = Id;
        this.Nome = Nome;
        this.Preco = Preco;
        this.Data = Data;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return Preco;
    }
    
    public LocalDate getData() {
        return Data;
    }
}
