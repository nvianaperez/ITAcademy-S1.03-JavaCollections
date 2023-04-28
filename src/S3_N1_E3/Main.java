package S3_N1_E3;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        CountryGame game1 = new CountryGame();
        HashMap<String,String> countriesMap = FileUtil.readFile();
//        HashMap<String, Integer> resultats = game1.playGame(countriesMap);
        HashMap<String, Integer> resultats = game1.playGameWithoutDuplicates(countriesMap);
        FileUtil.writeFile(resultats);

    }
}





