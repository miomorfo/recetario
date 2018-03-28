package inacap.recetario.com.recetario;

/**
 * Created by fernando on 27-03-18.
 */

public class SQLConstants {
    //base de datos
    public static final String DB = "bdrecetas.db";

    //tablas
    public static final String tableRecetas = "recetas";

    //COLUMNS
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOMBRE = "nombre";
    public static final String COLUMN_PERSONAS = "personas";
    public static final String COLUMN_DESCRIPCION = "descripcion";
    public static final String COLUMN_PREPARACION = "preparacion";
    public static final String COLUMN_IMAGEN = "imagen";
    public static final String COLUMN_FAV = "fav";

    //QUERY
    public static final String SQL_CREATE_TABLE_RECETAS = "CREATE TABLE " + tableRecetas +
            "( " +
            COLUMN_ID + " TEXT PRIMARY KEY," +
            COLUMN_NOMBRE + " TEXT," +
            COLUMN_PERSONAS + " INT," +
            COLUMN_DESCRIPCION + " TEXT," +
            COLUMN_PREPARACION + " TEXT," +
            COLUMN_IMAGEN + " TEXT," +
            COLUMN_FAV + " INT" + ");";

    public static final String SQL_DELETE = "DROP TABLE " + tableRecetas;



}
