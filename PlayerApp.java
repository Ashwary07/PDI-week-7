import java.util.Scanner;

public class PlayerApp {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // //1
            // System.out.print("Enter the first name of your players: ");
            // String firstName = sc.next(); 

            // //2

            // System.out.print("Enter the last name of your players: ");
            // String lastName = sc.next();

            // //3

            // System.out.print("Enter the nick name of your players: ");
            // String nickName = sc.next();

            // //4

            // System.out.print("Enter the name of their current team: ");
            // String currentTeam = sc.next();

            // //5

            // System.out.print("Enter the name of their last team: ");
            // String lastTeam = sc.next();
            // sc.nextLine();

            // //6

            // System.out.print("Enter the number of Goals they have scored: ");
            // int numberOfGoals = sc.nextInt();

            // //7

            // System.out.print("Enter the number of assists they have scored: ");
            // int numberOfAssists = sc.nextInt();

            //8

            // System.out.print("Enter the number of Goal Contribution they have scored: ");
            // int numberOfGoalContribution = sc.nextInt();
            // // actuall proccessing 
            // Player playerOne = new Player(firstName, lastName, nickName, currentTeam, lastTeam, numberOfGoals, numberOfAssists, numberOfGoalContribution);
            // System.out.println(playerOne.toString());

            Player fotballerOne = new Player("Leo", "Messi", "Pessi", "Miami", "Barca" , 89 , 1 , 90 );
            System.out.println(fotballerOne.getFirstName());
            System.out.println(fotballerOne.getLastName());
            fotballerOne.setFirstName("Ronaldo");
            System.out.println(fotballerOne.getFirstName());

        
    }

    }
}