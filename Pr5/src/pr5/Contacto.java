/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr5;

import java.io.Serializable;

public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;
    private static int proximoId = 1;
    private int id;
    private String nome;
    private String telefone;

    public Contacto(String nome, String telefone) {
        this.id = proximoId++;
        this.nome = nome;

        if (validarNumeroTelefone(telefone)) {
            this.telefone = telefone;
        } else {
            System.out.println("Numero de telefone inválido");
            this.telefone = "";
        }

    }

    public Contacto(String nome) {
        this.nome = nome;
        this.telefone = "";
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Contacto.proximoId = proximoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //se tiver conatcto repetido  retorna  true, caso o contrario retorna false
    public boolean equals(Contacto contacto) {
        if (this.nome.trim().equalsIgnoreCase(nome)) {

            return true;
        }
        return false;
    }

    //validar numero de telefone Angola.
    private boolean validarNumeroTelefone(String telefone) {
        return telefone.matches("\\+\\d{1,9}");     // Verificar se o número de telefone começa com '+' e contém até 9 dígitos
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + "\n telefone:" + telefone + "\n";
    }

}
