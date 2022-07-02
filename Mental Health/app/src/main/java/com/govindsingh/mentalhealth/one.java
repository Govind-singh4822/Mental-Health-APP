package com.govindsingh.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.VideoView;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath("android.resource://"+getPackageName()+ "/" + R.raw.video1);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();

    }
}