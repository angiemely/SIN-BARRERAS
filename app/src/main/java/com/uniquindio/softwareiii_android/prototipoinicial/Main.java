package com.uniquindio.softwareiii_android.prototipoinicial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Main extends Activity {

    ListViewAdapter adapter;

    String[] titulo= new String[]{
            "titulo1",
            "titulo2",
            "titulo3",
            "titulo4",
            "titulo5",
            "titulo6",
            "titulo7",
            "titulo8",
            "titulo9",
            "titulo10",
            "titulo12",
            "titulo12",
            "titulo13",
            "titulo14",
            "titulo15",
            "titulo16",
            "titulo17",
            "titulo18",
            "titulo19",

    };

    String[] subTitulo= new String[]{
            "subTitulo1",
            "subTitulo2",
            "subTitulo3",
            "subTitulo4",
            "subTitulo5",
            "subTitulo6",
            "subTitulo7",
            "subTitulo8",
            "subTitulo9",
            "subTitulo10",
            "subTitulo12",
            "subTitulo12",
            "subTitulo13",
            "subTitulo14",
            "subTitulo15",
            "subTitulo16",
            "subTitulo17",
            "subTiulo18",
            "subTitulo19",
            "subTitulo20",
    };

    int[] imagenes ={
            R.drawable.ic_carreer01,
            R.drawable.ic_carreer02,
            R.drawable.ic_carreer03,
            R.drawable.ic_carreer04,
            R.drawable.ic_carreer05,
            R.drawable.ic_carreer06,
            R.drawable.ic_carreer07,
            R.drawable.ic_carreer08,
            R.drawable.ic_carreer09,
            R.drawable.ic_carreer10,
            R.drawable.ic_carreer11,
            R.drawable.ic_carreer12,
            R.drawable.ic_carreer13,
            R.drawable.ic_carreer14,
            R.drawable.ic_carreer15,
            R.drawable.ic_carreer16,
            R.drawable.ic_carreer17,
            R.drawable.ic_carreer18,
            R.drawable.ic_carreer19,
            R.drawable.ic_carreer20,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView)findViewById(R.id.listView);
        adapter = new ListViewAdapter(this, titulo, subTitulo, imagenes);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(),"posicion " + (i+1), Toast.LENGTH_SHORT).show();
            }
        });
lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {
        Toast.makeText(getApplicationContext(),"presiona largo " + (i+1), Toast.LENGTH_SHORT).show();
    return false;
    }
});
    }
}
