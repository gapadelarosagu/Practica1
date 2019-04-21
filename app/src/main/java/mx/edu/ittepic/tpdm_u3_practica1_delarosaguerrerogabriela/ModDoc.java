package mx.edu.ittepic.tpdm_u3_practica1_delarosaguerrerogabriela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

public class ModDoc extends AppCompatActivity {
    Button eliminar, modificar, regresa;
    EditText rfc, nom_doc,ape_doc,tel;
    DatabaseReference servicioRealtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        rfc = findViewById(R.id.rfc);
        nom_doc = findViewById(R.id.nom_doc);
        ape_doc = findViewById(R.id.ape_doc);
        tel = findViewById(R.id.tel);

        modificar = findViewById(R.id.modifica);
        eliminar = findViewById(R.id.elimina);
        regresa = findViewById(R.id.regresa);

        regresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ModDoc.this, LisDoc.class);
                startActivity(i);
                finish();
            }
        });


    }
}
