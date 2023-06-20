/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.exercicio2.MathOps;
import com.mycompany.exercicio2.Somatoria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.ArgumentMatchers;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import org.mockito.internal.matchers.Any;
import org.mockito.internal.verification.Times;

/**
 *
 * @author Rever
 */
public class TesteEX2
{

    public TesteEX2()
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
        Somatoria somatoria = new Somatoria(mockedMathOps);

        Mockito.when(mockedMathOps.fatorial(3)).thenReturn(6);
        Mockito.when(mockedMathOps.fatorial(4)).thenReturn(24);

        int[] numeros =
        {
            3, 4
        };
        assertEquals(30, somatoria.somaDeFatoriais(numeros));

        Mockito.verify(mockedMathOps, times(2)).fatorial(ArgumentMatchers.anyInt());
    }

    @Test
    public void testFatorial5Valores()
    {
        MathOps mockedMathOps = Mockito.mock(MathOps.class);
        Somatoria somatoria = new Somatoria(mockedMathOps);

        Mockito.when(mockedMathOps.fatorial(0)).thenReturn(1);
        Mockito.when(mockedMathOps.fatorial(1)).thenReturn(1);
        Mockito.when(mockedMathOps.fatorial(2)).thenReturn(3);
        Mockito.when(mockedMathOps.fatorial(3)).thenReturn(6);
        Mockito.when(mockedMathOps.fatorial(4)).thenReturn(24);

        int[] numeros =
        {
            0, 1, 2, 3, 4
        };
        assertEquals(35, somatoria.somaDeFatoriais(numeros));

        Mockito.verify(mockedMathOps, times(5)).fatorial(ArgumentMatchers.anyInt());
    }
}
