package com.example.hp.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animate();
    }
    void animate(){

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animcard);
        animation.setStartOffset(200);

        findViewById(R.id.t1).setAnimation(animation);
        findViewById(R.id.t2).setAnimation(animation);

    }

}
