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
public class HumidificarTeste
{

    public HumidificarTeste()
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
        Assertions.assertFalse(climatizador.umidificando());

        climatizador.ligar();
        Assertions.assertTrue(climatizador.umidificando());
        climatizador.umidificar();
        Assertions.assertFalse(climatizador.umidificando());
        climatizador.umidificar();
        Assertions.assertTrue(climatizador.umidificando());
        climatizador.aumentarV();
        Assertions.assertTrue(climatizador.umidificando());
        climatizador.diminuirV();
        Assertions.assertTrue(climatizador.umidificando());
        climatizador.umidificar();
        Assertions.assertFalse(climatizador.umidificando());
        
    }


}
