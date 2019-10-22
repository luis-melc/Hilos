/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

import java.io.IOException;
import javax.swing.JTextArea;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // myClass contador = new myClass();
        String ruta = "/home/luis/NetBeansProjects/threads/file.txt";
        File file = new File(ruta);
        if (!file.exists()) {
            file.createNewFile();
        }
        // contador.valor = 1;
        thread thread1 = new thread("a",file);
        thread1.start();
        thread thread2 = new thread("b",file);
        thread2.start();
    }

}

// import java.lang.Thread;
// public class Threads{

// public static void main(String ... args)throws Exception{
// Tuto36 t1,t2;
// t1=new Tuto36("Hola java méxico");
// t2=new Tuto36("Adios java méxico");
// }
// }