
import java.util.Scanner;
public class App {
    private static Monster [];
    public static void main(String[] args) throws Exception {
        System.out.println("--- MONSTER BATTLE ---");

        Monster m1 = new Monster();
        Monster m2 = new Monster();

        System.out.println("M1 health : " + m1.health());
        System.out.println("M2 health : " + m2.health());


        Scanner input = new Scanner(System.in);
        System.out.println("How many monsters will you slay : ");
        int num = input.nextInt();
        Monster[] monsters = new Monster[num];
        //build all monsters
        for(int i = 0; i < monsters.length; i++){
            monsters[i] = new Monster();  //TODO add specials
        }
        //GAME LOOP
       int count = 0;

       for(Monster m : monsters){
        if(m.health() > 50) count ++;
       }
    //   for(int i = 0; i < monste.length; i++){
    //    if (monster[i].health >= 50) count++;
    //   }
       System.out.println(count + " monsters have more than 50 healt");


    }
    /**
     * How many monsters have over the given health
     * @param health
     * @param arr
     * @return
     */
    public static int monsterCount(int health, Monster[]){
        int count1 = 0;
        for(Monster m : arr){
            if(m.health() > health) count1++;
        }
        return count1;
        }

        public static Monster getNextMonster(){
            if(Monster[i].health()>0) return Monster[i];
        }
    }


