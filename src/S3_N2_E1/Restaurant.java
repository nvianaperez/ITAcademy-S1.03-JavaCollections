package S3_N2_E1;

import java.util.Objects;

public class Restaurant {

    private String name;
    private double score;

    public Restaurant(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Restaurant() {
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Restaurant)) return false;
//        Restaurant restaurant = (Restaurant) o;
//        return this.getName().equals(restaurant.getName()) && this.getScore()==restaurant.getScore();
//    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Restaurant) {
            Restaurant restaurant = (Restaurant) o;
            if(this.name.equals(restaurant.getName()) && this.score == restaurant.getScore()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
//        System.out.println(Objects.hash(getName(), getScore()));
        return Objects.hash(getName(), getScore());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
