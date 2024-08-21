package LLD.CricbuzzLLD.Match;

public class T20Match implements MatchType{
    @Override
    public int noOfOver() {
        return 20;
    }

    @Override
    public int noOfOversAllowedToEachBowler() {
        return 4;
    }
}
