/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cofre;

/**
 *
 * @author Rever
 */
public class Exercicio6
{

    private boolean portaAberta = true;
    private boolean cofreTravado = false;
    private String senhaSalva = "";
    private int tentativas = 0;

    public String statusPorta()
    {
        return portaAberta ? "aberta" : "fechada";
    }

    public boolean travado()
    {
        return cofreTravado;
    }

    public void abrirPorta()
    {
        if (cofreTravado)
        {
            throw new RuntimeException("Nao eh possivel abrir a porta;cofre travado com senha");
        }
        portaAberta = true;
    }

    public void fecharPorta()
    {
        portaAberta = false;
    }

    public void inserirSenha(String senha)
    {
        if (portaAberta)
        {
            throw new RuntimeException("Porta aberta");
        }
        if (cofreTravado)
        {
            throw new RuntimeException("Cofre ja possui senha definida");
        }
        senhaSalva = senha;
        cofreTravado = true;
    }

    public void digitarSenha(String senha)
    {
        if (!senhaSalva.equals(senha) || tentativas >= 2)
        {
            tentativas++;
            var excMsg = tentativas <= 2 ? "Senha errada. Tente novamente"
                    : "Cofre bloqueado por tentativas; reiniciar";
            throw new RuntimeException(excMsg);
        }
        tentativas = 0;
        cofreTravado = false;
        senhaSalva = "";
    }
}
