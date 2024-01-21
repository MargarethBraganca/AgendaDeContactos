/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr5;

public class Agenda {

    private Contacto contactos[];

    public Agenda() {
        contactos = new Contacto[10];
    }

    public Agenda(int tamanho) {
        contactos = new Contacto[tamanho];
    }

    //metodo para gerir os contactos na agenda
    public void adicionarContacto(Contacto contacto) {
        if (comprovarExisteContacto(contacto)) { // se o nome já existe.
            System.out.println("já existe um contacto com este nome, por favor digite outro nome!");
        } 
        else if (comprovarAngendaEstaCheia()) {
             //System.out.println("olbbbb 1");
            System.out.println("Agenda está cheia");

        } 
        else {
            boolean registrado = false;
            for (int i = 0; i < contactos.length && !registrado; i++) {
                if (contactos[i] == null) { //se a agenda esta vazia ou nula , guarda um valor
                    contactos[i] = contacto;// guarda aqui o valor contacto
                    registrado = true;
                }
            }
            System.out.println("olaa1");
            if (registrado == true) {
                System.out.println("Contacto adicionado com sucesso");
            } else {
                System.out.println("não pode adicionar contacto");
            }
        }

    }

    //metodo para comprovar se existe contacto com o mesmo nome
    public boolean comprovarExisteContacto(Contacto contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {//se o contacto nao está vazio e se repete return true
                return true;
            }
        }
        return false;
    }
    //metodo para comprova se na agenda esta cheia

    public boolean comprovarAngendaEstaCheia() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }
        return true;
    }

    //criar metodo para listar contacto
    public void listarContacto() {
        if (comprovarSeExisteEspacoLivre() == contactos.length) { // se existe agenda vazia com contacto tamanho zero
            System.out.println(" Não tem contacto para listar");// se percorre a agenda no metodo comprovarSeExisteEspacoLivre
        } 
        else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println("Nome:" + contactos[i].getNome());
                    System.out.println("telefone:" + contactos[i].getTelefone());
                }
            }

        }

    }

    //vai percorrer por toda a agenda para ver esta vazia
    public int comprovarSeExisteEspacoLivre() {
        int contadorVazio = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contadorVazio++;
            }
        }
        return contadorVazio;
    }

    //Procurar um contacto pelo nome.
    public void procurarContacto(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {//percorre a lista de contactos encontrados
            if (contactos[i] != null && contactos[i].getNome().trim().equalsIgnoreCase(nome)) {//verificar se o cacto não está vazio e que está na mesma posição que o nome
                System.out.println("\n Contacto encontrado , seu telefone é " + contactos[i].getTelefone());
                encontrado = true;
            }
        }
        if (!encontrado) { // se não for encontrado
            System.out.println(" Contacto não encontrado");
        }
    }

    //metodo para eliminar um contacto
    public void eliminarContacto(Contacto contacto) {
        boolean eliminado = false;
        for (int i = 0; i < contactos.length && !eliminado; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                contactos[i] = null;
                eliminado = true;
            }
        }
        if (eliminado == true) {
            System.out.println("\nContacto eliminado");
        } else {
            System.out.println("\nSem Contacto  para eliminar");
        }
    }
}
