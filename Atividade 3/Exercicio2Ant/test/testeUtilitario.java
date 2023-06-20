/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import exercicio2.Extremos;
import exercicio2.Utilitario;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Rever
 */
public class testeUtilitario
{

    public testeUtilitario()
    {
    }

    @Test
    public void testaUtilitario() throws Exception
    {
        int[] vetor = {1,2,3,4,5,6};
        Utilitario utilitario = new Utilitario();
        Extremos extremos = new Extremos(1, 0, 6, 5);
        assertEquals(extremos,utilitario.acharExtremos(vetor));
    }
}
