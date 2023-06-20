/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

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
     *
     * @param numeros
     * @param p
     * @return a somatoria do fatorial de cada inteiro no array numeros que
 nao eh primo
     */
    public int somaDeFatoriais(int numeros[], Primo p)
    {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++)
        {
            int numero = numeros[i];
            if (!p.ehPrimo(numero))
            {
                soma += mathOps.fatorial(numero);
            }
        }
        return soma;
    }
}
