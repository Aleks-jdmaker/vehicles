package vehicles;

public class Boat extends Vehicle{
    public Boat(){
        this("Корабль");
    }
    public Boat(String description) {
        this(description, "\uD83D\uDEA3");
    }

    public Boat(String description, String emoji) {
        super(Surroundings.WATER, description, emoji);
    }
}
