/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.exercicio16.Cliente;
import com.mycompany.exercicio16.ClienteRepo;
import com.mycompany.exercicio16.Resolvedor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 *
 * @author Rever
 */
public class testeResolvedor
{

    public testeResolvedor()
    {
    }

    @Test
    public void testeDefinirPromocao1() throws Exception
    {
        //1,2,4
        int[] cods = null;
        ClienteRepo clienteRepo = null;
        Resolvedor resolvedor = new Resolvedor(clienteRepo);
        assertThrows(IllegalArgumentException.class, () -> resolvedor.definirPromocao(cods));

        //1,3,4
        int[] cods1 =
        {
        };
        assertThrows(IllegalArgumentException.class, () -> resolvedor.definirPromocao(cods1));
    }

    @Test
    public void testeDefinirPromocao2()
    {
        //1,2,3,5,6,7
        int[] cods =
        {
            1, 2
        };
        ClienteRepo mockedClienteRepo = Mockito.mock(ClienteRepo.class);
        Resolvedor resolvedor = new Resolvedor(mockedClienteRepo);

        Mockito.when(mockedClienteRepo.getCliente(ArgumentMatchers.anyInt())).thenReturn(null);
        assertThrows(Exception.class, () -> resolvedor.definirPromocao(cods));
    }

    @Test
    public void testeDefinirPromocao3() throws Exception
    {
        //1,2,3,5,6,8,9,12,13,15
        int[] cods =
        {
            1
        };
//        ClienteRepo clienteRepo = null;
        ClienteRepo mockedClienteRepo = Mockito.mock(ClienteRepo.class);
        Resolvedor resolvedor = new Resolvedor(mockedClienteRepo);

        Cliente cliente1 = new Cliente(1, "Joao");

        Mockito.when(mockedClienteRepo.getCliente(1)).thenReturn(cliente1);

        assertEquals(1, resolvedor.definirPromocao(cods).size());
        assertEquals(15, resolvedor.definirPromocao(cods).get(0).getDesconto());
    }
    
    @Test
    public void testeDefinirPromocao4() throws Exception
    {
        //1,2,3,5,6,8,9,12,13,14,15
        int[] cods =
        {
            1, 2
        };
//        ClienteRepo clienteRepo = null;
        ClienteRepo mockedClienteRepo = Mockito.mock(ClienteRepo.class);
        Resolvedor resolvedor = new Resolvedor(mockedClienteRepo);

        Cliente cliente1 = new Cliente(1, "Joao");
        Cliente cliente2 = new Cliente(2, "Augusto");

        Mockito.when(mockedClienteRepo.getCliente(1)).thenReturn(cliente1);
        Mockito.when(mockedClienteRepo.getCliente(2)).thenReturn(cliente2);

        assertEquals(2, resolvedor.definirPromocao(cods).size());
        assertEquals(15, resolvedor.definirPromocao(cods).get(0).getDesconto());
        assertEquals(10, resolvedor.definirPromocao(cods).get(1).getDesconto());
    }
    
        @Test
    public void testeDefinirPromocao5() throws Exception
    {
        //1,2,3,5,6,8,9,10,15
        int[] cods =
        {
            1, 2, 3, 4
        };
//        ClienteRepo clienteRepo = null;
        ClienteRepo mockedClienteRepo = Mockito.mock(ClienteRepo.class);
        Resolvedor resolvedor = new Resolvedor(mockedClienteRepo);

        Cliente cliente1 = new Cliente(1, "Joao");
        Cliente cliente2 = new Cliente(2, "Augusto");
        Cliente cliente3 = new Cliente(3, "Alberto");
        Cliente cliente4 = new Cliente(4, "Ian");

        Mockito.when(mockedClienteRepo.getCliente(1)).thenReturn(cliente1);
        Mockito.when(mockedClienteRepo.getCliente(2)).thenReturn(cliente2);
        Mockito.when(mockedClienteRepo.getCliente(3)).thenReturn(cliente3);
        Mockito.when(mockedClienteRepo.getCliente(4)).thenReturn(cliente4);

        assertEquals(4, resolvedor.definirPromocao(cods).size());
        assertEquals(25, resolvedor.definirPromocao(cods).get(0).getDesconto());
        assertEquals(25, resolvedor.definirPromocao(cods).get(1).getDesconto());
        assertEquals(25, resolvedor.definirPromocao(cods).get(2).getDesconto());
        assertEquals(25, resolvedor.definirPromocao(cods).get(3).getDesconto());
    }

}
