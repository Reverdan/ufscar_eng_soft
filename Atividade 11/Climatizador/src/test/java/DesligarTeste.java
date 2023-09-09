/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.climatizador.Exercicio5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rever
 */
public class DesligarTeste
{

    public DesligarTeste()
    {
    }

    @BeforeAll
    public static void setUpClass()
    {
    }

    @AfterAll
    public static void tearDownClass()
    {
    }

    @BeforeEach
    public void setUp()
    {
    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testDesligar()
    {
        Exercicio5 climatizador = new Exercicio5();
        climatizador.ligar();
        climatizador.desligar();
        RuntimeException assertThrows = assertThrows(RuntimeException.class, () -> climatizador.desligar());
        climatizador.ligar();
        climatizador.aumentarV();
        climatizador.umidificar();
        climatizador.desligar();
        assertEquals(0, climatizador.velocidade());
    }
}
