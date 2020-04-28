import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;


    @Before
    public void before() {
        bus = new Bus(6, "Edinburgh");
        person = new Person();

    }
    @Test
    public void emptyBus() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengers() {
        bus.addPassengers(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassengers() {
        bus.addPassengers(person);
        bus.removePassengers();
        assertEquals(0, bus.passengerCount());
    }

}

