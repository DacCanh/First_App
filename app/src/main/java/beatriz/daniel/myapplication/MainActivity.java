package beatriz.daniel.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // cria uma activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = findViewById(R. id. btn_enviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etDigiteAqui = findViewById(R. id. et_digite_aqui);//obtém a caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("texto", textoDigitado);
                startActivity(i);

            }
        });
    }
}