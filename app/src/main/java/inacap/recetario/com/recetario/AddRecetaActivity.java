 package inacap.recetario.com.recetario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import inacap.recetario.com.recetario.POJOS.Receta;

 public class AddRecetaActivity extends AppCompatActivity {

    EditText id, nombre, personas, descripcion, preparacion,fav;
    Button add;
    Receta receta;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_receta);

        id = (EditText)findViewById(R.id.id);
        personas = (EditText)findViewById(R.id.personas);
        nombre = (EditText)findViewById(R.id.nombre);
        descripcion = (EditText)findViewById(R.id.descripcion);
        preparacion = (EditText)findViewById(R.id.preparacion);
        fav = (EditText)findViewById(R.id.fav);
        add = (Button) findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                receta = new Receta(id.getText().toString(), nombre.getText().toString(),
                                    Integer.valueOf(personas.getText().toString()),
                                    descripcion.getText().toString(),
                                    preparacion.getText().toString(),
                                    "imagen.jpg",
                                    Integer.valueOf(fav.getText().toString()));

                data = new Data(getApplicationContext());
                data.open();
                data.insertReceta(receta);
                Toast.makeText(getApplicationContext(),
                        "Se agrego la receta",
                        Toast.LENGTH_LONG).show();
                finish();
            }
        });


    }
}
