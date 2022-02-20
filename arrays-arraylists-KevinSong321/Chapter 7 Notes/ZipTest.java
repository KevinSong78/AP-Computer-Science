
import java.util.Scanner;

public class ZipTest
{
    public static void main(String[] args)
    {
        // test class only allows exactly three objects to be specified and created
        PersonWithZip[] people = new PersonWithZip[3];

        Scanner scanner = new Scanner(System.in);

        // prompt the user to specify each of three objects
        for(int i = 0; i < people.length; i++)
        {
            System.out.print("Enter first name, last name, and zip code for person #" + (i+1) + 
                " with fields separated by a space: ");

            String firstName = scanner.next();
            String lastName = scanner.next();
            int zipCode = scanner.nextInt();

            people[i] = new PersonWithZip(firstName, lastName, zipCode);
        }

        // print all of the created objects
        for(PersonWithZip person: people)
        {
            System.out.println(person);
        }

        System.out.print("The following person has the least numbered zip code: ");

        // initial set the first object in the array as the least and update it as necessary
        PersonWithZip lowZipPerson = people[0];
        for(PersonWithZip person: people)
        {
            if(person.getZip() < lowZipPerson.getZip())
            {
                lowZipPerson = person;
            }
        }

        System.out.println(lowZipPerson);
    }
}