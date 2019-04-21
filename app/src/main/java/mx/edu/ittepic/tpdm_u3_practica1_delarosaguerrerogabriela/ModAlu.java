package mx.edu.ittepic.tpdm_u3_practica1_delarosaguerrerogabriela;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class ModAlu extends AppCompatActivity {
    Button eliminar, modificar, regresa;
    EditText nc_alu, nom_alu, ape_alu, carrera;
    DatabaseReference servicioRealtime;
    ListView listaAlu;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nc_alu = findViewById(R.id.nc_alu);
        nom_alu = findViewById(R.id.nom_alu);
        ape_alu = findViewById(R.id.ape_alu);
        carrera = findViewById(R.id.carrera);
        listaAlu = findViewById(R.id.listaAlu);
        datos = getIntent().getExtras();

        modificar = findViewById(R.id.modifica);
        eliminar = findViewById(R.id.elimina);

        regresa = findViewById(R.id.regresa);

        regresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ModAlu.this, LisAlu.class);
                startActivity(i);
                finish();
            }
        });




    }
}
