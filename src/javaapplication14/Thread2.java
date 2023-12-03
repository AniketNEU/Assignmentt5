/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author anikettiwari
 */
public class Thread2 extends Thread{
    @Override
    public void run (){
        FilePlayer fp = new FilePlayer();
        String paths [] = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};
        for (String path : paths){
            fp.play(path);
        }
        
    }
    
}
