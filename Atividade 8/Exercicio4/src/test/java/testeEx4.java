/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.exercicio4.*;
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
public class testeEx4
{
    Pessoa pessoa = null;
    Original classeTeste = new Original();
//    Mutante1 classeTeste = new Mutante1(); //- morto
//    Mutante2 classeTeste = new Mutante2(); //- morto
//    Mutante3 classeTeste = new Mutante3(); //- morto
    
    @Test
    public void testeDefinirFaixaEtaria()
    {
        pessoa = new Pessoa("Alex", -1);
        assertThrows(IllegalArgumentException.class, () -> classeTeste.definirFaixaEtaria(pessoa));
        pessoa = new Pessoa("Alex", 110);
        assertThrows(IllegalArgumentException.class, () -> classeTeste.definirFaixaEtaria(pessoa));
        pessoa = new Pessoa("Alex", 11);
        assertEquals("Alex eh crianca", classeTeste.definirFaixaEtaria(pessoa));
        pessoa = new Pessoa("Alex", 18);
        assertEquals("Alex eh adolescente", classeTeste.definirFaixaEtaria(pessoa));
        pessoa = new Pessoa("Alex", 58);
        assertEquals("Alex eh adulto", classeTeste.definirFaixaEtaria(pessoa));
        pessoa = new Pessoa("Alex", 60);
        assertEquals("Alex eh idoso", classeTeste.definirFaixaEtaria(pessoa));
    }

}
