package vehicles;

public abstract class Vehicle { // Класс абстрактный, поэтому запрещено непосредственное создание эземпляров типа Vehicle.
    private final Surroundings surroundings; // Поле получается из enum Surroundings.
    // Полям с модификатором final можно присваивать значение в конструкторе и только 1 раз.
    private final String description;        // Поле описания в произвольной форме.
    private final String emoji;              // Поле для эмодзи.

    public Vehicle(Surroundings surroundings, String description, String emoji) { // Единственный конструктор с тремя параметрами.
        this.surroundings = surroundings;
        this.description = description;
        this.emoji = emoji;
    }

    @Override
    public String toString() {                       // Переопределяем метод toString, чтобы получить удобный вывод на экран.
        StringBuilder sb = new StringBuilder(emoji); // Для эффективного построения строк,
        // следует использовать StringBuilder вместо конканетаниции.
        sb.append(" ")
                .append(description)
                .append(" ")
                .append(surroundingsToString(surroundings));
        return sb.toString();  // Превращаем StringBuilder в строку с помочщью метода toString.
    }

    public static String surroundingsToString(Surroundings surroundings) { // Вспомогательный метод для превращения
        // элементов энум в строки.
        return switch (surroundings) { // Оператор switch для связи элементов энума и строк.
            case AIR -> "летает по воздуху.";
            case SPACE -> "летает в космос.";
            case WATER -> "плавает по воде.";
            case GROUND -> "ездит по суше.";
        };
    }
}
