/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author laboratorio
 */
public class MyThread extends Thread {

    private String name;
    private MyRunnable runnable;
    
    public MyThread() {
    }

    public MyThread(Runnable r) {
        super(r);
        this.runnable = (MyRunnable) r;
    }
    
    public MyThread(String string) {
        super(string);
        this.name = string;
    }
    
    @Override
    public void run() {
//        for (int i = 0; i < 15; i++) {
//            System.out.println(i+" "+name);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println(Thread.currentThread().getName());
//        }
        
//        runnable.run();
        
    }
    
}
