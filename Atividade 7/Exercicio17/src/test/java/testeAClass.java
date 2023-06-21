/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.exercicio17.AClass;
import com.mycompany.exercicio17.Coder1;
import com.mycompany.exercicio17.Coder2;
import com.mycompany.exercicio17.Coder3;
import java.util.ArrayList;
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
public class testeAClass
{

    Coder1 mockedCoder1 = Mockito.mock(Coder1.class);
    Coder2 mockedCoder2 = Mockito.mock(Coder2.class);
    Coder3 mockedCoder3 = Mockito.mock(Coder3.class);

    @Test
    public void testarCifrar1()
    {
        //1,2,3,4,5
        AClass aclass = new AClass(mockedCoder1, mockedCoder2, mockedCoder3);

        ArrayList<String> msg = new ArrayList<>();
        assertEquals("INVALID", aclass.cifrar(msg));
        msg.clear();
        assertEquals("INVALID", aclass.cifrar(msg));
        msg.add("STOP");
        assertEquals("INVALID", aclass.cifrar(msg));
    }

    @Test
    public void testarCifrar2()
    {
        //1,2,6,7,8

        AClass aclass = new AClass(mockedCoder1, mockedCoder2, mockedCoder3);

        Mockito.when(mockedCoder1.m1(ArgumentMatchers.any())).thenReturn(true);
        Mockito.when(mockedCoder2.m2(ArgumentMatchers.any())).thenReturn(true);

        ArrayList<String> msg = new ArrayList<>();
        msg.add("A");
        assertEquals("C1-C2", aclass.cifrar(msg));
    }

    @Test
    public void testarCifrar3()
    {
        //1,2,6,9,10,11,12,13
        AClass aclass = new AClass(mockedCoder1, mockedCoder2, mockedCoder3);

        Mockito.when(mockedCoder1.m1(ArgumentMatchers.any())).thenReturn(false);
        Mockito.when(mockedCoder2.m2(ArgumentMatchers.any())).thenReturn(false);

        ArrayList<String> msg = new ArrayList<>();
        msg.add("A");
        msg.add("HI");
        msg.add("HI");
        msg.add("HI");
        msg.add("HI");
        msg.add("A");

        assertEquals("2 OR MORE HIs", aclass.cifrar(msg));

    }

    @Test
    public void testarCifrar4()
    {
        //1,2,6,9,10,12,14,18
        AClass aclass = new AClass(mockedCoder1, mockedCoder2, mockedCoder3);

        Mockito.when(mockedCoder1.m1(ArgumentMatchers.any())).thenReturn(false);
        Mockito.when(mockedCoder2.m2(ArgumentMatchers.any())).thenReturn(false);
        Mockito.when(mockedCoder3.m3()).thenReturn(1);

        ArrayList<String> msg = new ArrayList<>();
        msg.add("A");

        assertEquals("A", aclass.cifrar(msg));

    }

    @Test
    public void testarCifrar5()
    {
        //1,2,6,9,10,12,14,15,16,17
        AClass aclass = new AClass(mockedCoder1, mockedCoder2, mockedCoder3);

        Mockito.when(mockedCoder1.m1(ArgumentMatchers.any())).thenReturn(false);
        Mockito.when(mockedCoder2.m2(ArgumentMatchers.any())).thenReturn(false);
        Mockito.when(mockedCoder3.m3()).thenReturn(3);

        ArrayList<String> msg = new ArrayList<>();
        msg.add("A");

        assertEquals("-A-A-A", aclass.cifrar(msg));

    }
}
