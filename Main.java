package Hotel;

import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Guest adela = new Guest("Adéla", " Malíková", LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());

        Room room1 = new Room(1, 1, true, true, 1000);
        System.out.println(room1.getDescription());
        Hotel.Room room2 = new Hotel.Room(2, 1, true, true, 1000);
        System.out.println(room2.getDescription());
        Hotel.Room room3 = new Hotel.Room(3, 3, false, true, 2400);
        System.out.println(room3.getDescription());

        Bookings bookings = new Bookings();

        Booking booking = new Booking(adela, room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfStay.HOLIDAY);
        booking.addGuests(new Guest("Adéla", "Malíková", LocalDate.of(2020, 2, 22)));
        bookings.addBooking(booking);

        booking = new Booking(jan, room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfStay.WORK);
        booking.addGuests(new Guest("Lucie", "Malíková", LocalDate.of(2020, 2, 22)));
        booking.addGuests(new Guest("Roman", "Dvořáček", LocalDate.of(1999, 9, 9)));
        bookings.addBooking(booking);

        bookings.printBookings();
    }
}
