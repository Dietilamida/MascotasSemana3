package com.example.mascotasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ContactoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        findViewById(R.id.button_enviar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarmail();
            }
        });
    }

    private void enviarmail() {
        EditText tvnombre = findViewById(R.id.tvnombre);
        EditText tvcorreo = findViewById(R.id.tvmail);
        EditText tvmensaje = findViewById(R.id.tvmensaje);

        String mensaje = "Nombre: " + tvnombre.getText() + "\nCorreo: " + tvcorreo.getText() + "\nMensaje: " + tvmensaje.getText();

        new SendMail(this, "ines@nucleartesuji.com", "Nuevo mensaje de contacto", mensaje).execute();
    }

}