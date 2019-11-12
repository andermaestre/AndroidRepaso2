package com.example.repaso2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import static com.example.repaso2.MainActivity.VendedorActual;

public class activityConsultar extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        lv=findViewById(R.id.layout);
        ListaAdapter la = new ListaAdapter(this,R.layout.items_lista,VendedorActual.getVentas());
        lv.setAdapter(la);


    }
}
