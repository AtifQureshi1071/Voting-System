package Voter;

public class Voter {

    private String[] voterNames = { "Atif Qureshi", "Mahnoor Islam", "Ahmad" };
    private String[] voterPlaces = { "Lahore", "Islamabad", "Karachi" };
    private int[] voterId = { 10, 11, 12 };

    public String[] getVoterName() {
        return voterNames;
    }

    public String[] getVoterPlace() {
        return voterPlaces;
    }

    public int[] getVoterId() {
        return voterId;
    }
}
