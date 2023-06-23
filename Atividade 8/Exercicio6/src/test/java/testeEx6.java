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

/**
 *
 * @author Megaetros
 */
public class testeEx6
{
    Original classeTeste = new Original();
//    Mutante1 classeTeste = new Mutante1();// - morto
//    Mutante2 classeTeste = new Mutante2();// - morto
//    Mutante3 classeTeste = new Mutante3();// - morto
    
    @Test
    public void testarConverterParaRomano()
    {
        assertEquals("", classeTeste.converterParaRomano(-1));
        assertEquals("", classeTeste.converterParaRomano(0));
        assertEquals("I", classeTeste.converterParaRomano(1));
        assertEquals("IV", classeTeste.converterParaRomano(4));
        assertEquals("V", classeTeste.converterParaRomano(5));
        assertEquals("IX", classeTeste.converterParaRomano(9));
        assertEquals("X", classeTeste.converterParaRomano(10));
        assertEquals("XL", classeTeste.converterParaRomano(40));
        assertEquals("L", classeTeste.converterParaRomano(50));
        assertEquals("XC", classeTeste.converterParaRomano(90));
        assertEquals("C", classeTeste.converterParaRomano(100));
        assertEquals("CD", classeTeste.converterParaRomano(400));
        assertEquals("D", classeTeste.converterParaRomano(500));
        assertEquals("CM", classeTeste.converterParaRomano(900));
        assertEquals("M", classeTeste.converterParaRomano(1000));
    }
}
