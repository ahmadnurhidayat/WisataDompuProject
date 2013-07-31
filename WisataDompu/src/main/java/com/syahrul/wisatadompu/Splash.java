package com.syahrul.wisatadompu;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Splash extends Activity {
    TextView app,author;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.act_splash);

        app = (TextView) findViewById(R.id.app);
        author = (TextView) findViewById(R.id.syahrul);
        btn = (Button) findViewById(R.id.bt);

        Typeface myfont = Typeface.createFromAsset(getAssets(),"fonts/lanenar.ttf");

        app.setTypeface(myfont);
        author.setTypeface(myfont);
        btn.setTypeface(myfont);
    }

}
