import java.util.*;

public class Randough {

 /* public static double Random () {
        double random = Math.random();

        while (random > 100 || random < 0 || random % 10 != 0) {
            random = Math.random();
        }
        return random;
    }*/ 
    
    public static int Random () {
        Random rand = new Random();
        int min = 0;
        int max = 100;
        int random = (rand.nextInt(max - min + 1) + min);

        return random;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Guess the number from 0 to 100: ");
        int input = sc.nextInt();
        if (input > Random()) {
            System.out.println("Too much... Try again: ");
            input = sc.nextInt();
        }
        if (input < Random()) {
            System.out.println("Not enough... Try again: ");
            input = sc.nextInt();
        }
        if (input == Random()) {
            System.out.println("You won!!!");
            System.out.println("The number was: " + Random());
        }
        sc.close();
    }
}
