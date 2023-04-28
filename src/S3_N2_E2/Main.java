package S3_N2_E2;

import S3_N2_E1.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurantList = new ArrayList<>();

        restaurantList.add(new Restaurant("La gamba", 5.5));
        restaurantList.add(new Restaurant("Asador argentino", 6.7));
        restaurantList.add(new Restaurant("Els cargols", 8.7));
        restaurantList.add(new Restaurant("La gamba", 7.5));
        restaurantList.add(new Restaurant("Asador argentino", 2.7));
        restaurantList.add(new Restaurant("Els cargols", 1.7));
        restaurantList.add(new Restaurant("La gamba", 5.5));

        Set<Restaurant> restaurantSet = new HashSet<>(restaurantList);
        List<Restaurant> restList = new ArrayList<>(restaurantSet);

        Comparator<Restaurant> sortComparatorRestaurant = new RestaurantComparator();

        Collections.sort(restList,sortComparatorRestaurant);

        System.out.println("***** Comparator *****");
        for (Restaurant restaurant : restList) {
            System.out.println("El restaurant "+restaurant.getName()+" puntúa amb:"+restaurant.getScore());
        }

        Set<Restaurant> restListComparable = new TreeSet<>();
        restListComparable.add(new RestaurantComparable("La laguna",5.5));
        restListComparable.add(new RestaurantComparable("El pupurri", 8.5));
        restListComparable.add(new RestaurantComparable("La laguna",5.5));
        restListComparable.add(new RestaurantComparable("La laguna",9.5));

        System.out.println("***** Comparable *****");
        for (Restaurant restaurant : restListComparable) {
            System.out.println("El restaurant "+restaurant.getName()+" puntúa amb:"+restaurant.getScore());
        }
    }
}
