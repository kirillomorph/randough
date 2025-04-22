import java.util.*;

//import javax.sound.sampled.SourceDataLine;

public class Randough {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 0;
        int max = 100;
        int random = (rand.nextInt(max - min + 1) + min);

        System.out.print ("Guess the number between 0 and 100: ");

        Scanner sc = new Scanner(System.in);
        //int input = sc.nextInt();

        while (true) {
            int input = sc.nextInt();

            if (random > input) {
                System.out.print("Not enough... Try again: ");
            } else if (random < input) {
                System.out.print("Too much... Try again: ");
            } else {
                System.out.print("You won!!!");
                break;
            }
        }

        sc.close();
    }
}
