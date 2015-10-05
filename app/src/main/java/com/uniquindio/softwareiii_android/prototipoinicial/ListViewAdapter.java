package com.uniquindio.softwareiii_android.prototipoinicial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by angel 28/08/2015.
 */
public class ListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    String[] titulos;
    String[] subTitulos;
    int[] imagenes;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] titulos, String[] subTitulos, int[] imagenes) {
        this.context = context;
        this.titulos = titulos;
        this.imagenes = imagenes;
        this.subTitulos = subTitulos;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtTitle;
        TextView txtSubTitle;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_row, parent, false);

        // Locate the TextViews in listview_item.xml
        txtTitle = (TextView) itemView.findViewById(R.id.List_row_title);
        txtSubTitle = (TextView) itemView.findViewById(R.id.List_row_SubTitle);
        imgImg = (ImageView) itemView.findViewById(R.id.List_row_image);

        // Capture position and set to the TextViews
        txtTitle.setText(titulos[position]);
        txtSubTitle.setText(subTitulos[position]);
        imgImg.setImageResource(imagenes[position]);

        return itemView;
    }
}
