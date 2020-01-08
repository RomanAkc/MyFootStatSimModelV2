package Teams;

public abstract class BaseTeam {
    public enum Zone {
        UEFA,
        CONMEBOL,
        CONCACAF,
        CAF,
        AFC,
        OFC
    }

    private String name;
    private int power;
    private Zone zone;

    public BaseTeam(String name, int power, Zone zone) {
        this.name = name;
        this.power = power;
        this.zone = zone;
    }

    public String getName() { return  name; }
    public int getPower() { return  power; }
    public Zone getZone() { return  zone; }
}
