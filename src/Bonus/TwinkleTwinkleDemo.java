/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bonus;

/**
 *
 * @author anikettiwari
 */
public class TwinkleTwinkleDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        t1.start();
        Thread t2 = new Thread2();
        t2.start();
    }
}
