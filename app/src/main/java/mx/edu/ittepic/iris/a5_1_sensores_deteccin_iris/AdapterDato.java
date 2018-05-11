package mx.edu.ittepic.iris.a5_1_sensores_deteccin_iris;

import android.content.Context;
import android.hardware.Sensor;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OEM on 17/02/2018.
 */

public class AdapterDato extends RecyclerView.Adapter<AdapterDato.ViewHolderDatos> {

    private List<DataProvider> listDatos;
    private Context contexto;

    public AdapterDato(Context contexto, List<DataProvider> listDatos) {
        this.contexto = contexto;
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contexto);
        View view = inflater.inflate(R.layout.item_list,null);

        ViewHolderDatos holder = new ViewHolderDatos(view);

        return (holder);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        //holder.asignarDatos(listDatos.get());
        DataProvider lista = listDatos.get(position);
        holder.txtNombre.setText(lista.getNombre());
        holder.txtFabricante.setText(lista.getFabricante());
        holder.txtVersion.setText(lista.getVersion());
        holder.txtRangoMaximo.setText(lista.getRango_max());
        holder.txtRetrasoMinimo.setText(lista.getRetraso_min());
        holder.txtPotencia.setText(lista.getPotencia());
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtNombre,txtFabricante,txtVersion,txtRangoMaximo,txtRetrasoMinimo,txtPotencia;

        LinearLayout constraint;

        public ViewHolderDatos(View itemView) {
            super(itemView);

            constraint = itemView.findViewById(R.id.miLayout);
            txtNombre = itemView.findViewById(R.id.textView1);
            txtFabricante = itemView.findViewById(R.id.textView2);
            txtVersion = itemView.findViewById(R.id.textView);
            txtRangoMaximo = itemView.findViewById(R.id.textView3);
            txtRetrasoMinimo = itemView.findViewById(R.id.textView6);
            txtPotencia = itemView.findViewById(R.id.textView7);

        }

        /*public void asignarDatos(String sdata) {
            dato.setText(" "+sdata);

        }*/
    }
}




/*
*dato2.setText(sdata + "No. Control");
            dato3.setText(sdata + "Carrera");
*/