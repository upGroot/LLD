package LLD.CricbuzzLLD.Match;

import LLD.CricbuzzLLD.*;

import java.util.*;

public class Match {
    MatchType matchType;
    Team teamA;
    Team teamB;
    Innings[] innings;
    String venue;
    Date date;
    Team tossWinner;
    public Match(MatchType matchType, Team teamA, Team teamB) {
        this.matchType = matchType;
        this.teamA = teamA;
        this.teamB = teamB;
        innings = new Innings[2];
    }
    public void startMatch() {

    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(Team tossWinner) {
        this.tossWinner = tossWinner;
    }
}
