/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Megaetros
 */
public class testeEx5
{
    MathOps mathOps = Mockito.mock(MathOps.class);
    Original classeTeste = new Original(mathOps);
//    Mutante1 classeTeste = new Mutante1(mathOps); //- morto
//    Mutante2 classeTeste = new Mutante2(mathOps); //- morto
//    Mutante3 classeTeste = new Mutante3(mathOps); //- morto
    
    @Test
    public void testesomaDeFatoriais()
    {
        int[] vet = {};
        assertEquals(0, classeTeste.somaDeFatoriais(vet));
        
        int[] vet1 = {0};
        assertEquals(0, classeTeste.somaDeFatoriais(vet1));
        
        int[] vet2 = {0, 2, 3, 4, 5};
        Mockito.when(mathOps.fatorial(0)).thenReturn(1);
        Mockito.when(mathOps.fatorial(2)).thenReturn(2);
        Mockito.when(mathOps.fatorial(3)).thenReturn(6);
        Mockito.when(mathOps.fatorial(4)).thenReturn(24);
        Mockito.when(mathOps.fatorial(5)).thenReturn(120);
        assertEquals(27, classeTeste.somaDeFatoriais(vet2));
    }
}
