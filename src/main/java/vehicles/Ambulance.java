package vehicles;

public class Ambulance extends Car{
    public Ambulance(){
        super("Скорая помощь", "🚑");
    }

    @Override
    public String toString(){
        String fromCar = super.toString();
        String output = fromCar.replace("ездит по суше", "спасает больных");
        return output;
    }

}
