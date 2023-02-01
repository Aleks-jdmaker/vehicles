package vehicles;

public class Car extends Vehicle{
    public Car() { // Конструктор без параметорв. Все значения по умолчанию: имя - автомобиль, иконка - красная.
        this("Автомобиль");
    }
    public Car(String description) { // Конструктор с одним параметором. Описание можно менять, иконка всегда одинаковая.
        this(description, "🚗");
    }
    public Car(String description, String emoji) { // Конструктор позволяет менять и описани и иконку.
        super(Surroundings.GROUND, description, emoji);
    }
}

