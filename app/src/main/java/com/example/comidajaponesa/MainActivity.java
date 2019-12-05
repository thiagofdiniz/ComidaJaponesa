package com.example.comidajaponesa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    GridView gridView;

    int[] vPrato = {R.drawable.greeksalmonsalad, R.drawable.pastasalad, R.drawable.beeflazone, R.drawable.ricerool, R.drawable.drinkred, R.drawable.drinks};
    String[] vReceita = {"Ultimate Greek", "Pasta Salad", "Beef Lazone", "Rice Rool", "Drink Red", "Drinks"};
    String[] vMinuto = {"9 min", "7 min", "7 min", "5 min", "3 min", "4 min"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar();

        gridView = findViewById(R.id.gridview);

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return vPrato.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            View view1 = getLayoutInflater().inflate(R.layout.modelo_layout, null);

            ImageView prato = (ImageView) view1.findViewById(R.id.prato);
            TextView receita = (TextView) view1.findViewById(R.id.receita);
            TextView minuto = (TextView) view1.findViewById(R.id.minuto);

            prato.setImageResource(vPrato[position]);
            receita.setText(vReceita[position]);
            minuto.setText(vMinuto[position]);

            return view1;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
