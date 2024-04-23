package Registration;

import java.util.Scanner;

public class Registration {
    Scanner s = new Scanner(System.in);

    private String username;
    private String place;
    private int id;

    public void checkVoter(String[] voterNames, String[] voterPlaces, int[] voterId) {
        boolean matchFound = false;
        int matchedIndex = -1;

        while (!matchFound) {
            System.out.println("Enter your name:");
            username = s.nextLine();
            if (username.isEmpty()) {
                System.out.println("Write something please:");
                continue;
            }

            System.out.println("Enter your place:");
            place = s.nextLine();
            if (place.isEmpty()) {
                System.out.println("Write something please:");
                continue;
            }
            
            System.out.println("Enter your ID:");
            id = s.nextInt();

            for (int i = 0; i < voterNames.length; i++) {
                if (username.equals(voterNames[i]) && place.equals(voterPlaces[i]) && id == voterId[i]) {

                    System.out.println("Voter matched.");
                    matchFound = true;
                    matchedIndex = i;
                    break;
                }
            }

            if (!matchFound) {
                System.out.println("Voter not found. Please try avoter");
                s.nextLine();
            }
        }
        if (matchedIndex != -1) {
            System.out.println("Voter Information:");
            System.out.println("Name: " + voterNames[matchedIndex]);
            System.out.println("Place: " + voterPlaces[matchedIndex]);
            System.out.println("ID: " + voterId[matchedIndex]);
        }
    }
}
