/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

import javax.swing.JTextArea;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class thread extends Thread {
    public File file;
    public String id = "";

    public thread(String _id, File _file) {
        id = _id;
        file = _file;
    }

    public void run() {

        try {

            for (int i = 0; i < 10; i++) {
                String contenido = "";
                if (file.exists()) {
                    contenido = muestraContenido("/home/luis/NetBeansProjects/threads/file.txt");
                    // System.out.println("contenido del archivo: " + contenido);

                }
                if (contenido == null)
                    contenido = "";
                int no = (int) (Math.random() * 9) + 1;
                if (contenido == "")
                    contenido = id + " -->[" + i + "] -->" + no;
                else
                    contenido = contenido + "\n" + id + " -->[" + i + "] -->" + no;
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                System.out.println("Contenido a agregar: " + contenido);
                bw.write(contenido);
                bw.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String content = "";
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            content = content + "\n" +cadena;
        }
        b.close();
        System.out.println("contenido del archivo: "+ content);
        return content;
    }

}
