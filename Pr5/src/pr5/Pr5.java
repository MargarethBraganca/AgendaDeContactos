/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr5;

import java.util.Scanner;

public class Pr5 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enviarFormApresentacao();
    }

    private static void enviarFormApresentacao() {
        System.out.println("----------Sistema de Gestão de Contactos------------");
        
        if (Utils.concorda()) {
            
            MenuPrincipal.menuPrincipal();
        } else {
            Utils.exit("Programa terminado");
        }
    }

}
