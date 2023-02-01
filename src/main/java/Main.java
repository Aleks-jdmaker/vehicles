import vehicles.*;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane(); // Создаём новый экземпляр класса самолёт с помощью конструктора.
        System.out.println(airplane); // Выводим на экран, поскольку у него есть метод toString.

        Vehicle lada = new Lada();
        System.out.println(lada);

        Vehicle ambulance = new Ambulance();
        System.out.println(ambulance);

        Vehicle boat = new Boat();
        System.out.println(boat);

        Vehicle sailboat = new Sailboat();
        System.out.println(sailboat);

        Vehicle rocket = new Rocket();
        System.out.println(rocket);

        Vehicle shuttle = new Shuttle();
        System.out.println(shuttle);

        //TODO: реализовать класс rocket c подклассами шатлы и т.д.
    }
}