package com.rodrigojulio.psserpente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ImageButton btn_jararaca = findViewById(R.id.btn_jararaca);
        ImageButton btn_cascavel = findViewById(R.id.btn_cascavel);
        ImageButton btn_coral = findViewById(R.id.btn_coral);
        ImageButton btn_surucucu = findViewById(R.id.btn_surucucu);

        btn_jararaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Informações", Toast.LENGTH_SHORT).show();
                Intent chamaJararaca = new Intent(MainActivity.this, JararacaActivity.class);
                startActivity(chamaJararaca);
            }
        });

        btn_cascavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Informações",Toast.LENGTH_SHORT).show();
                Intent chamaCascavel = new Intent(MainActivity.this, CascavelActivity.class);
                startActivity(chamaCascavel);
            }
        });

        btn_coral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Informações", Toast.LENGTH_SHORT).show();
                Intent chamaCoral = new Intent(MainActivity.this, CoralActivity.class);
                startActivity(chamaCoral);
            }
        });

        btn_surucucu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Informações", Toast.LENGTH_SHORT).show();
                Intent chamaSurucucu = new Intent(MainActivity.this, SurucucuActivity.class);
                startActivity(chamaSurucucu);
            }
        });
    }
}
