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

/**
 *
 * @author luis
 */
public class thread extends Thread {
    private int counter = 0;
    private ArrayList<String> numeros = new ArrayList<String>();

    public int start;
    public int end;
    public String id = "";
    private String errorMessage = "No se puede contar\n";
    public JTextArea taWhereToWrite;

    public thread(String _id) {
        //start = _start;
        //end = _end;
        id = _id;
    }

    public void run() {
        // System.out.println("id" + id);
        // for (int i = 0; i < 10; i++) {
        //     int no = (int) (Math.random() * 9) + 1;
        //     String noS = Integer.toString(no);
        //     System.out.println(id + " -->[" + counter + "] -->" + no);
        //     numeros.add(id + " -->[" + counter + "] -->" + no);
        //     counter++;
        // }

        int no = 1;
        try {
            String ruta = "/home/luis/NetBeansProjects/threads/file.txt";
            muestraContenido(ruta);
            // String contenido = "";
            // Iterator<String> it = numeros.iterator();
            // while (it.hasNext())
            //     contenido = contenido + it.next() + "\n";
            // File file = new File(ruta);
            // if (!file.exists()) {
            //     file.createNewFile();
            // }

            // FileWriter fw = new FileWriter(file);
            // BufferedWriter bw = new BufferedWriter(fw);
            // bw.write(contenido);
            // bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }

    // public static void main(String[] args) throws IOException {
    //     muestraContenido("/home/mario/archivo.txt");
    // }
}



// import java.lang.Thread;
// import java.util.Random;
// class Tuto36 implements Runnable{
//         public static final int MAX=7;
//      private Thread hilo;
//      private String msg;

//      public Tuto36(String m){
//         msg=m;
//         hilo=new Thread(this);
//         hilo.start();
//      }
//      @Override
//      public void run(){

//         System.out.println("iniciando hilo ..."+this.msg);

//         try{

//            for(int i=0;i<=MAX;i++){    
//            Thread.sleep(1000);
//            System.out.println("No. aleatorio generado: "+aleatorio());
//           }

//         }catch(InterruptedException ex){
//                 System.err.println(ex.getCause());
//         }

//         System.out.println("Finalizando hilo..."+this.msg);
//      }

//      public long aleatorio(){
//         long numero;
// Random r=new Random();
//         numero=(long)r.nextInt()*99;
//         return numero;
//      }

// }