/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import exercicio2.Extremos;
import exercicio2.Utilitario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        Extremos extremos = utilitario.acharExtremos(vetor);
        assertEquals(1,extremos.getMenor());
        assertEquals(0, extremos.getIndiceMenor());
        assertEquals(6, extremos.getMaior());
        assertEquals(5, extremos.getIndiceMaior());
        
        int[] vetor1 = {1,99,3,-5,8};
        extremos = utilitario.acharExtremos(vetor1);
        assertEquals(-5,extremos.getMenor());
        assertEquals(3, extremos.getIndiceMenor());
        assertEquals(99, extremos.getMaior());
        assertEquals(1, extremos.getIndiceMaior());
        
        int[] vetor2 = {};
        assertThrows(Exception.class, () -> utilitario.acharExtremos(vetor2));
        
        int[] vetor3 = null;
        assertThrows(Exception.class, () -> utilitario.acharExtremos(vetor2));
    }

}
