/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author anikettiwari
 */
public class Thread1 extends Thread {
    @Override
    public void run (){
        FilePlayer fp = new FilePlayer();
        String paths [] = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
            for (String path : paths){
            fp.play(path);
           // System.out.println("PLaying");
        }
        
        
        
    }
    
}
