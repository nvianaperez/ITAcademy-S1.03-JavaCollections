package S3_N3_E1;

import java.util.Scanner;

public class User {

    public static int readInteger (String message) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int option = 0;
        while(!exit) {
            try {
                System.out.println(message);
                option = sc.nextInt();
                exit = true;
            } catch (Exception e) {
                System.out.println("Error: enter an integer");
            }
        }
        return option;
    }

    public static String readString (String message) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String option = null;
        while(!exit) {
            try {
                System.out.println(message);
                option = sc.nextLine();
                exit = true;
            } catch (Exception e) {
                System.out.println("Error: enter a string");
            }
        }
        return option;
    }
}
