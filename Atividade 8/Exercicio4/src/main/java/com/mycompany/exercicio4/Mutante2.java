/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author Megaetros
 */
public class Mutante2
{

    public String definirFaixaEtaria(Pessoa p)
            throws RuntimeException
    {
        if (p.getIdade() < 0 || p.getIdade() >= 110)
        {
            throw new IllegalArgumentException("idade invalida");
        }

        int idade = p.getIdade();
        String tipo = "";
        if (idade <= 11)
        {
            tipo = "crianca";
        }
        else
        {
            if (idade < 18) //<= -> <
            {
                tipo = "adolescente";
            }
            else
            {
                if (idade <= 59)
                {
                    tipo = "adulto";
                }
                else
                {
                    tipo = "idoso";
                }
            }
        }

        return p.getNome() + " eh " + tipo;
    }
}
