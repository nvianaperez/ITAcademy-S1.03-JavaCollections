package S3_N3_E1;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileUtils {
    private static String FIRST_LINE = null;

    public static void createFile() {

        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("person.csv", true)))) {
            FIRST_LINE =  "--- Name --- Surname --- Dni ---\n";
            pw.append(FIRST_LINE);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void insertSeparator() {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("person.csv", true)))) {
            FIRST_LINE =  "--------------------------------\n";
            pw.append(FIRST_LINE);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void writeFile (Person p) {
        try (PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream("person.csv",true)))) {
            String[] array = new String[3];
            array[0] = p.getName();
            array[1] = p.getSurname();
            array[2] = p.getDni();
            StringBuilder line = new StringBuilder("");
            for(int i=0; i<array.length; i++) {
                line.append(array[i]);
                if(i<array.length -1) {
                    line.append(";");
                }
            }
            line.append("\n");
            System.out.println(line);
            printWriter.append(line);

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

    }

}


