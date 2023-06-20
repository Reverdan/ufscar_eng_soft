/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.exercicio1.Pessoa;
import com.mycompany.exercicio1.PessoaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mockito;

/**
 *
 * @author Rever
 */
public class TesteEX1
{
    
    public TesteEX1()
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     
     @Test
     public void testeExistePessoa()
     {
         PessoaDAO mockedPessoaDAO = Mockito.mock(PessoaDAO.class);
         Mockito.when(mockedPessoaDAO.existePessoa(any())).thenReturn(Boolean.TRUE);
         assertEquals(true, mockedPessoaDAO.existePessoa(""));
     }
     
     @Test
     public void testeNaoExistePessoa()
     {
         PessoaDAO mockedPessoaDAO = Mockito.mock(PessoaDAO.class);
         Mockito.when(mockedPessoaDAO.existePessoa(any())).thenReturn(Boolean.FALSE);
         assertEquals(false, mockedPessoaDAO.existePessoa(""));
     }
}
