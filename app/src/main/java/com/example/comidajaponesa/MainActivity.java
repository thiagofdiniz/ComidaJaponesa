package com.example.comidajaponesa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] imagem = {R.drawable.pastasalad, R.drawable.beeflazone, R.drawable.ricerool, R.drawable.drinkred, R.drawable.drinks};
    String[] titulo = {"Pasta Salad", "Beef Lazone", "Rice Rool", "Drink Red", "Drinks"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);




    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagem.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view1 = getLayoutInflater().inflate(R.layout.activity_main, null);

            TextView text = (TextView) view1.findViewById(R.id.titulo);
            ImageView image = (ImageView) view1.findViewById(R.id.imagem);

            text.setText(titulo[position]);
            image.setImageResource(imagem[position]);

            return view1;


        }
    }
}
