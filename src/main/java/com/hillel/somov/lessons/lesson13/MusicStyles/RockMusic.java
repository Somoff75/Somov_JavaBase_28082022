package com.hillel.somov.lessons.lesson13.MusicStyles;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles[] styles) {
        System.out.println(name + "...playing.");

    }

}

