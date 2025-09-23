
import java.util.Scanner;

public class App {
    private static Monster[] monsters;

    public static void main(String[] args) throws Exception {
        System.out.println("--- MONSTER BATTLE ---");

        Monster m1 = new Monster();
        Monster m2 = new Monster();

        System.out.println("M1 health : " + m1.health());
        System.out.println("M2 health : " + m2.health());

        Scanner input = new Scanner(System.in);
        System.out.print("How many monsters will you slay: ");
        int num = input.nextInt();
        monsters = new Monster[num];
        // build all monsters
        for (int i = 0; i < monsters.length; i++) {
            monsters[i] = new Monster(); // TODO add specials
        }
        // GAME LOOP
        int count = 0;

        for (Monster m : monsters) {
            if (m.health() > 50)
                count++;
        }

        System.out.println(count + " monsters have more than 50 healt");

        // WHAT IS THE % OF DEFEATED MONSTERS?
        System.out.println("You have defeated " + percentComplete() + "% of the monsters");

        reportMonsters();

    }

    public static void reportMonsters(){
        System.out.println("\n---Monster Report---");
        for(int i = 0; i < monsters.length; i++){
            System.out.print("[" + i + "]");
            System.out.print("- Health : " + monsters[i].health());
            System.out.print("- Damage : " + monsters[i].damage());
            System.out.print("- Speed : " + monsters[i].speed());
            if(!monsters[i].special().equals(""))
                System.out.print(" - Special : " + monsters[i].special());
            
            System.out.println();
        }

    }

    public static double percentComplete() {
        return 100 - monsterCount(0) / monsters.length * 100;
    }

    /**
     * How many monsters have over the given health
     * 
     * @param health
     * @param arr
     * @return
     */
    public static int monsterCount(int health) {
        int count1 = 0;
        for (Monster m : monsters) {
            if (m.health() > health)
                count1++;
        }
        return count1;
    }

    public static Monster getNextMonster() {
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i].health() > 0)
                return monsters[i];
        }
        return null;
    }
}
