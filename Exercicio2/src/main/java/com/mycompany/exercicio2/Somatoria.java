/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author Rever
 */
public class Somatoria
{

    MathOps mathOps;

    public Somatoria(MathOps mathOps)
    {
        this.mathOps = mathOps;
    }

    /**
     * @param numeros
     * @
     * return a somatoria do fatorial de cada inteiro no array numeros
     *
     */
    public int somaDeFatoriais(int numeros[])
    {
        var soma = 0;
        for (var num : numeros)
        {
            soma += mathOps.fatorial(num);
        }

        return soma;
    }
}
