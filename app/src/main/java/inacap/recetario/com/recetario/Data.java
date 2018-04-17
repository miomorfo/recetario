package inacap.recetario.com.recetario;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

import inacap.recetario.com.recetario.Helpers.DBHelper;
import inacap.recetario.com.recetario.POJOS.Receta;

/**
 * Created by fernando on 17-04-18.
 */

public class Data {
    Context context;
    SQLiteDatabase sqLiteDatabase;
    SQLiteOpenHelper sqLiteOpenHelper;

    public Data(Context context){
        this.context = context;

        sqLiteOpenHelper = new DBHelper(context);
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void open(){
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void close(){
        sqLiteOpenHelper.close();
    }

    public long getItemsCounts(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstants.tableRecetas);
    }

    public void insertReceta(Receta receta){
        ContentValues contentValues = receta.toValues();
        sqLiteDatabase.insert(SQLConstants.tableRecetas,null,contentValues);
    }
    public void insertRecetas(List<Receta> recetas){
        long items = getItemsCounts();
        if(items == 0){
            for (Receta receta: recetas){
                try {
                    insertReceta(receta);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }

            }
        }
    }


}
