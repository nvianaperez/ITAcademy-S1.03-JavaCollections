package S3_N2_E1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Restaurant> restaurantSet = new HashSet<>();

        restaurantSet.add(new Restaurant("La gamba", 5.5));
        restaurantSet.add(new Restaurant("Asador argentino", 6.7));
        restaurantSet.add(new Restaurant("Els cargols", 8.7));
        restaurantSet.add(new Restaurant("La gamba", 8.8));
        restaurantSet.add(new Restaurant("La gamba", 5.5));

        for (Restaurant restaurant : restaurantSet) {
            System.out.println("El restaurant "+restaurant.getName()+" puntúa amb:"+restaurant.getScore());
        }

    }

}
