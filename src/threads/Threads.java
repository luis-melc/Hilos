/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author luis
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //frmMain ventana = new frmMain();
        //ventana.show();
        thread thread1 = new thread("a");
        thread1.start();
        // thread thread2 = new thread("b");
        // thread2.start();
        // thread thread3 = new thread("c");
        // thread3.start();
        // thread thread4 = new thread("d");
        // thread4.start();
    }

}




// import java.lang.Thread;
//  public class Threads{
       
//     public static void main(String ... args)throws Exception{
//       Tuto36 t1,t2;
//        t1=new Tuto36("Hola java méxico");
//        t2=new Tuto36("Adios java méxico");
//     }
// }