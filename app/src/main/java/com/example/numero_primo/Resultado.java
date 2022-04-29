package com.example.numero_primo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {
    private TextView resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Intent intent = getIntent();
        String dadosRecebidos = intent.getStringExtra("resultado");

        resultadoFinal = findViewById(R.id.textResposta);
        resultadoFinal.setText(dadosRecebidos);
    }
}
