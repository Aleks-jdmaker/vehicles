import vehicles.*;
import java.util.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List <Vehicle> vehicles = new ArrayList<>(); //Создаём список экземпляров (инстансов, объектов)
        // <Vehicle> - generic, означает что в данный список нельзя положить ничего, кроме экземпляров типа Vehicle.
        // vehicles.add("Hello"); - не срабатает, т.к. не совпадают типы листа и экземпляра.
        // "Hello" - это тип String, а тип листа Vehicle.

        // Vehicle vehicle = new Vehicle(); - так делать нельзя, потому что класс абстрактный.

        // Surroundings water = Surroundings.WOTER; - так сделать не получится, потому что
        // в Surroundings нет элемента WOTER, есть только WATER.

        Vehicle shuttle = new Shuttle(); // Создаём экзепляр
        vehicles.add(shuttle);           // и помещаем его в лист.

        vehicles.add(new Airplane());    // Создаём анонимный экзепляр прямо в вызове метода add
                                         // и сразу он сам помещается в лист.
        vehicles.add(new Lada());
        vehicles.add(new Ambulance());
        vehicles.add(new Boat());
        vehicles.add(new Sailboat());
        vehicles.add(new Rocket());


        for (Vehicle vehicle : vehicles){ // Цикл for для вывода экземпляров листа на экран.
            System.out.println(vehicle);  // Переменная vehicle "живёт" только внутри цикла.
                                          // Поскольку класс Vehicle имеет собственную реализацию метода toString,
                                          // его можно сразу же использовать как строку.
        }
    }
}