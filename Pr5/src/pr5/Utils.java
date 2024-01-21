/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr5;

/**
 *
 * @author Gerusa Kondumula
 */
public class Utils {
    public static boolean concorda()
    {
        String opcoes[] =
        {
            "Concorda", "Nao Concorda"
        };
        return Apresentacao.enviarLerOpcaoEscolhida(opcoes) == 1;
    }

    public static void exit(String msg)
    {
        System.out.println(msg);
        System.exit(0);
    }

    public static void exit(String msg, int codigo)
    {
        System.out.println(msg);
        System.exit(codigo);
    }

    
}
