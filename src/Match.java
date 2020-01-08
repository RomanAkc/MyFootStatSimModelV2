import  Teams.*;

public class Match {
    private BaseTeam home;
    private BaseTeam away;
    private int goalHome;
    private int goalAway;

    public Match(BaseTeam home, BaseTeam away, int goalHome, int goalAway) {
        this.home = home;
        this.away = away;
        this.goalHome = goalHome;
        this.goalAway = goalAway;
    }

    public String toString() {
        return  home.getName() + " - " + away.getName() + " " + goalHome + ":" + goalAway;
    }
}
