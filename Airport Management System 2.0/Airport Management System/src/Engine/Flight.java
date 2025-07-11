package Engine;

public abstract class Flight {
   private String flightNumber;
   protected String departureTime;
   protected String arrivalTime;
   private String arrivalAirport;
   private String departureAirport;

   public Flight() {
   }

   public Flight(String flighNumber, String departureTime, String arrivalTime, String departureAirport,
         String arrivalAirport) {
      this.flightNumber = flighNumber;
      this.departureTime = departureTime;
      this.arrivalTime = arrivalTime;
      this.departureAirport = departureAirport;
      this.arrivalAirport = arrivalAirport;
   }

   public void setFlightNumber(String flightNumber) {
      this.flightNumber = flightNumber;
   }

   public String getFlightNumber() {
      return this.flightNumber;
   }

   public void setDepartureTime(String departureTime) {
      this.departureTime = departureTime;
   }

   public String getDepartureTime() {
      return this.departureTime;
   }

   public void setArrivalTime(String arriivalTime) {
      this.arrivalTime = arriivalTime;
   }

   public String getArrivalTime() {
      return this.arrivalTime;
   }

   public void setArrivalAiport(String arrivalAirport) {
      this.arrivalAirport = arrivalAirport;
   }

   public String getArrivalAirport() {
      return this.arrivalAirport;
   }

   public void setDepartureAirport(String departureAirport) {
      this.departureAirport = departureAirport;
   }

   public String getDepartureAirport() {
      return this.departureAirport;
   }

   public abstract void showDetails();
}
