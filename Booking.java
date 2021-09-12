package Hotel;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Booking<otherGuests> {
    List<Guest> guests = new ArrayList<>();
    Guest mainGuest;
    List<Guest> otherGuests = new ArrayList<>();
    Room room;
    LocalDate begin;
    LocalDate end;
    TypeOfStay type;

    public Booking(Guest mainGuest, Room room, LocalDate begin, LocalDate end, TypeOfStay type) {
        this.mainGuest = mainGuest;
        this.room = room;
        this.begin = begin;
        this.end = end;
        this.type = type;
    }

    public Booking(Guest mainGuest, Room room) {
        this(mainGuest, room, LocalDate.now(), LocalDate.now().plusDays(7), TypeOfStay.HOLIDAY);
    }

    public void addGuest(Guest newGuest) {
        guests.add(newGuest);
    }

    public void addGuests(Guest newGuest) {
        otherGuests.add(newGuest);
    }

    public void removeGuest(Guest guest) {
        otherGuests.remove(guest);
    }

    public void clearOtherGuests() {
        otherGuests.clear();
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public Guest getMainGuest() {
        return mainGuest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public TypeOfStay getType() {
        return type;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public void setOthereGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public void setType(TypeOfStay type) {
        this.type = type;
    }

    public String getDescription() {
        StringBuilder result = new StringBuilder("Booking from " + begin.toString() + " to " + end.toString() + " for " + mainGuest.getDescription());
        result.append("\n");
        result.append("Booking " + mainGuest.getFulName() + " other guests: ");
        for (Guest guests : otherGuests) {
            result.append(guests.getFulName()).append(" , ");
        }
        return result.toString();
    }
}