package com.hillel.somov.lessons.lesson13;

import com.hillel.somov.lessons.lesson13.MusicStyles.ClassicMusic;
import com.hillel.somov.lessons.lesson13.MusicStyles.MusicStyles;
import com.hillel.somov.lessons.lesson13.MusicStyles.PopMusic;
import com.hillel.somov.lessons.lesson13.MusicStyles.RockMusic;

public class Main {

    public static void main(String[] args) {

        MusicStyles[] styles = {
                new ClassicMusic("Violins Orchestra "),
                new ClassicMusic("Symphonic Orchestral "),
                new RockMusic("Sepultura "),
                new RockMusic("AC/DC "),
                new PopMusic("ABBA "),
                new PopMusic("Boney M. ")
        };

        for (MusicStyles musicStyles : styles) {
            if (musicStyles != null) {
                musicStyles.playMusic(styles);
            }

        }

    }

}
