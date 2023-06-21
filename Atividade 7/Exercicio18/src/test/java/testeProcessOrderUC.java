/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.exercicio18.EmailSender;
import com.mycompany.exercicio18.Order;
import com.mycompany.exercicio18.ProcessOrderUC;
import com.mycompany.exercicio18.Repository;
import com.mycompany.exercicio18.TransportService;
import com.mycompany.exercicio18.Validator;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 *
 * @author Rever
 */
public class testeProcessOrderUC
{

    Validator mockedValidator = Mockito.mock(Validator.class);
    EmailSender mockEmailSender = Mockito.mock(EmailSender.class);
    TransportService mockedTransportService = Mockito.mock(TransportService.class);
    Repository mockedRepository = Mockito.mock(Repository.class);
    Order mockedOrder = Mockito.mock(Order.class);
    
    
    ProcessOrderUC processOrderUC = new ProcessOrderUC(mockedValidator, mockedRepository);
    List<String> lista = new ArrayList<>();

    @Test
    public void testarProcess1()
    {
        //1,2,3
        
        lista.add("Erro");

        Mockito.when(mockedValidator.validateBasicData(ArgumentMatchers.any())).thenReturn(lista);
        assertThrows(IllegalArgumentException.class, () -> processOrderUC.process(mockedOrder));
    }
    
    @Test
    public void testarProcess2()
    {
        //1,2,4,5,6
        lista.clear();
        
        Mockito.when(mockedTransportService.isDown()).thenReturn(true);
        Mockito.when(mockEmailSender.isOffline()).thenReturn(true);
        assertThrows(RuntimeException.class, () -> processOrderUC.process(mockedOrder));
        
        Mockito.when(mockedTransportService.isDown()).thenReturn(false);
        Mockito.when(mockEmailSender.isOffline()).thenReturn(true);
        assertThrows(RuntimeException.class, () -> processOrderUC.process(mockedOrder));
        
        Mockito.when(mockedTransportService.isDown()).thenReturn(true);
        Mockito.when(mockEmailSender.isOffline()).thenReturn(false);
        assertThrows(RuntimeException.class, () -> processOrderUC.process(mockedOrder));
    }
    
    @Test
    public void testarProcess3()
    {
        //1,2,4,5,7,8,9,10,11
        lista.clear();
        processOrderUC.setService(mockedTransportService);
        processOrderUC.setEmailSender(mockEmailSender);
        Mockito.when(mockedTransportService.isDown()).thenReturn(false);
        Mockito.when(mockEmailSender.isOffline()).thenReturn(false);
        
        List<Integer> listaProdIds = new ArrayList<>();
        listaProdIds.add(1);
        listaProdIds.add(2);
        listaProdIds.add(3);
        listaProdIds.add(4);
        listaProdIds.add(5);
        Mockito.when(mockedOrder.getProdIds()).thenReturn(listaProdIds);
        Mockito.when(mockedOrder.getCode()).thenReturn(40);
        Mockito.when(mockedOrder.getAddress()).thenReturn("Endereco");
        Mockito.when(mockedOrder.getEmail()).thenReturn("Email");
        Mockito.when(mockedOrder.getDesc()).thenReturn("Descricao");
        
        
        
        Mockito.when(mockedRepository.orderProduct(1)).thenReturn(false);
        Mockito.when(mockedRepository.orderProduct(2)).thenReturn(true);
        Mockito.when(mockedRepository.orderProduct(3)).thenReturn(false);
        Mockito.when(mockedRepository.orderProduct(4)).thenReturn(true);
        Mockito.when(mockedRepository.orderProduct(5)).thenReturn(false);
        
        Mockito.when(mockedTransportService.makeTag(ArgumentMatchers.anyInt(), ArgumentMatchers.anyString())).thenReturn(10);
        Mockito.when(mockEmailSender.sendEmail(ArgumentMatchers.anyString(), ArgumentMatchers.anyString(), ArgumentMatchers.anyString())).thenReturn(15);
        
        int[] resposta = processOrderUC.process(mockedOrder);
        
        assertEquals(10, processOrderUC.process(mockedOrder)[0]);
        assertEquals(15, processOrderUC.process(mockedOrder)[1]);
        assertEquals(2, processOrderUC.process(mockedOrder)[2]);
        assertEquals(3, processOrderUC.process(mockedOrder)[3]);
    }
}
