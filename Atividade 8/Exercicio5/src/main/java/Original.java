/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Megaetros
 */
public class Original
{
    MathOps mathOps;

    public Original(MathOps mathOps)
    {
        this.mathOps = mathOps;
    }

    public int somaDeFatoriais(int vet[])
    {
        int soma = 0;
        for (int i = 0; i < vet.length; i++)
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
