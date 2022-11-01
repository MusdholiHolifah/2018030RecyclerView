package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.recyclerview1.models.Food;

public class DetailActivity extends AppCompatActivity {

    ImageView gambar;
    TextView title, price;
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        gambar = findViewById(R.id.food_image);
        title = findViewById(R.id.tv_title_detail);
        price = findViewById(R.id.tv_price_detail);

        Food food = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(food != null) {
            Glide.with(this)
                    .load(food.getLogo())
                    .into(gambar);
            title.setText(food.getName());
            price.setText(food.getPrice());
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Food Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}