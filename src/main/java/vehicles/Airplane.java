package vehicles;

public class Airplane extends Vehicle{
    public Airplane(String description) {
        this(description, "✈️");
    }

    public Airplane() {
        this("Самолёт");
    }

    public Airplane(String description, String emoji) {
        super(Surroundings.AIR, description, emoji);
    }
}
