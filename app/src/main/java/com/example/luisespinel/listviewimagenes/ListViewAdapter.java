package com.example.luisespinel.listviewimagenes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Luis Espinel on 13/01/2016.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context contexto;
    private String[] nombre_filas;
    private int[] imagenes_filas;
    private LayoutInflater inflater;

    public ListViewAdapter(Context contexto,String[] texto,int[] imagenes){
        this.contexto=contexto;
        this.nombre_filas=texto;
        this.imagenes_filas=imagenes;
    }

    @Override
    public int getCount() {
        return this.nombre_filas.length-1;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        TextView textView;
        this.inflater=(LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=this.inflater.inflate(R.layout.estilolistview,parent,false);
        imageView=(ImageView)itemView.findViewById(R.id.imViewEstilo);
        textView=(TextView)itemView.findViewById(R.id.textViewEstilo);

        imageView.setImageResource(this.imagenes_filas[position]);
        textView.setText(this.nombre_filas[position]);


        return itemView;
    }
}
