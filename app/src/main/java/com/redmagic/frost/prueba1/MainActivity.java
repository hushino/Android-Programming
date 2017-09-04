package com.redmagic.frost.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.luolc.emojirain.EmojiRainLayout;

public class MainActivity extends AppCompatActivity {

    private Button start, stop;

    //private View btn;
    // protected WindowManager wm;
    //protected WindowManager.LayoutParams params;
    // son metodos diferentes para implementar el toast y demas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.buttonStart);
        stop = findViewById(R.id.buttonStop);

        start.setOnClickListener((View.OnClickListener) this);
        stop.setOnClickListener((View.OnClickListener) this);

        /*wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        params = new WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                PixelFormat.TRANSLUCENT);

        //wm.setOutsideTouchable(true);

        params.gravity = Gravity.NO_GRAVITY;*/
        // bind view
        EmojiRainLayout mContainer = findViewById(R.id.group_emoji_container);


        // add emoji sources
        mContainer.addEmoji(R.drawable.emoji_1_3);
        mContainer.addEmoji(R.drawable.emoji_2_3);
        mContainer.addEmoji(R.drawable.emoji_3_3);
        mContainer.addEmoji(R.drawable.emoji_4_3);
        mContainer.addEmoji(R.drawable.emoji_5_3);


        // set emojis per flow, default 6
        mContainer.setPer(1);

        // set total duration in milliseconds, default 8000, 9..L son 3 years
        mContainer.setDuration((int) 99999999999L);

        // set average drop duration in milliseconds, default 2400
        mContainer.setDropDuration(4400);

        // set drop frequency in milliseconds, default 500
        mContainer.setDropFrequency(1500);

        mContainer.startDropping();


    }

    public void onClick(View view) {
        if (view == start) {
            startService(new Intent(this, MyService.class));
        } else if (view == stop) {
            stopService(new Intent(this, MyService.class));
        }
    }

}

        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);*/
//Le especificamos (Button) para que despues btn. me muestre solo clases de button aun que es redundante
       /* btn = findViewById(R.id.buttonMain);*/
// btn.setOnClickListener(this);
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Soy una tostada", Toast.LENGTH_SHORT).show();

            }
        });
    }*/




    /*@Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Soy una tostada", Toast.LENGTH_LONG).show();

    }*/
















