

// public class Person{
//     private
// }

/*
 * Make a class of football players 
 * - will have their firstName
 * - lastName 
 * - nickName
 * - team they currently play for
 * - last team they played for 
 * - no.of goals they have scored 
 * - no. of assist they have 
 * - total number of goal contributoins 
 */


 public class Player {
    private String firstName;
    private String lastName;
    private String nickName;
    private String currentTeam;
    private String lastTeam;
    private int numberOfGoals;
    private int numberOfAssists;
    private int numberOfGoalContribution;

    public Player(String pFirstName, String pLastName, String pNickName, String pCurrentTeam, String pLastTeam, int pNumberOfGoals, int pNumberOfAssists, int pNumberOfGoalContribution) {
        firstName = pFirstName;
        lastName = pLastName;
        nickName = pNickName;
        currentTeam = pCurrentTeam;
        lastTeam = pLastTeam;
        numberOfGoals = pNumberOfGoals;
        numberOfAssists = pNumberOfAssists;
        numberOfGoalContribution = pNumberOfGoalContribution;
    }


    // getter
    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getNickName() {return nickName;}

    public String getCurrentTeam() {return currentTeam;}

    public String getLastTeam() {return lastTeam;}

    public int getNumberOfGoals() {return numberOfGoals;}

    public int getNumberOfAssists() {return numberOfAssists;}

    public int getNumberOfGoalContribution() {return numberOfGoalContribution;}

    // setter

    public void setFirstName(String pFirstName) {firstName = pFirstName;}

    public void setLastName(String pLastName) {lastName = pLastName;}

    public void setNickName(String pNickName) {nickName = pNickName;}

    public void setCurrentTeam(String pCurrentTeam) {currentTeam = pCurrentTeam;}

    public void setLastTeam(String pLastName) {lastName = pLastName;}

    public void setNumberOfGoals(int pNumberOfGoals) {numberOfGoals = pNumberOfGoals;}

    public void setNumberOfAssists(int pNumberOfAssists) {numberOfAssists = pNumberOfAssists;}

    public void setNumberOfGoalContribution(int pNumberOfGoalContribution) {numberOfGoalContribution = pNumberOfGoalContribution;}

    // equals expression
    public boolean equals(Object inObject) {
        boolean isEqual = false;
        Player inPlayer = null;
        if(inObject instanceof Player) {
            inPlayer = (Player)inObject;
            if(firstName.equals(inPlayer.getFirstName()))
                if(lastName.equals(inPlayer.getLastName()))
                    if(nickName.equals(inPlayer.getNickName()))
                        if(currentTeam.equals(inPlayer.getCurrentTeam()))
                            if(lastName.equals(inPlayer.getLastName()))
                                if(numberOfGoals == inPlayer.getNumberOfGoals())
                                    if(numberOfAssists == inPlayer.getNumberOfAssists())
                                        if(numberOfGoalContribution == inPlayer.getNumberOfGoalContribution())
                                            isEqual = true;
        }
        return isEqual;
    }

    public String toString() {
        String finalString =firstName + lastName + " is one the top player in todays footballing world also known as " + nickName + " scored " +numberOfGoals+ " goals and " +numberOfAssists+ " assists making his total goal contribution upto " +numberOfGoalContribution ;
        return finalString;
    }
}
