package vehecles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicles.Airplane;
import vehicles.Surroundings;
import vehicles.Vehicle;

public class TestAirplane {

    @Test
    void checkAirplane(){
        Airplane airplane = new Airplane();
        Assertions.assertInstanceOf(Vehicle.class,airplane);
        Assertions.assertTrue(airplane.toString().contains("✈️"));
    }


}
