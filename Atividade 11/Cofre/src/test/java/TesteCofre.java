/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import cofre.Exercicio6;
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
public class TesteCofre
{

    public TesteCofre()
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
    public void TestarTravado2Tentativa()
    {
        Exercicio6 cofre = new Exercicio6();
        cofre.fecharPorta();
        cofre.inserirSenha(" ");
        try
        {
            cofre.digitarSenha("1");
        }
        catch (RuntimeException e)
        {
            assertEquals("Senha errada. Tente novamente", e.getMessage());
        }
        try
        {
            cofre.digitarSenha("1");
        }
        catch (RuntimeException e)
        {
            assertEquals("Senha errada. Tente novamente", e.getMessage());
        }
        assertEquals("fechada", cofre.statusPorta());
        assertEquals(true, cofre.travado());
        try
        {
            cofre.digitarSenha(" ");
        }
        catch (RuntimeException e)
        {
            assertEquals("Cofre bloqueado por tentativas; reiniciar", e.getMessage());
        }
        try
        {
            cofre.digitarSenha("1");
        }
        catch (RuntimeException e)
        {
            assertEquals("Cofre bloqueado por tentativas; reiniciar", e.getMessage());
        }
    }

    @Test
    public void TestarSenhaDestravado()
    {
        Exercicio6 cofre = new Exercicio6();
        cofre.fecharPorta();
        cofre.inserirSenha("2");
        cofre.digitarSenha("2");
        cofre.abrirPorta();
        assertEquals("aberta", cofre.statusPorta());
        assertEquals(false, cofre.travado());
        try
        {
            cofre.inserirSenha(" ");
        }
        catch (RuntimeException e)
        {
            assertEquals("Porta aberta", e.getMessage());
        }
    }
    
    @Test
    public void TestarTodos()
    {
        Exercicio6 cofre = new Exercicio6();
        assertEquals("aberta", cofre.statusPorta());
        assertEquals(false, cofre.travado());
        try
        {
            cofre.inserirSenha(" ");
        }
        catch (RuntimeException e)
        {
            assertEquals("Porta aberta", e.getMessage());
        }
        cofre.fecharPorta();
        assertEquals("fechada", cofre.statusPorta());
        assertEquals(false, cofre.travado());
        cofre.inserirSenha(" ");
        assertEquals("fechada", cofre.statusPorta());
        assertEquals(true, cofre.travado());
        try
        {
            cofre.abrirPorta();
        }
        catch (RuntimeException e)
        {
            assertEquals("Nao eh possivel abrir a porta;cofre travado com senha", e.getMessage());
        }
        try
        {
            cofre.digitarSenha("1");
        }
        catch (RuntimeException e)
        {
            assertEquals("Senha errada. Tente novamente", e.getMessage());
        }
        assertEquals("fechada", cofre.statusPorta());
        assertEquals(true, cofre.travado());
        try
        {
            cofre.abrirPorta();
        }
        catch (RuntimeException e)
        {
            assertEquals("Nao eh possivel abrir a porta;cofre travado com senha", e.getMessage());
        }
        cofre.digitarSenha(" ");
        assertEquals("fechada", cofre.statusPorta());
        assertEquals(false, cofre.travado());
    }
}
