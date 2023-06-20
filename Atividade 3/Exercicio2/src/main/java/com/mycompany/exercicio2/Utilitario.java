/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Rever
 */
public class Utilitario
{

    /**
     * @param v
     * @return um objeto da classe Extremos que guarda o maior e o menor numero
     * no vetor e seus indices
     */
    public Extremos acharExtremos(int v[]) throws Exception
    {
        if (v == null)
        {
            throw new Exception("vetor nao pode ser nulo");
        }
        if (v.length == 0)
        {
            throw new Exception("vetor com zero elementos");
        }
        int menor = v[0], maior = v[0];
        int indiceMenor = 0, indiceMaior = 0;
        for (int i = 1; i < v.length; i++)
        {
            if (v[i] < menor)
            {
                menor = v[i];
                indiceMenor = i;
            }
            if (v[i] > maior)
            {
                maior = v[i];
                indiceMaior = i;
            }
        }
        return new Extremos(menor, indiceMenor, maior,
                indiceMaior);
    }
}
