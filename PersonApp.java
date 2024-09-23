public class PersonApp
{
       public static void main(String[] args)
    {
        System.out.println(" ");

        Person playerOne = new Person("Jordan", "Henderson", 17, 6, 1990);
        System.out.println("playerOne First Name: " + playerOne.getFirstName());

        System.out.println(" ");

        Person playerTwo = new Person("David", "McMeekin", 7, 3, 1988);
        System.out.println("playerTwo was born in: " + playerTwo.getBirthYear());

        System.out.println(" ");

        Person playerThree = new Person(playerOne);
        System.out.println("playerThree First Name: " + playerThree.getFirstName());

        System.out.println(" ");

        Person playerFour = new Person();
        System.out.println("playerFour First Name: " + playerFour.getFirstName());

        System.out.println(" ");

        if(playerThree.equals(playerFour))
        {
            System.out.println(" ");

            System.out.println("They are the same!");

            System.out.println(" ");
        }
        else
        {
            System.out.println("They are not the same :-(");

            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("Details of playerThree are: " + playerThree.toString());

        System.out.println(" ");

        playerThree.setFirstName("Erin");

        System.out.println(" ");

        System.out.println("playerThree deatils are: " + playerThree.toString());
    }
}
