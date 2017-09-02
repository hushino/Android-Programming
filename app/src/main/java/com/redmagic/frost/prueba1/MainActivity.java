package com.redmagic.frost.prueba1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View btn;
// son metodos diferentes para implementar el toast y demas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.buttonMain);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cualquiercosa) {
                Toast.makeText(MainActivity.this,"Soy una tostada", Toast.LENGTH_SHORT).show();
            }
        });

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
}















