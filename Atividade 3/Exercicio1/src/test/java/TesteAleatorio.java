/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import exercício1.Aleatorio;
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
public class TesteAleatorio
{
    
    public TesteAleatorio()
    {
    }

    @Test
    public void testaAleatorio()
    {
        Aleatorio aleatorio = new Aleatorio();
        assertEquals(-1, aleatorio.gerarNumeroAleatorio(-3, 10));
        assertEquals(-1, aleatorio.gerarNumeroAleatorio(3, -5));
        assertEquals(-1, aleatorio.gerarNumeroAleatorio(9, 9));
        int valorAleatorio = aleatorio.gerarNumeroAleatorio(200, 3000);
        assertTrue(valorAleatorio >= 200);
        assertTrue(valorAleatorio <= 3000);
    }
}
