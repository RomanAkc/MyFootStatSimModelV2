import Teams.*;

public class Start {
    public static void main(String[] args) {
        National n1 = new National("Russia", 10, BaseTeam.Zone.UEFA);
        National n2 = new National("Spain", 20, BaseTeam.Zone.UEFA);
        Match m1 = Model.Simulation(n2, n1);
        System.out.println(m1);
    }
}
