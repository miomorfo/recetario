package inacap.recetario.com.recetario.Adapters;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import inacap.recetario.com.recetario.R;

/**
 * Created by fernando on 22-03-18.
 */

public class RecetasAdapter {



    public class ViewHolder extends RecyclerView.ViewHolder {

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
