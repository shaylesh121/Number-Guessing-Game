
package numberguessinggame;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       Random ran= new Random();
       
       int num= ran.nextInt(100)+1;
       int guess=0;
       int Guesses=0;
       
        System.out.println("Guess the number between 1 to 100.");
         
        while(guess!=num){
            System.out.println("Enter your guess:");
            guess=scn.nextInt();
            Guesses++;
            
            if(guess < num){
                System.out.println("Too low! Guess again.");
            }else if(guess > num){
                System.out.println("Too high! Guess again.");
            }else{
                System.out.println("Congratulations!");
                    System.out.println("You guess the number in "+Guesses+" guesses.");
            }
        }    
    }
    
}
