package com.mycompany.exercicio1;

import java.util.ArrayList;

public class PessoaDAO
{

    RHService rhservice;

    public PessoaDAO(RHService rhservice)
    {
        this.rhservice = rhservice;
    }

    public boolean existePessoa(String nome)
    {
        ArrayList<Pessoa> pessoas = rhservice.getAllPessoas();
        for (Pessoa p : pessoas)
        {
            if (p.getNome().equalsIgnoreCase(nome))
            {
                return true;
            }
        }
        return false;
    }
}
