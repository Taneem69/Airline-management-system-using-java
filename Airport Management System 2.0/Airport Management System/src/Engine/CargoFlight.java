package Engine;

public class CargoFlight extends Flight {
   private double cost;
   private String planeName;

   public CargoFlight() {
   }

   public CargoFlight(String flightNumber, String departureTime, String arrivalTime, String departureAirport,
         String arrivalAirport, String planeName, double cost) {
      super(flightNumber, departureTime, arrivalTime, departureAirport, arrivalAirport);
      this.planeName = planeName;
      this.cost = cost;
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
      System.out.println("Flight number : " + this.getFlightNumber());
      System.out.println("Departure time : " + this.getDepartureTime());
      System.out.println("Arrival time : " + this.getArrivalTime());
      System.out.println("Departure Airport : " + this.getDepartureAirport());
      System.out.println("Arrival Airport : " + this.getArrivalAirport());
      System.out.println("Cost : " + this.getCost() + " Taka");
      System.out.println();
   }

}
