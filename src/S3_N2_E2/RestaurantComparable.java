package S3_N2_E2;

import S3_N2_E1.Restaurant;

public class RestaurantComparable extends Restaurant implements Comparable<Restaurant> {

    public RestaurantComparable(String name, double score) {
        super(name, score);
    }

    @Override
    public int compareTo(Restaurant o) {
        RestaurantComparable restaurant = (RestaurantComparable) o;

        if(this.getName().compareTo(restaurant.getName()) < 0) {
            return -1;
        } else if (this.getName().compareTo(restaurant.getName()) > 0) {
            return 1;
        } else {
            if(this.getScore() > restaurant.getScore()) {
                return -1;
            } else if (this.getScore() < restaurant.getScore()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
