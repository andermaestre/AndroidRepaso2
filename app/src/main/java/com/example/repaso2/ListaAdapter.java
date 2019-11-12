package com.example.repaso2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListaAdapter extends ArrayAdapter {

    public ArrayList<AcumuladoVentas> lista;
    int res;
    Activity activity;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LinearLayout v=(LinearLayout)activity.getLayoutInflater().inflate(res,parent,false);
        TextView showMes, showTotal;
        showMes=v.findViewById(R.id.showMes);
        showTotal=v.findViewById(R.id.showTotal);
        showMes.setText(String.valueOf(lista.get(position).getMes()));
        showTotal.setText(String.valueOf(lista.get(position).getTotal()));

        if(position%3==0){
            v.setBackgroundColor(Color.CYAN);
        }else if (position%3==1){
            v.setBackgroundColor(Color.YELLOW);
        }else{
            v.setBackgroundColor(Color.RED);
        }

        return v;
    }

    public ListaAdapter(@NonNull Context context, int resource, @NonNull ArrayList<AcumuladoVentas> objects) {
        super(context, resource, objects);
        activity=(activityConsultar)context;
        res=resource;
        lista=objects;
    }

    @Override
    public int getCount() {
        return lista.size();
    }
}
