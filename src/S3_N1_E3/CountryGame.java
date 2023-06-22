package S3_N1_E3;


import java.util.*;

public class CountryGame {

    private String namePlayer;
    private int score;
    private HashMap<String,String> countriesMap;
    private List<String> questions;
    private static final int NUMBER_OF_QUESTIONS = 10;

    public CountryGame() {
        this.namePlayer = askForString("Entra el nom del jugador/a: ");
        this.score = 0;
        this.countriesMap = new HashMap<String, String>();
        this.questions = new ArrayList<>();
    }

    public HashMap<String, Integer> playGameWithoutDuplicates (HashMap<String,String> countriesMap) {
        Scanner sc = new Scanner(System.in);
        Set<String> questionsSet = new HashSet<>(NUMBER_OF_QUESTIONS);
        while (questionsSet.size() < NUMBER_OF_QUESTIONS) {
            int random = (int)(Math.floor(Math.random()* countriesMap.size())); // gives a random int 1-52
            questionsSet.add((String) countriesMap.keySet().toArray()[random]);
        }

        Iterator<String> it = questionsSet.iterator();
        while(it.hasNext()) {
            String question = it.next();
            String answer = askForString(String.format("Quina és la capital de: %s?", question));
            if(countriesMap.get(question).equalsIgnoreCase(answer)) {
                score++;
            }
        }
        return resultats(sc);

    }

    private HashMap<String, Integer> resultats(Scanner sc) {
        System.out.println("La puntuació total del jugador: "+namePlayer+" és "+score);
        HashMap<String,Integer> resultats = new HashMap<>();
        resultats.put(namePlayer,score);
        sc.close();
        return resultats;
    }

    private String askForString(String message) {
        Scanner sc = new Scanner(System.in);
        boolean checked = false;
        String input = null;
        while (!checked) {
            try {
                System.out.println(message);
                input = sc.nextLine();
                if(input.isEmpty()) throw new Exception();
                checked = true;
            } catch (Exception e) {
                System.out.println(e.getMessage()+": L'input no pot estar buit.");
            }
        }
        return input;
    }

    //    public HashMap<String, Integer> playGame(HashMap<String,String> countriesMap) {
//        Scanner sc = new Scanner(System.in);
//        List<String> questions = getQuestionList(countriesMap);
//        for (int i = 0; i< NUMBER_OF_QUESTIONS; i++) {
//            Random random = new Random();
//            String questionRandom = questions.get(random.nextInt(questions.size()));
//            System.out.println("Quina és la capital de: "+questionRandom);
//            String answer = sc.nextLine();
//            if(countriesMap.get(questionRandom).equalsIgnoreCase(answer)) {
//                score++;
//            }
//        }
//        System.out.println("La puntuació total del jugador: "+namePlayer+" és "+score);
//        HashMap<String,Integer> resultats = new HashMap<>();
//        resultats.put(namePlayer,score);
//        sc.close();
//        return resultats;
//    }

    //    private static List<String> getQuestionList (HashMap<String,String> countriesMap) {
//        List<String> questions = new ArrayList<>(countriesMap.keySet().stream().toList());
////        System.out.println(questions.size());
////        for ( String q:questions){
////            System.out.println(q);
////        }
//        return questions;
//    }
}




