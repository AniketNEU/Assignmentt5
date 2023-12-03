/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author anikettiwari
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Thread t1 = new Thread1();
       t1.start();
       Thread t2 = new Thread2();
       t2.start();
        }
    
}
