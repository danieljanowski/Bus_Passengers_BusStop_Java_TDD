import java.util.ArrayList;

public class Bus {

    private int capacity;
    private String destination;
    private ArrayList<Person> passengers;


    public Bus(int capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengers(Person person) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassengers() {
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removePerson();
        addPassengers(person);
    }
}
