package com.example.appsmoviles_parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActividadPrincipal extends AppCompatActivity {
    EditText edtVal1, edtVal2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);
        edtVal1 = findViewById(R.id.edtVal1);
        edtVal2 =findViewById(R.id.edtVal2);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String caja1 = edtVal1.getText().toString();
                String caja2 = edtVal2.getText().toString();

                if (!caja1.equals("") && !caja2.equals("")) {
                    if (!caja1.equals("uac123") && !caja2.equals("12345678")) {
                        Toast.makeText(ActividadPrincipal.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                    }else{
                        Intent ingresar = new Intent(ActividadPrincipal.this, SegundaActividad.class);
                        startActivity(ingresar);
                    }
                }else {
                    Toast.makeText(ActividadPrincipal.this, "Por favor, completa todos los campos", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}