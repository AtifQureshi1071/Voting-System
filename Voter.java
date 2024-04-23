package VotingSystem;

import Registration.Registration;
import Voter.Voter;

public class Main {
    public static void main(String[] args) {

        Registration registration = new Registration();
        Voter voter = new Voter();
        registration.checkVoter(voter.getVoterName(), voter.getVoterPlace(), voter.getVoterId());

    }
}
