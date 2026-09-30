package br.com.unicuritiba.appsuperhero;

import java.util.ArrayList;

public class SuperHeroRepository {

    public static ArrayList<SuperHero> getSuperHeroes(){

        ArrayList<SuperHero> superHeroes = new ArrayList<>();

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

        return superHeroes;
    }

    public static SuperHero getSuperHeroById(int id){
        ArrayList<SuperHero> superHeroes = getSuperHeroes();

        for(SuperHero superHero : superHeroes){
            if(superHero.getId() == id){
                return superHero;
            }
        }

        return null;
    }


}
