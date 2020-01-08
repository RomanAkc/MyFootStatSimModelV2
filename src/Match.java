import  Teams.*;

public class Match {
    private BaseTeam home;
    private BaseTeam away;
    private int goalHome;
    private int goalAway;
    private int goalHomeAdditional;
    private int goalAwayAdditional;
    private  boolean additional;
    private int goalHomePenalty;
    private int goalAwayPenalty;
    private  boolean penalty;

    public Match(BaseTeam home, BaseTeam away, int goalHome, int goalAway) {
        this.home = home;
        this.away = away;
        this.goalHome = goalHome;
        this.goalAway = goalAway;
    }

    public Match(BaseTeam home, BaseTeam away, int goalHome, int goalAway
            , int goalHomeAdditional, int goalAwayAdditional) {
        this(home, away, goalHome, goalAway);
        this.goalHomeAdditional = goalHomeAdditional;
        this.goalAwayAdditional = goalAwayAdditional;
        additional = true;
    }

    public Match(BaseTeam home, BaseTeam away, int goalHome, int goalAway
            , int goalHomeAdditional, int goalAwayAdditional
            , int goalHomePenalty, int goalAwayPenalty) {
        this(home, away, goalHome, goalAway, goalHomeAdditional, goalAwayAdditional);
        this.goalHomePenalty = goalHomePenalty;
        this.goalAwayPenalty = goalAwayPenalty;
        penalty = true;
    }

    public String toString() {
        if(additional) {
            return String.format("%s - %s %d:%d(%d:%d, %d:%d add)"
                    , home.getName(), away.getName()
                    , goalHome + goalHomeAdditional, goalAway + goalAwayAdditional
                    , goalHome, goalAway, goalHomeAdditional, goalAwayAdditional
                    );
        }

        if(penalty) {
            return String.format("%s - %s %d:%d(%d:%d, %d:%d add, %d:%d pen)"
                    , home.getName(), away.getName()
                    , goalHome + goalHomeAdditional, goalAway + goalAwayAdditional
                    , goalHome, goalAway, goalHomeAdditional, goalAwayAdditional
                    , goalHomePenalty, goalAwayPenalty
            );
        }

        return String.format("%s - %s %d:%d", home.getName(), away.getName(), goalHome, goalAway);
    }
}
