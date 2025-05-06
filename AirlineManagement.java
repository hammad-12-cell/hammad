// Interface for displaying details
interface Display {
    void show();
}

// Aircraft interface inherits from Display
interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}

// PassengerJet class
class PassengerJet implements Aircraft {
    private int rows;
    private int seatsPerRow;

    public PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    public String aircraftType() {
        return "Passenger Jet";
    }

    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Passenger Capacity: " + calculateCapacity());
    }
}

// CargoPlane class
class CargoPlane implements Aircraft {
    private double length;
    private double width;
    private static final double CONVERSION_RATE = 1.5; // 1.5 sq.m per passenger equivalent

    public CargoPlane(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String aircraftType() {
        return "Cargo Plane";
    }

    public int calculateCapacity() {
        return (int) (length * width / CONVERSION_RATE);
    }

    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Equivalent Passenger Capacity: " + calculateCapacity());
    }
}

// PrivateJet class
class PrivateJet implements Aircraft {
    private int seats;

    public PrivateJet(int seats) {
        this.seats = seats;
    }

    public String aircraftType() {
        return "Private Jet";
    }

    public int calculateCapacity() {
        return seats;
    }

    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Luxury Seats: " + calculateCapacity());
    }
}

// Main class
public class AirlineManagement {
    public static void main(String[] args) {
        // Create instances of each aircraft
        Aircraft jet = new PassengerJet(30, 6);
        Aircraft cargo = new CargoPlane(20.0, 10.0);
        Aircraft privateJet = new PrivateJet(12);

        // Show flight details
        System.out.println("=== Passenger Jet ===");
        jet.show();
        System.out.println("\n=== Cargo Plane ===");
        cargo.show();
        System.out.println("\n=== Private Jet ===");
        privateJet.show();
    }
}
