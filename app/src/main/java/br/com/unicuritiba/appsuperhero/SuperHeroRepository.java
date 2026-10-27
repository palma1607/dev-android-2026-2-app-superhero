package br.com.unicuritiba.appsuperhero;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class SuperHeroRepository {

    public static ArrayList<SuperHero> getSuperHeroes() {

        ArrayList<SuperHero> superHeroes = new ArrayList<>();


      /*  superHeroes.add(
                new SuperHero(
                        1, "A-Bomb", "Richard Milhouse Jones",
                        38, 100, 17, 64,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        2, "Abe Sapien", "Abraham Sapien",
                        88, 28, 35, 85,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/2-abe-sapien.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        3, "Abin Sur", "Abin Sur",
                        50, 90, 53, 65,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/3-abin-sur.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        4, "Abomination", "Emil Blonsky",
                        63, 80, 53, 95,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/4-abomination.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        5, "Abraxas", "Abraxas",
                        88, 63, 83, 55,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/5-abraxas.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        6, "Absorbing Man", "Carl Creel",
                        38, 80, 25, 64,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/6-absorbing-man.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        7, "Adam Monroe", "Adam Monroe",
                        63, 10, 12, 64,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/7-adam-monroe.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        8, "Adam Strange", "Adam Strange",
                        69, 10, 33, 50,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/8-adam-strange.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        10, "Agent Bob", "Bob",
                        10, 8, 13, 20,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/10-agent-bob.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        11, "Agent Zero", "Christoph Nord",
                        75, 28, 38, 95,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/11-agent-zero.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        12, "Air-Walker", "Gabriel Lan",
                        50, 85, 100, 40,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/12-air-walker.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        13, "Ajax", "Francis",
                        56, 48, 35, 55,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/13-ajax.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        14, "Alan Scott", "Alan Scott",
                        63, 80, 23, 32,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/14-alan-scott.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        15, "Alex Mercer", "Alexander J. Mercer",
                        50, 80, 42, 50,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/15-alex-mercer.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        17, "Alfred Pennyworth",
                        "Alfred Thaddeus Crane Pennyworth",
                        63, 10, 17, 55,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/17-alfred-pennyworth.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        18, "Alien", "Xenomorph",
                        50, 28, 42, 60,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/18-alien.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        20, "Amazo", "Amazo",
                        63, 100, 83, 100,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/20-amazo.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        23, "Angel", "Liam",
                        75, 30, 58, 75,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/23-angel.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        24, "Angel", "Warren Kenneth Worthington III",
                        63, 13, 46, 42,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/24-angel.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        25, "Angel Dust", "Christina",
                        38, 55, 23, 30,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/25-angel-dust.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        26, "Angel Salvadore", "Angel Salvadore",
                        38, 10, 28, 60,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/26-angel-salvadore.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        28, "Animal Man", "Bernhard Baker",
                        56, 48, 47, 80,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/28-animal-man.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        29, "Annihilus", "Annihilus",
                        75, 80, 47, 64,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/29-annihilus.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        30, "Ant-Man", "Hank Pym",
                        100, 18, 23, 32,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/30-ant-man.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        31, "Ant-Man II", "Scott Lang",
                        75, 18, 17, 30,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/31-ant-man-ii.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        32, "Anti-Monitor", "Anti-Monitor",
                        88, 100, 50, 90,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/32-anti-monitor.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        34, "Anti-Venom", "Eddie Brock",
                        75, 60, 65, 84,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/34-anti-venom.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        35, "Apocalypse", "En Sabah Nur",
                        100, 100, 33, 60,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/35-apocalypse.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        36, "Aquababy", "Arthur Curry, Jr.",
                        10, 16, 12, 14,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/36-aquababy.jpg"
                )
        );

        superHeroes.add(
                new SuperHero(
                        37, "Aqualad", "Garth",
                        63, 44, 42, 60,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/37-aqualad.jpg"
                )
        );


        superHeroes.add(
                new SuperHero(
                        226,
                        "Doctor Strange",
                        "Stephen Strange",
                        100,
                        100,
                        12,
                        60,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/226-doctor-strange.jpg"
                )

        );

        superHeroes.add(
                new SuperHero(
                        346,
                        "Iron Man",
                        "Tony Stark",
                        100,
                        100,
                        58,
                        64,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/346-iron-man.jpg"
                )

        );

        superHeroes.add(
                new SuperHero(
                        620,
                        "Spider-Man",
                        "Peter Parker",
                        90,
                        74,
                        67,
                        85,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/620-spider-man.jpg"
                )

        );

        superHeroes.add(
                new SuperHero(
                        530,
                        "Punisher",
                        "Frank Castle",
                        69,
                        42,
                        21,
                        100,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/530-punisher.jpg"
                )

        );

        superHeroes.add(
                new SuperHero(
                        697,
                        "Vision",
                        "Vision",
                        100,
                        100,
                        54,
                        70,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/697-vision.jpg"
                )

        );

        superHeroes.add(
                new SuperHero(
                        332,
                        "Hulk",
                        "Bruce Banner",
                        88,
                        98,
                        63,
                        85,
                        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/332-hulk.jpg"
                )

        );*/


        return superHeroes;
    }

    public static SuperHero getSuperHeroById(int id) {
        ArrayList<SuperHero> superHeroes = getSuperHeroes();

        for (SuperHero superHero : superHeroes) {
            if (superHero.getId() == id) {
                return superHero;
            }
        }

        return null;
    }

    public static void getSuperHeroesFromAPI(ApiResponse apiResponse) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cdn.jsdelivr.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SuperHeroService service = retrofit.create(SuperHeroService.class);

        Call<List<SuperHero>> repos = service.listSuper();

        repos.enqueue(new Callback<List<SuperHero>>() {
            @Override
            public void onResponse(Call<List<SuperHero>> call,
                                   Response<List<SuperHero>> response) {

                if(response.isSuccessful()){

                    List<SuperHero> responseSuperHero = response.body();

                    apiResponse.onSuperHeroApiResponse(responseSuperHero);
                }else{
                    apiResponse.onSuperHeroApiResponse(null);
                }
            }

            @Override
            public void onFailure(Call<List<SuperHero>> call,
                                  Throwable t) {
                apiResponse.onSuperHeroApiResponse(null);
            }
        });
    }

    public interface SuperHeroService {
        @GET("gh/akabab/superhero-api@0.3.0/api/all.json")
        Call<List<SuperHero>> listSuper();
    }

    public interface ApiResponse {
        void onSuperHeroApiResponse(List<SuperHero> superHeroes);
    }
}
