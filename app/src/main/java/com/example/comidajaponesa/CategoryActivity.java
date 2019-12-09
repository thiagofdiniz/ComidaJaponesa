package com.example.comidajaponesa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {
    ListView listView;

    int[] vImage = {R.drawable.appetizers, R.drawable.maindish, R.drawable.salads, R.drawable.drink};
    String[] vNameRecipe = {"Appetizers", "Main Dish", "Salads", "Drink"};
    int[] vIcon = {R.drawable.ic_appetizers, R.drawable.ic_maindish, R.drawable.ic_salad, R.drawable.ic_drink};
    String[] vRecipe = {"5 Recipes", "5 Recipes", "5 Recipes", "5 Recipes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_layout);

        listView = findViewById(R.id.listview);

        MeuAdapter meuAdapter = new MeuAdapter();
        listView.setAdapter(meuAdapter);

    }

    class MeuAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return vRecipe.length;
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

            View view1 = getLayoutInflater().inflate(R.layout.modelocategory_layout, null);

            ImageView fundo = (ImageView) view1.findViewById(R.id.image);
            TextView texto = (TextView) view1.findViewById(R.id.namerecipe);
            ImageView icone = (ImageView) view1.findViewById(R.id.iconrecipe);
            TextView receita = (TextView) view1.findViewById(R.id.recipe);

            fundo.setImageResource(vImage[position]);
            texto.setText(vNameRecipe[position]);
            icone.setImageResource(vIcon[position]);
            receita.setText(vRecipe[position]);
            return view1;
        }
    }
}
