package com.rhino.grainview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rhino.grainview.view.GrainView;

public class MainActivity extends AppCompatActivity {

    private GrainView mGrainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGrainView = findViewById(R.id.GrainView);

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mGrainView.isAnimStarted()) {
                    mGrainView.stopAnim();
                    ((Button)findViewById(R.id.start)).setText("start");
                } else {
                    mGrainView.startAnim();
                    ((Button)findViewById(R.id.start)).setText("stop");
                }
            }
        });

    }
}
