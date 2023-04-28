package S3_N2_E2;

import S3_N2_E1.Restaurant;

import java.util.Comparator;

public class RestaurantComparator extends Restaurant implements Comparator <Restaurant> {

    @Override
    public int compare(Restaurant r1, Restaurant r2) {

        int compareByName = r1.getName().compareTo(r2.getName());

        if(compareByName != 0) {
            return compareByName;
        } else {
            return (r1.getScore() < r2.getScore() ? 1 : (r1.getScore() == r2.getScore() ? 0 : -1));
        }
    }
}
