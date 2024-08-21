package LLD.CricbuzzLLD.Match;

import LLD.CricbuzzLLD.Match.*;

public class OndDayMatch implements MatchType {
    @Override
    public int noOfOver() {
        return 50;
    }

    @Override
    public int noOfOversAllowedToEachBowler() {
        return 10;
    }
}
