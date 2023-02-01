package vehicles;

public abstract class Vehicle {
    private Surroundings surroundings;
    private String description;
    private String emoji;

    public Vehicle(Surroundings surroundings, String description, String emoji) {
        this.surroundings = surroundings;
        this.description = description;
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(emoji);
        sb.append(" ");
        sb.append(description);
        sb.append(" ");
        sb.append(surroundingsToString(surroundings));
        return sb.toString();
    }

    public static String surroundingsToString(Surroundings surroundings) {
        return switch (surroundings){
            case AIR -> "летает по воздуху.";
            case SPACE -> "летает в космос.";
            case WATER -> "плавает по воде.";
            case GROUND -> "ездит по суше.";
        };
    }
}
