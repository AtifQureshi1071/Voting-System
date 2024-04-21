package Registration;

import java.util.Scanner;

public class Registration {
    Scanner s = new Scanner(System.in);

    private String username;
    private String place;
    private long cnic;

    public void checkCandidate(String[] candidateNames, String[] candidatePlaces, long[] candidateId) {
        boolean nameMatch = false;
        boolean placeMatch = false;
        boolean cnicMatch = false;

        while (!nameMatch) {

            for (int i = 0; i < candidateNames.length; i++) {
                System.out.println("Enter your name:");
                username = s.nextLine();
                if (username.isEmpty()){
                    System.out.println("Write something please:");
                    continue;
                }
                if (username.equals(candidateNames[i])) {
                    System.out.println("Name matched.");
                    nameMatch = true;
                    break;
                }
            }
            if (!nameMatch) {
                System.out.println("Name not found. Please try again.");
            }
        }
        while (!placeMatch) {

            System.out.println("Enter your place:");
            place = s.nextLine();
            for (int i = 0; i < 1; i++) {
                if (username.isEmpty()){
                    System.out.println("Write something please:");
                    continue;
                }
                if (place.equals(candidatePlaces[i])) {
                    System.out.println("Place matched.");
                    placeMatch = true;
                    break;
                }
            }

            if (!placeMatch) {
                System.out.println("Place not found. Please try again.");
            }
        }
        while (!cnicMatch) {
            for (int i = 0; i < 1; i++) {
                System.out.println("Enter your Cnic:");
                cnic = s.nextLong();
                if (username.isEmpty()){
                    System.out.println("Write something please:");
                    continue;
                }
                if (cnic == candidateId[i]) {
                    System.out.println("CNIC matched.");
                    cnicMatch = true;
                    break;
                }
            }

            if (!cnicMatch) {
                System.out.println("CNIC not found. Please try again.");
            }
        }

    }
}
