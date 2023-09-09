/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.climatizador.Climatizador;
import com.mycompany.climatizador.Exercicio5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rever
 */
public class UmidificarTeste
{

    public UmidificarTeste()
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
    public void UmidificarTeste()
    {
        Exercicio5 climatizador = new Exercicio5();
        climatizador.ligar();
        climatizador.umidificar();
        assertEquals(1, climatizador.velocidade());
        assertFalse(climatizador.umidificando());
        assertFalse(climatizador.diminuirV());
        climatizador.umidificar();
        assertEquals(1, climatizador.velocidade());
        assertTrue(climatizador.umidificando());
        RuntimeException assertThrows = assertThrows(RuntimeException.class, () -> climatizador.desligar());
        climatizador.aumentarV();
        climatizador.umidificar();
        assertFalse(climatizador.aumentarV());
        assertEquals(2, climatizador.velocidade());
        assertFalse(climatizador.umidificando());
    }


}
