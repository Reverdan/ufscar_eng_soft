/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.exercicio3.MathOps;
import com.mycompany.exercicio3.Primo;
import com.mycompany.exercicio3.Somatoria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Rever
 */
public class TesteEX3
{

    public TesteEX3()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testFatorial2Valores()
    {
        MathOps mockedMathOps = Mockito.mock(MathOps.class);
        Primo mockedPrimo = Mockito.mock(Primo.class);
        Somatoria somatoria = new Somatoria(mockedMathOps);

        Mockito.when(mockedMathOps.fatorial(5)).thenReturn(120);
        Mockito.when(mockedMathOps.fatorial(10)).thenReturn(3628800);
        
        Mockito.when(mockedPrimo.ehPrimo(5)).thenReturn(true);
        Mockito.when(mockedPrimo.ehPrimo(10)).thenReturn(false);

        int[] numeros =
        {
            5, 10
        };
        
        assertEquals(3628800, somatoria.somaDeFatoriais(numeros, mockedPrimo));
    }

    @Test
    public void testFatorial4Valores()
    {
        MathOps mockedMathOps = Mockito.mock(MathOps.class);
        Primo mockedPrimo = Mockito.mock(Primo.class);
        Somatoria somatoria = new Somatoria(mockedMathOps);

        Mockito.when(mockedMathOps.fatorial(3)).thenReturn(6);
        Mockito.when(mockedMathOps.fatorial(4)).thenReturn(24);
        Mockito.when(mockedMathOps.fatorial(5)).thenReturn(120);
        
        Mockito.when(mockedPrimo.ehPrimo(3)).thenReturn(true);
        Mockito.when(mockedPrimo.ehPrimo(4)).thenReturn(false);
        Mockito.when(mockedPrimo.ehPrimo(5)).thenReturn(true);

        int[] numeros =
        {
            3, 4, 4, 5
        };
        
        assertEquals(48, somatoria.somaDeFatoriais(numeros, mockedPrimo));
    }
}
