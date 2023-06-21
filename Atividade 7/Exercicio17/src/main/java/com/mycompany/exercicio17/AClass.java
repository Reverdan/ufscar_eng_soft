/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio17;

import java.util.ArrayList;

/**
 *
 * @author Rever
 */
public class AClass
{

    private Coder1 coder1;
    private Coder2 coder2;
    private Coder3 coder3;

    public AClass(Coder1 coder1, Coder2 coder2, Coder3 coder3)
    {
        this.coder1 = coder1;
        this.coder2 = coder2;
        this.coder3 = coder3;
    }

    //1
    public String cifrar(ArrayList<String> msg)
    {
        // 2, 3, 4
        if (msg == null || msg.size() == 0 || msg.contains("STOP"))
        {
            //5
            return "INVALID";
        }
        //6,7
        if (coder1.m1(msg) && coder2.m2(msg))
        {
            //8
            return "C1-C2";
        }
        var count = 0;
        //9
        for (String s : msg)
        {
            //10
            if (s.equals("HI"))
            {
                //11
                count++;
            }
        }
        //12
        if (count >= 2)
        {
            //13
            return "2 OR MORE HIs";
        }
        int num = coder3.m3();
        //14
        if (num > 1)
        {
            String ret = "";
            //15
            for (int i = 1; i <= num; i++)
            {
                //16
                ret += "-" + msg.get(0);
            }
            //17
            return ret;
        }
        //18
        return msg.get(0);
    }
}
