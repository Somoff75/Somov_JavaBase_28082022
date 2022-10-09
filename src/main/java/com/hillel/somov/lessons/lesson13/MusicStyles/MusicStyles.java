package com.hillel.somov.lessons.lesson13.MusicStyles;

public abstract class MusicStyles {

    String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public abstract void playMusic(MusicStyles[] styles);


}
