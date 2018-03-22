package inacap.recetario.com.recetario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import inacap.recetario.com.recetario.POJOS.Receta;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyleRecetas;
    ArrayList<Receta> recetas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createData();
        
        recyleRecetas = (RecyclerView) findViewById(R.id.recyclerecetas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyleRecetas.setLayoutManager(linearLayoutManager);
    }

    public void createData(){
        recetas = new ArrayList<>();
        recetas.add(new Receta("1","sandwich",2,"sandwich de trespisos",
                "poner tres panes..","http://imagen.png",0));

        recetas = new ArrayList<>();
        recetas.add(new Receta("2","fideos",2,"fideos con salsa",
                "hervir agua..","http://imagen.png",0));

        recetas = new ArrayList<>();
        recetas.add(new Receta("3","wasil",1,"lentejas instantáneas",
                "abrir xd..","http://imagen.png",0));

        recetas = new ArrayList<>();
        recetas.add(new Receta("4","sopa",2,"sopa de verduras",
                "hervir agua..","http://imagen.png",0));

        recetas = new ArrayList<>();
        recetas.add(new Receta("5","cuscus",2,"cuscus rico",
                "poner tres panes..","http://imagen.png",0));

        recetas = new ArrayList<>();
        recetas.add(new Receta("6","pescado",2,"pescado con salsa",
                "hervir agua..","http://imagen.png",0));

        recetas = new ArrayList<>();
        recetas.add(new Receta("7","tofu",1,"tofu con champiñones",
                "abrir xd..","http://imagen.png",0));

        recetas = new ArrayList<>();
        recetas.add(new Receta("8","puré",2,"puré de papas",
                "hervir agua..","http://imagen.png",0));


    }
}
