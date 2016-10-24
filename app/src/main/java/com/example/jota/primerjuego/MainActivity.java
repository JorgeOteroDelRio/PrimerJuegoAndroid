package com.example.jota.primerjuego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int contador=0;
    String miNumero = "";
    String numeroAleatorio ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = (Button)findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                miNumero="";
                numeroAleatorio="";
                for(int i=0;i<4;i++){
                    int num=(int)(Math.random()*9+0);
                    numeroAleatorio+=String.valueOf(num);
                }
                Toast.makeText(getApplicationContext(), numeroAleatorio, Toast.LENGTH_SHORT).show();
                contador=0;
            }
        });
    }

    void escribirNumero(View v){
        contador++;
        miNumero+=((Button)v).getText();
        if(contador==4){
            if(miNumero.equals(numeroAleatorio)){
                Toast.makeText(getApplicationContext(), "Has acertado!!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(getApplicationContext(), "has fallado, vuelve a intentarlo", Toast.LENGTH_SHORT).show();
            }
            contador=0;
            miNumero="";
        }

    }


}
