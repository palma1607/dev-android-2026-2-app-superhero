package br.com.unicuritiba.appsuperhero;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1 ;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);


        ArrayList<SuperHero> superHeroes = SuperHeroRepository.getSuperHeroes();

        Picasso.get().load(
                superHeroes.get(0).getImage()
        ).into(imageView1);

        Picasso.get().load(
                superHeroes.get(1).getImage()
        ).into(imageView2);

    }
}