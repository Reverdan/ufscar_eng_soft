/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.climatizador;

/**
 *
 * @author Rever
 */
public class Exercicio5
{

    private boolean ligado = false, umid = false;
    private int velAtual = 0;

    public int velocidade()
    {
        return velAtual;
    }

    public boolean umidificando()
    {
        return umid;
    }

    public void umidificar()
    {
        if (ligado)
        {
            umid = !umid;
        }
    }

    public void ligar()
    {
        if (ligado)
        {
            throw new RuntimeException();
        }
        ligado = umid = true;
        velAtual = 1;
    }

    public void desligar()
    {
        if (!ligado)
        {
            throw new RuntimeException();
        }
        ligado = umid = false;
        velAtual = 0;
    }

    public boolean aumentarV()
    {
        if (velAtual == 2)
        {
            return false;
        }
        velAtual++;
        return true;
    }

    public boolean diminuirV()
    {
        if (velAtual <= 1)
        {
            return false;
        }
        velAtual--;
        return true;
    }
}
