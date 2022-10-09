package com.hillel.somov.lessons.lesson13.MusicStyles;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles[] styles) {
        System.out.println(name + "...playing.");

    }

}
