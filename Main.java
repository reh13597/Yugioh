import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;


public class Main {
    private static List<Player> players = new ArrayList<>();
    private static List<Monster> monsters = new ArrayList<>();
    private static List<Spell> spells = new ArrayList<>();
    private static List<Trap> traps = new ArrayList<>();
    private static boolean playing;

    private static void importData() throws Exception {
        Scanner sc = new Scanner(new File("./DeckForAPCS.csv"));
        sc.useDelimiter("\n");

        while(sc.hasNext()) { // Loop through each line of your data
            String[] currLine = sc.next().split(",");

            // Loop through each piece of data within each line.
            // In this case, it will contain a monster/name/details/etc.
            if (currLine[0].toUpperCase().contains("PLAYER")) {
                String playerName = "";
                for (int i = 0; i < currLine.length; i++) {
                    if (i == 1) {
                        playerName = currLine[i];
                    }
                }
                Player p = new Player(playerName);
                players.add(p);
                System.out.println(p);

            } else if (currLine[0].toUpperCase().contains("MONSTER")) {
                String monsterName = "";
                String element = "";
                String monsterDesc = "";
                String level = "";
                String attack = "";
                String defense = "";
                for (int j = 0; j < currLine.length; j++) {
                    if (j == 1) {
                        monsterName = currLine[j];
                    } else if (j == 2) {
                        element = currLine[j];
                    } else if (j == 3) {
                        monsterDesc = currLine[j];
                    } else if (j == 4) {
                        level = currLine[j];
                    } else if (j == 5) {
                        attack = currLine[j];
                    } else if (j == 6) {
                        defense = currLine[j];
                    }
                }
                Monster m = new Monster(monsterName, element, monsterDesc,
                level, attack, defense);
                monsters.add(m);
                System.out.println(m);

            } else if (currLine[0].toUpperCase().contains("SPELL")) {
                String spellName = "";
                String spellType = "";
                String spellDesc = "";
                for (int k = 0; k < currLine.length; k++) {
                    if (k == 1) {
                        spellName = currLine[k];
                    } else if (k == 2) {
                        spellType = currLine[k];
                    } else if (k == 3) {
                        spellDesc = currLine[k];
                    }
                }
                Spell s = new Spell(spellName, spellType, spellDesc);
                spells.add(s);
                System.out.println(s);

            } else if (currLine[0].toUpperCase().contains("TRAP")) {
                String trapName = "";
                String trapType = "";
                String trapDesc = "";
                for (int m = 0; m < currLine.length; m++) {
                    if (m == 1) {
                        trapName = currLine[m];
                    } else if (m == 2) {
                        trapType = currLine[m];
                    } else if (m == 3) {
                        trapDesc = currLine[m];
                    }
                }
                Trap t = new Trap(trapName, trapType, trapDesc);
                traps.add(t);
                System.out.println(t);
            }
            // Add code that will put all of the monsters and spells together in some order to make a deck
            // Add the deck to the player
        }
        sc.close();
    }

    public static void Begin() throws Exception{

        Scanner sc = new Scanner(new File("./DeckForAPCS.csv"));
        sc.useDelimiter("\n");

        while (sc.hasNext()) {
            String [] currLine = sc.next().split(",");

            if (currLine[0].toUpperCase().contains("PLAYER")) {
                String playerName = "";
                for (int i = 0; i < currLine.length; i++) {
                    if (i == 1) {
                        playerName = currLine[i];
                    }
                }
                Player p = new Player(playerName);
                players.add(p);
                System.out.println(p + "'s Life Points: 8000");
            }
        }
        sc.close();
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Do you want to play a game?");
        String userInput = myObj.nextLine();

        if (userInput.equals("Yes")) {
            try {
                importData();
                System.out.println("==================================");
                System.out.println("What's your move?");
                userInput = myObj.nextLine();
                System.out.println("==================================");

                if (userInput.equals("Duel")) {
                    try {
                        Begin();
                        System.out.println("DUEL!");
                    } catch (Exception e) {
                        System.out.println("Error occured, error code: " + e);
            }
                }
            } catch (Exception e) {
                System.out.println("Error occured, error code: " + e);
            }
        } else if (userInput.equals("No")) {
            System.out.println("Screw you");
        } else {
            System.out.println("ERROR; INVALID USER INPUT.");
        }
        // while (playing) {
        //     playerOneTakeTurn();
        //     playerTwoTakeTurn();
        // }
    }
}
