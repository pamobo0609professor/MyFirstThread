/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstthread;

import java.util.logging.Level;
import java.util.logging.Logger;
import mypackage.MyRunnable;
import mypackage.MyThread;

/**
 *
 * @author laboratorio
 */
public class MyFirstThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyThread my = new MyThread(new MyRunnable("LOL"));
        MyThread my2 = new MyThread(new MyRunnable("PUB"));
        MyThread my3 = new MyThread(new MyRunnable("FF"));
        
        my.start();
        my2.start();
        my3.start();
    }
    
}
