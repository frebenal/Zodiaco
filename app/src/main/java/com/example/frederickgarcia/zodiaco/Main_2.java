package com.example.frederickgarcia.zodiaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_2 extends AppCompatActivity {
    TextView nom;
    Button btnf;
    Button btnz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        nom=(TextView) findViewById(R.id.nombre);
        Bundle bundle=getIntent().getExtras();
        nom.setText(bundle.getString("nombre"));
        btnf=(Button)findViewById(R.id.button2);

        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f= new Intent(Main_2.this,Main_3.class);
                startActivity(f);
            }
        });

    }
}
