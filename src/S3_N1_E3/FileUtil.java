package S3_N1_E3;

import java.io.*;
import java.util.*;

public class FileUtil {
    private static final String FILE_PATH = "src\\S3_N1_E3";

    public static HashMap<String, String> readFile() {
        File f = new File(FILE_PATH+"\\countries.txt");
        String line = " ";
        HashMap countriesMap = new HashMap<>();
        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
            while ((line = br.readLine()) != null) {
                String[] gameValues = line.split(" ");
                countriesMap.put(gameValues[0], gameValues[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(countriesMap.entrySet());
        return countriesMap;
    }
    //ToDo: fix when find an empty line
    //ToDo: Try with StringTokenizer

    public static void writeFile(HashMap<String, Integer> resultats) {

        File f = new File(FILE_PATH+"\\resultats.txt");
        try(FileWriter fr = new FileWriter(f); BufferedWriter b = new BufferedWriter(fr)) {
            b.write(resultats.entrySet().toString());
            b.newLine();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



