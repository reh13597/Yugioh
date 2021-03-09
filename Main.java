import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("./DeckForAPCS.csv"));
        sc.useDelimiter("/");

        while(sc.hasNext()) { // While I still have LINES in this code
            // Within each line, I have to SPLIT by ,
            String[] currLine = sc.next().split(","); // This will give me an array with data in each position.

            //String[] currLine = currLine[0]; // Will always give me the type of data I am dealing with

            //if (currLine[0].equals("MONSTER")) {
                // Create a monster card with all the data

            //} else if (currLine[0].equals("NAME")) {
                // Do logic, create player data

           // }

            System.out.println("****************************");
            System.out.println("============================");
            for (int i = 0; i < 8; i++) {
                System.out.println(sc.next());
            }
        }
        sc.close();
    }
}
