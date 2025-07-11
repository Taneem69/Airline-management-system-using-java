
package Engine;

public interface TicketingSystem {
    void bookPassengerFlightTicket(PassengerFlight var1);

    void bookCargoFlightTicket(CargoFlight var1);

    void cancelPassengerFlightTicket(PassengerFlight var1);

    void cancelCargoFlightTicket(CargoFlight var1);

    String bookedFlightDetails();
}
