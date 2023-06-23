/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Megaetros
 */
public class Mutante1
{

    MathOps mathOps;

    public Mutante1(MathOps mathOps)
    {
        this.mathOps = mathOps;
    }

    public int somaDeFatoriais(int vet[])
    {
        int soma = 0;
        for (int i = 1; i < vet.length; i++) // '0' -> '1'
        { 
            int numero = vet[i];
            if (numero >= 0 && numero % 2 == 0)
            {
                soma += mathOps.fatorial(numero);
            }
        }
        return soma;
    }
}
