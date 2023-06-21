/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio16;

/**
 *
 * @author Rever
 */
public class Cliente
{

    private int codigo;
    private String nome;
    private int desconto = 0;

    public Cliente(int codigo, String nome)
    {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public int getDesconto()
    {
        return desconto;
    }

    public void setDesconto(int desconto)
    {
        this.desconto = desconto;
    }
}
