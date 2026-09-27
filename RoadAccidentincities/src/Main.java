import java.util.Scanner;

// Superclass
class RoadAccident {
    private String city;
    private int numberOfAccidents;

    public RoadAccident(String city, int numberOfAccidents) {
        this.city = city;
        this.numberOfAccidents = numberOfAccidents;
    }

    public String getCity() {
        return city;
    }

    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }
}

// Subclass
class CarAccident extends RoadAccident {

    public CarAccident(String city, int numberOfAccidents) {
        super(city, numberOfAccidents);
    }
}

// Subclass
class MotorBikeAccident extends RoadAccident {

    public MotorBikeAccident(String city, int numberOfAccidents) {
        super(city, numberOfAccidents);
    }
}

