package org.dimigo.oop;

public class Player {

    public void play()
    {
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVolume(10);


        System.out.println(mp.getVolume());
    }
}
