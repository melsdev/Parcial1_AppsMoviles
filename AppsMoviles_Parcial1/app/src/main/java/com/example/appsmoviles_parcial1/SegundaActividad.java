package com.example.appsmoviles_parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
    }
    public void Anterior( View View){
        Intent anterior = new Intent(SegundaActividad.this, ActividadPrincipal.class );
        startActivity(anterior);
    }
}
