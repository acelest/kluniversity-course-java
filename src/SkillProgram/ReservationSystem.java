package SkillProgram;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {

    // Instance variables to store flights, hotels, and reservations
    private List<String> flights;
    private List<String> hotels;
    private List<String> reservations;

    // My Constructor
    public ReservationSystem() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
        reservations = new ArrayList<>();

        
        flights.add("Flight 2020 - Angers To Paris");
        flights.add("Flight 3030 - New York To London");
        flights.add("Flight 4040 - Paris To Berlin");


        hotels.add("Hotel 2020 - Paris");
        hotels.add("Hotel 3030 - London");
        hotels.add("Hotel 4040 - Berlin");
    }

=    public List<String> getFlights(String city) {
        System.out.println("Searching for flights to " + city + "...");
        List<String> results = new ArrayList<>();
        for (String flight : flights) {
            if (flight.contains(city)) {
                results.add(flight);
            }
        }
        return results;
    }

    // Method to search for hotels by city
    public List<String> getHotels(String city) {
        System.out.println("Searching for hotels in " + city + "...");
        List<String> results = new ArrayList<>();
        for (String hotel : hotels) {
            if (hotel.contains(city)) {
                results.add(hotel);
            }
        }
        return results;
    }

    // Method to book a reservation for a flight and a hotel
    public String bookReservation(String flight, String hotel) {
        if (flights.contains(flight) && hotels.contains(hotel)) {
            reservations.add(flight + " | " + hotel);
            return "Reservation successfully booked: " + flight + " and " + hotel;
        }
        return "Error: Could not book the reservation. Please check the flight and hotel availability.";
    }

    // Cancellation
    public String cancelReservation(String flight, String hotel) {
        String reservationEntry = flight + " | " + hotel;
        if (reservations.contains(reservationEntry)) {
            reservations.remove(reservationEntry);
            return "Reservation successfully canceled: " + reservationEntry;
        }
        return "Error: Reservation could not be found.";
    }

    // current reservations
    public void listReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            System.out.println("Current reservations:");
            for (String reservation : reservations) {
                System.out.println("- " + reservation);
            }
        }
    }

    // Main method for executing the program
    public static void main(String[] args) {
        // Create an instance of the ReservationSystem class
        ReservationSystem system = new ReservationSystem();

        System.out.println("\nAvailable flights to Paris:");
        System.out.println(system.getFlights("Paris"));

        System.out.println("\nAvailable hotels in Paris:");
        System.out.println(system.getHotels("Paris"));

        String bookingResult = system.bookReservation("Flight 2020 - Angers To Paris", "Hotel 2020 - Paris");
        System.out.println("\n" + bookingResult);

        String bookingError = system.bookReservation("Flight Invalid", "Hotel Invalid");
        System.out.println("\n" + bookingError);

        System.out.println("\nCurrent reservations:");
        system.listReservations();

        String cancelResult = system.cancelReservation("Flight 2020 - Angers To Paris", "Hotel 2020 - Paris");
        System.out.println("\n" + cancelResult);

        System.out.println("\nReservations after cancellation:");
        system.listReservations();
    }
}