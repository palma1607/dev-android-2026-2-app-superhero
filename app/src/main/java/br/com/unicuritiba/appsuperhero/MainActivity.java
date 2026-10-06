package br.com.unicuritiba.appsuperhero;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener  {

    private ImageView imageView1 ;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

        ArrayList<SuperHero> superHeroes = SuperHeroRepository.getSuperHeroes();


        imageView1.setTag(superHeroes.get(0).getId());
        Picasso.get().load(
                superHeroes.get(0).getImage()
        ).into(imageView1);

        imageView2.setTag(superHeroes.get(1).getId());
        Picasso.get().load(
                superHeroes.get(1).getImage()
        ).into(imageView2);
    }

    @Override
    public void onClick(View v) {
        int id = (int) v.getTag();

        Intent intent = new Intent(this,
                DetailActivity.class);
        intent.putExtra("super", id);

        startActivity(intent);

    }
}