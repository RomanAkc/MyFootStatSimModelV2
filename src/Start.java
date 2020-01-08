import Teams.*;

public class Start {
    public static void main(String[] args) {
        National n1 = new National("Russia", 10, BaseTeam.Zone.UEFA);
        National n2 = new National("Spain", 20, BaseTeam.Zone.UEFA);
        Match m1 = new Match(n2, n1, 3, 0);
        System.out.println(m1);
    }
}
