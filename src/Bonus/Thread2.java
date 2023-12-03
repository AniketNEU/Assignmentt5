/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bonus;

import javaapplication14.FilePlayer;

/**
 *
 * @author anikettiwari
 */
class Thread2 extends Thread {
    @Override
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav",
        "do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
}
