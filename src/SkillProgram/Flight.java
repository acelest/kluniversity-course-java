package SkillProgram;

import java.util.List;
import java.util.ArrayList;

public class ReservationSystem {
    //    write a java program using constructiors to create a class with methods to search for flights and hotels and to book and cand reservations
    private List<String>
            flights;
    private List<String>
            hotels;
    private List<String>
            reservations;

    public void ReservationSystem() {
        flights = new ArrayList<>();
        hotels= new ArrayList<>();
        reservations = new ArrayList<>();

        flights.add("FLight 2020 Angers To Paris");
        hotels.add("Hotel 2020 Paris");
    }
    public static List<String> getFlights(String city) {
        System.out.print("Searching  flights in... " + city + "...");
        List<String>
                result = new ArrayList<>();
        for (String flight : flights) {
            if (flight.contains(city)) {
                result.add(flight);
            }
        }
        return result;
    }
    public static List<String> getHotels(String city) {
        System.out.print("Searching hotels in... " + city + "...");
        List<String>
                result = new ArrayList<>();
        for (String hotel : hotels) {
            if (hotel.contains(city)) {
                result.add(hotel);
            }
        }
        return result;
    }
    public static String bookReservation(String flight, String hotel) {
        if(flights.contains(flight) && hotels.contains(hotel)) {
            reservations.add(flight + " " + hotel);
            return "Reservation booked successfully";
        }
        return "Reservation not booked";
    }
    public static String cancelReservation(String flight, String hotel) {
        if(reservations.contains(flight + " " + hotel)) {
            reservations.remove(flight + " " + hotel);
            return "Reservation cancelled successfully";
        }
        return "Reservation not cancelled";
    }
    public static String listReservations() {
        if(reservations.isEmpty()) {
            return "No reservations";
        }
        return "Reservations: " + reservations;
    }

}

public class Flight {
    public  static void main(String[] args) {
        flight flight = new ReservationSystem();
        flight.ReservationSystem();
        System.out.println(ReservationSystem.getFlights("Paris"));
        System.out.println(ReservationSystem.getHotels("Paris"));
        System.out.println(ReservationSystem.bookReservation("FLight 2020 Angers To Paris", "Hotel 2020 Paris"));
        System.out.println(ReservationSystem.cancelReservation("FLight 2020 Angers To Paris", "Hotel 2020 Paris"));
        System.out.println(ReservationSystem.listReservations());
    }
}


