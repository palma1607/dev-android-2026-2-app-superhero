package br.com.unicuritiba.appsuperhero;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, SuperHeroRepository.ApiResponse  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SuperHeroRepository.getSuperHeroesFromAPI(this);
    }

    @Override
    public void onClick(View v) {
        int id = (int) v.getTag();

        Intent intent = new Intent(this,
                DetailActivity.class);
        intent.putExtra("super", id);
        startActivity(intent);
    }

    @Override
    public void onSuperHeroApiResponse(List<SuperHero> superHeroes) {

        if(superHeroes != null){

            LinearLayout linearLayoutContent = findViewById(R.id.layoutContent);

            for(SuperHero superHero: superHeroes){

                ImageView imageView = new ImageView(this);

                imageView.setOnClickListener(this);
                imageView.setTag(superHero.getId());
                Picasso.get().load(
                        superHero.getImages().getLg()
                ).into(imageView);

                linearLayoutContent.addView(imageView);
            }
        }
    }
}
