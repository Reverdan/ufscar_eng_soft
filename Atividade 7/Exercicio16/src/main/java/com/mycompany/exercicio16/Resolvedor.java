/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio16;

import java.util.ArrayList;

/**
 *
 * @author Rever
 */
public class Resolvedor
{

        private ClienteRepo repo;

    public Resolvedor(ClienteRepo repo)
    {
        this.repo = repo;
    }

    //1
    public ArrayList<Cliente> definirPromocao(int[] cods) throws Exception
    {
        //2 e 3
        if (cods == null || cods.length == 0)
        {
            //4
            throw new IllegalArgumentException("sem codigo algum");
        }
        //5
        var clientes = new ArrayList<Cliente>();
        for (int cod : cods)
        {
            //6
            Cliente c = repo.getCliente(cod);
            if (c == null)
            {
                //7
                throw new Exception("Codigo do cliente nao valido");
            }
            //8
            clientes.add(c);
        }
        //9
        var resposta = new ArrayList<Cliente>();
        if (clientes.size() >= 3)
        {
// todos ganham 25% de desconto
            //10
            for (Cliente c : clientes)
            {
                //11
                c.setDesconto(25);
                resposta.add(c);
            }
        }
        else
        {
// o 1º cliente ganha 15% 
            //12
            clientes.get(0).setDesconto(15);
            resposta.add(clientes.get(0));
//e, se existir, o 2º ganha 10%
            //13
            if (clientes.size() > 1)
            {
                //14
                clientes.get(1).setDesconto(10);
                resposta.add(clientes.get(1));
            }
        }
        //15
        return resposta;
    }

}
