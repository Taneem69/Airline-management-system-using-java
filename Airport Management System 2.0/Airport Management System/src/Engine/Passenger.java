package Engine;

import java.io.PrintStream;

public class Passenger extends Person implements TicketingSystem {
    private String passengerPassportNumber;
    PassengerFlight passengerFlight;
    CargoFlight cargoFlight;
    private boolean flag = false;

    public Passenger() {
    }

    public Passenger(String name, int age, String passengerPassportNumber, String nationality, String phoneNumber,
            PassengerFlight passengerFlight) {
        super(name, age, nationality, phoneNumber);
        this.passengerPassportNumber = passengerPassportNumber;
        this.bookPassengerFlightTicket(passengerFlight);
        this.flag = true;
    }

    public Passenger(String name, int age, String passengerPassportNumber, String nationality, String phoneNumber,
            CargoFlight cargoFlight) {
        super(name, age, nationality, phoneNumber);
        this.passengerPassportNumber = passengerPassportNumber;
        this.bookCargoFlightTicket(cargoFlight);
    }

    public void setPassengerPassportNumber(String passengerPassportNumber) {
        this.passengerPassportNumber = passengerPassportNumber;
    }

    public String getPassengerPassportNumber() {
        return this.passengerPassportNumber;
    }

    public void showDetails() {
        System.out.println("Name : " + this.getName());
        System.out.println("Age : " + this.getAge());
        System.out.println("Passport number : " + this.getPassengerPassportNumber());
        System.out.println("Nationality : " + this.getNationality());
        System.out.println("Phone number : " + this.getPhoneNumber());
        System.out.println();
    }

    public void bookPassengerFlightTicket(PassengerFlight passengerFlight) {
        this.passengerFlight = passengerFlight;
        passengerFlight.setCount();
    }

    public void bookCargoFlightTicket(CargoFlight cargoFlight) {
        this.cargoFlight = cargoFlight;
    }

    public void cancelPassengerFlightTicket(PassengerFlight passengerFlight) {
        PrintStream var10000 = System.out;
        String var10001 = passengerFlight.getDepartureAirport();
        var10000.println(
                "Your flight from " + var10001 + " to " + passengerFlight.getArrivalAirport() + " is canceled");
    }

    public void cancelCargoFlightTicket(CargoFlight cargoFlight) {
        PrintStream var10000 = System.out;
        String var10001 = cargoFlight.getDepartureAirport();
        var10000.println("Your flight from " + var10001 + " to " + cargoFlight.getArrivalAirport() + " is canceled");
    }

    public String bookedFlightDetails() {
        String var10000;
        if (this.flag) {
            var10000 = this.passengerFlight.getFlightNumber();
            return var10000 + this.passengerFlight.getPlaneName();
        } else {
            var10000 = this.cargoFlight.getFlightNumber();
            return var10000 + this.cargoFlight.getPlaneName();
        }
    }
}
