package com.example.repaso2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.repaso2.MainActivity.VendedorActual;

public class activityVendedores extends AppCompatActivity implements View.OnClickListener {
    TextView txtCodigo, txtNombre,txtApellido,txtMes,txtImporte;
    Button btnVendedor, btnAñadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedores);

        txtCodigo=findViewById(R.id.txtCodigo);
        txtNombre=findViewById(R.id.txtNombre);
        txtApellido=findViewById(R.id.txtApellido);
        txtMes=findViewById(R.id.txtMes);
        txtImporte=findViewById(R.id.txtImporte);

        btnVendedor=findViewById(R.id.btnVendedor);
        btnAñadir=findViewById(R.id.btnAñadir);
        btnVendedor.setOnClickListener(this);
        btnAñadir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnVendedor){
            VendedorActual=new Vendedor(Integer.parseInt(txtCodigo.getText().toString()),txtNombre.getText().toString(),txtApellido.getText().toString());
            Toast.makeText(this,"Señor vendedor preparado",Toast.LENGTH_LONG).show();
        }else{
            VendedorActual.registrarVenta(Integer.parseInt(txtMes.getText().toString()),Float.parseFloat(txtImporte.getText().toString()));
            Toast.makeText(this,"Venta añadida",Toast.LENGTH_SHORT).show();

        }
    }
}
