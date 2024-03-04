import java.util.Random;
import java.util.Scanner;

public class Number_game 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int random_num, guessed_num, attempts_left, rounds_won=0, rounds_played=0;
        String play_again = "y";

        System.out.println("\t \t \t \t !!!!Welcome to the Number Game!!!!");

        while(play_again.equals("y"))
        {
            random_num = r.nextInt(100) + 1;

            rounds_played++;
            System.out.println("\t \t \t \t \t     Round : "+rounds_played);

            attempts_left=10;
            System.out.print("Guess a number between 1 to 100 !! You have 10 attempts available : ");

            while(attempts_left!=0)
            {
                guessed_num = sc.nextInt();
                
                if(guessed_num == random_num)
                {
                    System.out.println(">>>> Booyah u guessed the correct one <<<<");
                    rounds_won++;
                    break;
                }
                else if(guessed_num > random_num)
                {
                    System.out.println("Your guessed number is higher than the actual number !");
                }
                else
                {
                    System.out.println("Your guessed number is lower than the actual number !");
                }
                attempts_left--;
                if(attempts_left == 0)
                {
                    System.out.println("You Loose ! You ran out of your attempts!");
                }
                else
                {
                    System.out.print("You have "+attempts_left+" attempts left Plzz try again : ");
                }
            }
            System.out.println("rounds played : "+rounds_played+"\t Rounds won : "+rounds_won+"\t rounds loose : "+(rounds_played-rounds_won));
            System.out.print("Do you want to play again? (y/n) : ");
            play_again=sc.next();
        }
        System.out.println("Thanks for playing !!!! See you soon");
        sc.close();
    }
}
