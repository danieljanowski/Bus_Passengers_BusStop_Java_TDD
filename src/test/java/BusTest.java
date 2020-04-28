import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before
    public void before() {
        bus = new Bus(6, "Edinburgh");
        person = new Person();
        busStop = new BusStop("Gorebridge");

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
    public void addPassengersNoMoreSpace() {
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        assertEquals(6, bus.passengerCount());
        bus.addPassengers(person);
        bus.addPassengers(person);
        assertEquals(6, bus.passengerCount());
    }

    @Test
    public void removePassengers() {
        bus.addPassengers(person);
        bus.removePassengers();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void pickUpfromBusStop(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        bus.pickUp(busStop);
        assertEquals(1, busStop.queueCount());
        assertEquals(1, bus.passengerCount());
    }

}

