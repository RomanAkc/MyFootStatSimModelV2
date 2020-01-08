import Teams.*;

public class Model {
    public enum SimParams {
        IGNORE_HOME_AWAY,
        NEED_WINNER
    }

    public static Match Simulation(BaseTeam home, BaseTeam away, int simParam, Match prev) {
        //TODO:
        return new Match(home, away, 0, 0);
    }

    public static Match Simulation(BaseTeam home, BaseTeam away) {
        return Simulation(home, away, 0, null);
    }

    public static Match Simulation(BaseTeam home, BaseTeam away, Match prev) {
        int simParam = (1<<SimParams.NEED_WINNER.ordinal());
        return Simulation(home, away, simParam, prev);
    }
}
