package Sentinel;

import java.util.Scanner;

public class Main {

    // is the new user an addict or a sponsor?
    public static void menu(Scanner scanner) {
        System.out.println("Are you are recovering addict or a Sponsor?");
        int type = 0;
        do {
            System.out.println("Please enter 1 for a recovering addict and 2 for a Sponsor: ");
            type = scanner.nextInt();

            if (type == 1)
            {
             Addict(scanner);
             return;
            }
            if (type == 2)
            {
             Sponsor(scanner);
             return;
            }

        } while (type != 1 || type != 2);

    }

    // create a new user that is an addict.
    public static void Addict(Scanner scanner) {

        Addict addict = new Addict();

        System.out.print("Please enter your name: ");
        addict.name = scanner.next();

        System.out.print("Please enter your age: ");
        addict.age = scanner.nextInt();

        System.out.print("Please enter your City: ");
        addict.city = scanner.next();

        // We will need to change this eventually from a string to some type of list that the user could choose from -12
        System.out.print("Please enter the addiction you are recovering from: ");
        addict.addiction = scanner.next();

        //for testing
        //System.out.print("Addict Name: " + addict.name);
    }

    // create a new user that is a sponsor.
    public static void Sponsor(Scanner scanner) {

        Sponsor sponsor = new Sponsor();

        System.out.print("Please enter your name: ");
        sponsor.name = scanner.next();

        System.out.print("Please enter your age: ");
        sponsor.age = scanner.nextInt();

        System.out.print("Please enter your City: ");
        sponsor.city = scanner.next();

        // We will need to change this eventually from a string to some type of list that the user could choose from -12
        System.out.print("Please enter the addiction you are recovering from: ");
        sponsor.addiction = scanner.next();

        //for testing
        //System.out.print("Sponsor Name: " + sponsor.name);
    }

    // call the menu
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        menu(scanner);


    }
}
