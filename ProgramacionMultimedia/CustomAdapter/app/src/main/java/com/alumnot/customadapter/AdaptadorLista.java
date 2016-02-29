package com.alumnot.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class AdaptadorLista extends ArrayAdapter<DatosUser> {

    ArrayList<DatosUser>datos;

    static class ViewHolder {
        TextView usuario;
        TextView contraseña;
    }

    public AdaptadorLista(Context context, ArrayList<DatosUser> datos) {
        super(context, R.layout.vista_texto,datos);
        this.datos=datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View item = convertView;
        ViewHolder holder;

        if(item == null)
        {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.vista_texto, null);

            holder = new ViewHolder();
            holder.usuario = (TextView)item.findViewById(R.id.usr);
            holder.contraseña = (TextView)item.findViewById(R.id.pass);

            item.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)item.getTag();
        }

        holder.usuario.setText(datos.get(position).getUser());
        holder.contraseña.setText(datos.get(position).getPass());

        return(item);
    }
}
