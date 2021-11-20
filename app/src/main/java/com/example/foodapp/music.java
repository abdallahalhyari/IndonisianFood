package com.rajendra.foodapp;

import android.content.Context;
import android.media.MediaPlayer;

final class music {
 static    MediaPlayer mediaPlayer;
    Context context;
    public static int n=1;
    music(MediaPlayer mediaPlayer ,Context context) {
        this.mediaPlayer = mediaPlayer;
        this.context=context;
    }



    public static void pause() {
        mediaPlayer.pause();

    }

    public static void start() {
    mediaPlayer.start();
    }
}

