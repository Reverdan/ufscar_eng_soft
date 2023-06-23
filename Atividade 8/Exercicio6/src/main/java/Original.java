/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Megaetros
 */
public class Original
{

    int[] num =
    {
        1000, 900, 500, 400, 100, 90, 50, 40,
        10, 9, 5, 4, 1
    };
    String[] rom =
    {
        "M", "CM", "D", "CD", "C", "XC", "L",
        "XL", "X", "IX", "V", "IV", "I"
    };

    public String converterParaRomano(int numero)
    {
        var ret = "";
        var i = 0;
        while (numero > 0)
        {
            if (numero >= num[i])
            {
                ret += rom[i];
                numero -= num[i];
            }
            else
            {
                i++;
            }
        }
        return ret;
    }

}
