package com.example.dm2.ud02_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText texto1,texto2;
    private TextView res;
    private Button botS,botR,botM,botD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1=findViewById(R.id.texto1);
        texto2=findViewById(R.id.texto2);
        botS=findViewById(R.id.botS);
        botR=findViewById(R.id.botR);
        botM=findViewById(R.id.botM);
        botD=findViewById(R.id.botD);
        res = (TextView)findViewById(R.id.res);



    }

    public void oper(View v) {
        long num1,num2,resul;
        num1=Integer.parseInt(texto1.getText().toString());
        num2=Integer.parseInt(texto2.getText().toString());

        if(v.getId()==R.id.botS){

            resul=num1+num2;
            res.setText("Resultado: ");
            res.setText(res.getText()+" "+ resul);
        }
        if(v.getId()==R.id.botR){

            resul=num1-num2;
            res.setText("Resultado: ");
            res.setText(res.getText()+" "+ resul);

        }
        if(v.getId()==R.id.botM){

            resul=num1*num2;
            res.setText("Resultado: ");
            res.setText(res.getText()+" "+ resul);
        }
        if(v.getId()==R.id.botD){

            resul=num1/num2;
            res.setText("Resultado: ");
            res.setText(res.getText()+" "+ resul);
        }



    }
}
