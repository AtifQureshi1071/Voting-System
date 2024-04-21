package Candidate;

public class Candidate {
    
    private String[] candidateNames = { "Atif Qureshi", "Mahnoor Islam", "Ahmad" };
    private String[] candidatePlaces = { "Lahore", "Islamabad", "Karachi" };
    private long[] candidateId = { 10, 11, 12 };

    public String[] getCandidateName() {
        return candidateNames;
    }

    public String[] getCandidatePlace() {
        return candidatePlaces;
    }

    public long[] getCandidateId() {
        return candidateId;
    }

    public void displayData() {
        for (int i = 0; i < 1; i++) {
            System.out.println(candidateNames[i] + "\t\t" + candidateId[i] + "\t\t" + candidatePlaces[i]);
        }
    }
}