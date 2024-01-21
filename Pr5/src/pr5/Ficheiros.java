/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Gerusa Kondumula
 */
public class Ficheiros {

    private static final String arquivoP5 = " contactos.dat";

    //ler no ficheiro
    public static ArrayList<Contacto> lerArquivo() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivoP5))) {

            Object obj = inputStream.readObject();
            if (obj instanceof ArrayList) {
                return (ArrayList<Contacto>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
        }
        return new ArrayList<>();
    }

    //escrever no ficheiro
    public static void escreverArquivo(ArrayList<Contacto> listaContactos) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivoP5))) {
            outputStream.writeObject(listaContactos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
