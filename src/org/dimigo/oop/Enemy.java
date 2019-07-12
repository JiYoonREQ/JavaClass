package org.dimigo.oop;

public class Enemy {

    public static void main(String[] args) {
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVolume(20);


        System.out.println(mp.getVolume());
    }
}
