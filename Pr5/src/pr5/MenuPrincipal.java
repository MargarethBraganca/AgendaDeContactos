/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuPrincipal {

    List<Contacto> contacto = new ArrayList<>();

    public static void menuPrincipal() {

        String nome;
        String telefone;
        Contacto contacto;
        int tamanhoAgenda = 0;

        //tamanhoAgenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um tamanho da agenda"));
        Agenda agenda = new Agenda(tamanhoAgenda);

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1. Adicionar contacto");
            System.out.println("2. Lista um contacto");
            System.out.println("3. Procurar um contacto");
            System.out.println("4. Ver se existe um contacto");
            System.out.println("5. Eliminarr um contacto");
            System.out.println("6. Ver contactos disponiveis");
            System.out.println("7. Ver se agenda está cheia");
            System.out.println("8. Sair");

            System.out.println("Digite uma opção:");
            opcao = teclado.nextInt();

            switch (opcao) {
                //gerir contacto
                case 1:
                    System.out.println("Digite o seu nome :");
                    nome = teclado.next();

                    System.out.println("Digite o seu numero de telefone :");
                    telefone = teclado.next();

                    contacto = new Contacto(nome, telefone);
                    agenda.adicionarContacto(contacto);
                    System.out.println("");
                    break;

                    
                //Lista contacto
                case 2:
                    agenda.listarContacto();
                    System.out.println("");
                    break;

                //Procurar contacto
                case 3:
                    System.out.println("\nDigite um nome :");
                    nome = teclado.next();
                    agenda.procurarContacto(nome);
                    System.out.println("");
                    break;
                //Ver se um contacto existe
                case 4:
                    System.out.println("\nDigite um nome : ");
                    nome = teclado.next();
                    contacto = new Contacto(nome);

                    if (agenda.comprovarExisteContacto(contacto)) {
                        System.out.println("Este contacto  existe");
                    } else {
                        System.out.println("O contacto não existe");
                    }

                    break;
                //Eliminar um contacto
                case 5:

                    System.out.println("\nDigite seu nome : ");
                    nome = teclado.next();
                    contacto = new Contacto(nome);

                    agenda.eliminarContacto(contacto);

                    System.out.println("");
                    break;
                //Ver agenda disponiveis
                case 6:
                    System.out.println("\nHá " + agenda.comprovarSeExisteEspacoLivre() + "contactos");
                    break;
                //ver se agenda está cheia
                case 7:
                    if (agenda.comprovarAngendaEstaCheia()) {
                        System.out.println(" Agenda está cheia");
                    } else {
                        System.out.println("Voce ainda pode registar contactos");
                    }
                    break;

                case 8:
                    System.out.println("Obrigada por participar!");
                    break;
                default:
                    System.out.println("opção inválida, digite novamente");
                    System.out.println("");

            }

        } while (opcao != 8);

    }

}
