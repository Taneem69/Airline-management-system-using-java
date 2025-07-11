package Engine;

public class PassengerFlight extends Flight {
    private double cost;
    private String flightClass;
    private String planeName;
    private int count;

    public PassengerFlight() {
    }

    public PassengerFlight(String flightNumber, String departureTime, String arrivalTime, String departureAirport,
            String arrivalAirport, String flightClass, String planeName, double cost) {
        super(flightNumber, departureTime, arrivalTime, departureAirport, arrivalAirport);
        this.flightClass = flightClass;
        this.planeName = planeName;
        this.cost = cost;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getFlightClass() {
        return this.flightClass;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public String getPlaneName() {
        return this.planeName;
    }

    public void showDetails() {
        System.out.println("Plane name : " + this.getPlaneName());
        System.out.println("Flight class : " + this.getFlightClass());
        System.out.println("Flight number : " + this.getFlightNumber());
        System.out.println("Departure time : " + this.getDepartureTime());
        System.out.println("Arrival time : " + this.getArrivalTime());
        System.out.println("Departure Airport : " + this.getDepartureAirport());
        System.out.println("Arrival Airport : " + this.getArrivalAirport());
        System.out.println("Cost : " + this.getCost() + " Taka");
        System.out.println();
    }

    public void setCount() {
        ++this.count;
    }

    public int getCount() {
        return this.count;
    }
}
