package com.hillel.somov.lessons.lesson13.MusicStyles;

public class PopMusic extends MusicStyles {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles[] styles) {
        System.out.println(name + "...playing.");

    }

}
