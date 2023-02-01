package vehicles;

public class Rocket extends Vehicle{
    public Rocket() {
        this("Ракета");
    }
    public Rocket(String description) { // Конструктор с одним параметором. Описание можно менять, иконка всегда одинаковая.
        this(description, "\uD83D\uDE80");
    }
    public Rocket(String description, String emoji) {
        super(Surroundings.SPACE, description, emoji);
    }
}
