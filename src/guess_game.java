import java.util.Random;
import java.util.Scanner;
public class guess_game {
    public String guess_number_game(int num) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner respond = new Scanner(System.in);
        System.out.println("Please guess number between 0-100");
        System.out.println("Please enter your guess number:");
        int guess_Number = respond.nextInt();
        System.out.println("Your guess number is:" + guess_Number);
        int i = guess_Number;
        while (number != i) {
            if (number < i) {
                System.out.println("Your answer is bigger!Try again:");
                int guess_Number1 = respond.nextInt();
                System.out.println(guess_Number1);
                i = guess_Number1;
            } else {
                System.out.println("Your answer is smaller!Try again:");
                int guess_Number2 = respond.nextInt();
                System.out.println(guess_Number2);
                i = guess_Number2;
            }
        }
        return("You are right! You win!");
    }


    public static void main(String[] args) {
        System.out.println("Do you want to play a game?" +"" + "1 for yes, 2 for No");
        System.out.println("Please enter:");
        Scanner choice = new Scanner(System.in);
        int user_answer = choice.nextInt();
        System.out.println("Your choice:" + user_answer);
        if (user_answer == 1) {
            System.out.println("Game on!");
            guess_game guess_number = new guess_game();
            String r = guess_number.guess_number_game(1);
            System.out.println(r);
        }else{
            System.out.println("See you!");
        }


    }

}

