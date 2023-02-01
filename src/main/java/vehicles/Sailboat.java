package vehicles;

public class Sailboat  extends Boat{
    public Sailboat(){
        super("Парусник", "⛵");
    }

    @Override
    public String toString(){
        return super.toString().replace("по воде", "с помощью ветра");
    }
}
