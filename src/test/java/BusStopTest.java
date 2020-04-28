import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Morning Side");
        person = new Person();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueCount());
    }
    @Test
    public void addToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePerson() {
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.queueCount());
    }


}
