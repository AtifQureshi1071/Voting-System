package Candidate;

import java.util.Scanner;

public class Candidate {
    Scanner s = new Scanner(System.in);
    private int choice, a = 1;
    private char want;

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void candidateDetail() {
        do {
            // clearScreen();
            System.out.println("Candidate Menu:");
            System.out.println("1. for PMLN");
            System.out.println("2. for PTI");
            System.out.println("3 for PPP");
            System.out.println("4. for PDM");
            System.out.println("5. for Exit: ");
            System.out.println("Enter your choice:");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    do {
                        clearScreen();
                        System.out.println("Name: Malik Afzal:");
                        System.out.println("Seat: MNA");
                        System.out.println("Area: Lahore");
                        System.out.println("Symbol: Lion");
                        System.out.println("Do you want to stay press (y) and if you want to change press (n) :");
                        want = s.next().charAt(0);
                    } while (want != 'n');
                    break;
                case 2:
                    do {
                        clearScreen();
                        System.out.println("Name: Nadeem Abbas:");
                        System.out.println("Seat: MPA: ");
                        System.out.println("Area: Shahdra: ");
                        System.out.println("Symbol: Bat: ");
                        System.out.println("Do you want to stay press (y) and if you want to change press (n) :");
                    } while (want != 'n');
                    break;
                case 3:
                    do {
                        clearScreen();
                        System.out.println("Name: Ahmad Nadeem: ");
                        System.out.println("Seat: MPA: ");
                        System.out.println("Area: Guldburg: ");
                        System.out.println("Symbol: Arrow: ");
                        System.out.println("Do you want to stay press (y) and if you want to change press (n) :");
                    } while (want != 'n');
                    break;
                case 4:
                    do {
                        clearScreen();
                        System.out.println("Name: Ali Ameen: ");
                        System.out.println("Seat: MPA: ");
                        System.out.println("Area: Raiwind: ");
                        System.out.println("Symbol: Book: ");
                        System.out.println("Do you want to stay press (y) and if you want to change press (n) :");
                    } while (want != 'n');
                    break;
                case 5:
                    System.out.println("Exit program:");
                    break;
                default:
                    System.out.println("Invalid input:");

            }
            System.out.println("\nDo you want to stay!! ");
            System.out.println("\nFor \"Yes\" Enter\"Y\" : ");
            System.out.println("\nFor \"No\" Enter\"N\"  : ");
            want = s.next().charAt(0);
            do {
                if (want == 'y' || want == 'Y') {
                    a = 0;
                } else if (want == 'n' || want == 'N') {
                    a = 0;
                } else {
                    System.out.println("Incorrect Input. Again Enter: ");
                    want = s.next().charAt(0);
                }
            } while (a == 1);

        } while (want=='n'|| want=='N');

    }

}
