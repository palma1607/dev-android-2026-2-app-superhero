package br.com.unicuritiba.appsuperhero;

import com.google.gson.annotations.SerializedName;

public class SuperHero {

    private int id;
    private String name;
    private Biography biography;
    @SerializedName("powerstats")
    private PowerStats powerStats;
    private Images images;

    public SuperHero(int id,
                     String name,
                     Biography biography,
                     PowerStats powerStats,
                     Images images) {
        this.id = id;
        this.name = name;
        this.biography = biography;
        this.powerStats = powerStats;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    public PowerStats getPowerStats() {
        return powerStats;
    }

    public void setPowerStats(PowerStats powerStats) {
        this.powerStats = powerStats;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public static class Biography {

        private String fullname;

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }
    }

    public static class PowerStats{

        private int intelligence;
        private int power;
        private int speed;
        private int combat;

        public int getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getCombat() {
            return combat;
        }

        public void setCombat(int combat) {
            this.combat = combat;
        }
    }

    public static class Images {
        private String xs;
        private String sm;
        private String md;
        private String lg;

        public String getXs() {
            return xs;
        }

        public void setXs(String xs) {
            this.xs = xs;
        }

        public String getSm() {
            return sm;
        }

        public void setSm(String sm) {
            this.sm = sm;
        }

        public String getMd() {
            return md;
        }

        public void setMd(String md) {
            this.md = md;
        }

        public String getLg() {
            return lg;
        }

        public void setLg(String lg) {
            this.lg = lg;
        }
    }

}
