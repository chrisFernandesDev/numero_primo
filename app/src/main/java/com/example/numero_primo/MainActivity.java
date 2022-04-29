package com.example.numero_primo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button buttonCalcular;
    private EditText respostaUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCalcular = findViewById(R.id.btnCalcular);
        respostaUser = findViewById(R.id.resptUser);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Resultado.class);

                int contador = 0;
                String resultadoUser = "";
                int respostaUserNumerica = Integer.parseInt(respostaUser.getText().toString());

                if (respostaUserNumerica >= 1) {
                    for (int i = 1; i <= respostaUserNumerica; i++) {
                        double resultado = respostaUserNumerica % i;
                        if (resultado == 0) {
                            contador = contador + 1;
                        }
                    }
                }

                if (contador == 2) {
                    resultadoUser = "Seu número é Primo";
                } else {
                    resultadoUser = "Seu número não é Primo";

                }

                intent.putExtra("resultado", resultadoUser);
                startActivity(intent);
            }
        });
    }
}