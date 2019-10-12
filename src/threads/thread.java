/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

import javax.swing.JTextArea;
/**
 *
 * @author luis
 */
public class thread extends Thread{
    private int counter = 0;
    public int start;
    public int end;
    public String id = "";
    private String errorMessage = "No se puede contar\n";
    public JTextArea taWhereToWrite;

    public thread(JTextArea taOutput, int _start, int _end, String _id){
        taWhereToWrite = taOutput;
        start = _start;
        end = _end;
        id = _id;
    }

    public void run(){
        if(start > end){
            doWrite(errorMessage);
        }
        else{
            for (counter = start; counter<end;counter++){
                doWrite("\n" + id + ": " + counter);
            }
        }
    }

    public void doWrite(String message){
        taWhereToWrite.setText(taWhereToWrite.getText() + message);
    }
    
}
