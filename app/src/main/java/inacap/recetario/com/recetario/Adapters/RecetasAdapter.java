package inacap.recetario.com.recetario.Adapters;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import inacap.recetario.com.recetario.POJOS.Receta;
import inacap.recetario.com.recetario.R;

/**
 * Created by fernando on 22-03-18.
 */

public class RecetasAdapter extends RecyclerView.Adapter<RecetasAdapter.ViewHolder> {

    Context context;
    List<Receta> recetas;

    public RecetasAdapter(Context context, List<Receta> recetas){
        this.context = context;
        this.recetas = recetas;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recetaitem,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(recetas.get(position).getNombre());
        holder.personas.setText("Personas: "+ String.valueOf(recetas.get(position).getPersonas())) ;
        holder.descripcion.setText(recetas.get(position).getDescripcion());
        holder.preparacion.setText(recetas.get(position).getPreparacion());


    }

    @Override
    public int getItemCount() {
        return recetas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder   {

        CardView cardView;
        ImageView imageView;
        TextView nombre, personas,descripcion, preparacion; //para reciclar los textviews

        public ViewHolder(View itemView){
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardview);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            personas = (TextView) itemView.findViewById(R.id.persona);
            descripcion = (TextView) itemView.findViewById(R.id.descripcion);
            preparacion = (TextView) itemView.findViewById(R.id.preparacion);
        }

    }
}
