import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] option = {"Rock", "Paper", "Scissors"};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your choice (0: Rock, 1: Paper, 2: Scissors): ");
        int playerChoice = sc.nextInt();
        int computerChoice = random.nextInt(3);
        System.out.println("You choose: " + option[playerChoice]);
        System.out.println("computer choose: " + option[computerChoice]);
        if(playerChoice == computerChoice){
            System.out.println("it's a tie");
        }else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)){
            System.out.println("you wins");
        }else {
            System.out.println("computer wins");
        }
        sc.close();
    }

}