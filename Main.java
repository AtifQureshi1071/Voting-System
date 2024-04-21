package VotingSystem;

import Candidate.Candidate;
import Registration.Registration;

public class Main {
    public static void main(String[] args) {

        Registration registration = new Registration();
        Candidate candidate = new Candidate();

        registration.checkCandidate(candidate.getCandidateName(), candidate.getCandidatePlace(), candidate.getCandidateId());
        candidate.displayData();
        
    }
}