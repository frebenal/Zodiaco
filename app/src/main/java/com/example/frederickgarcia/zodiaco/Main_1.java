package com.example.frederickgarcia.zodiaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class Main_1 extends AppCompatActivity {

    EditText usuario;
    EditText pass;
    Button button;
    String contra;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText3);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre=usuario.getText().toString();
                contra=pass.getText().toString();
                int Validador =0;

                Usuarios p1= new Usuarios("Garcia","1234");
                Usuarios p2= new Usuarios("admin","admin");
                Usuarios p3= new Usuarios("Luis","luis");

                ArrayList<Usuarios> Usuarios = new ArrayList<>();
                Usuarios.add(p1);
                Usuarios.add(p2);
                Usuarios.add(p3);

                if (nombre.trim().equals("") && contra.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Campos vacios!!",Toast.LENGTH_SHORT).show();
                }
                else{
                    for (int i=0; i<Usuarios.size();i++){

                        if (Objects.equals(Usuarios.get(i).getName(), nombre)){
                            Toast.makeText(getApplicationContext(),"" + Usuarios.get(i).getName(),Toast.LENGTH_SHORT).show();
                            Validador=1;
                            if(Objects.equals(Usuarios.get(i).getPassword(), contra)){
                                Intent a= new Intent(Main_1.this,Main_2.class);
                                a.putExtra("nombre",usuario.getText().toString());
                                startActivity(a);
                                Toast.makeText(getApplicationContext(),"Bienvenido" ,Toast.LENGTH_SHORT).show();
                                break;
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Tu clave es Incorrecta",Toast.LENGTH_SHORT).show();

                            }

                        }

                    }
                    if (Validador==0){
                        Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecta",Toast.LENGTH_SHORT).show();

                    }


                }


            }
        });

    }
}
