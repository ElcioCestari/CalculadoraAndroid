package com.elcio.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Essa activity cria dois EditText e possui um Button,
 * ao clicar no Button chama o metodo onClickSoma e soma
 * os dois EditText e mostra eles em um textView
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSoma(View view) {
        Double valor1 = 0.0;
        Double valor2 = 0.0;

        EditText v1 = findViewById(R.id.editTextValue1);
        EditText v2 = findViewById(R.id.editTextValue2);

        valor1 = Double.parseDouble(v1.getText().toString()) ;
        valor2 = Double.parseDouble(v2.getText().toString());

        TextView textViewResultado = findViewById(R.id.textViewResultado);

        textViewResultado.setText( Double.toString(valor1+valor2));
    }
}
