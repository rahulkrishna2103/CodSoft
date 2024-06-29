import java.util.Scanner;
public class Task1RandomNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        int GuessCount = 0;
        int min = 1;
        int max = 100;
        int RandomNumber = (int) (Math.random()* (max-min+1) + min);
        System.out.println("Random Number Generated");
        System.out.println("Only 10 attempts are allowed \n");
        while(true){
            while(GuessCount <= 10)
            {
                System.out.print("Enter the Your Guess :");
                int UserGuess = sc.nextInt();
                int Result = RandomNumber - UserGuess;
                if(Result > 0)
                {
                    GuessCount++;
                    System.out.println("Your Guess is too Low \n");
                    
                }
                else if(Result < 0)
                {
                    GuessCount++;
                    System.out.println("Your Guess is too High \n");
                    
                }
                else
                {
                    GuessCount++;
                    System.out.println("Your Guess is Correct \n");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Your Attempt limit is Reached");
            }
            else{
                System.out.println("Your Score : "+GuessCount);
                break;
            }
            System.out.print("Do you want to play again (yes or no) : ");
            String PlayAgain = sc.next().toLowerCase();
            if(PlayAgain == "no")
            {
                System.out.println("Game End ");
                break;
            }
            else
            {
                GuessCount=0;
            }
        }
        sc.close();
        
    }
}