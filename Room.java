package Hotel;


public class Room {

    private int roomId;
    private int capacity;
    private boolean hasBalcony;
    private boolean hasViewOfTheSeaSide;
    private float pricePerNight;


    public Room(int roomId, int capacity, boolean hasBalcony, boolean hasViewOfTheSeaSide, int pricePerNight) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.hasBalcony = hasBalcony;
        this.hasViewOfTheSeaSide = hasViewOfTheSeaSide;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomId(){ return roomId; }

    public void setRoomId(int roomId) { this.roomId = roomId; }

    public void setCapacity(int capacity) { this.capacity = capacity; }

    public void setHasBalcony(boolean hasBalcony) { this.hasBalcony = hasBalcony; }

    public void setHasViewOfTheSeaSide(boolean hasViewOfTheSeaSide) { this.hasViewOfTheSeaSide = hasViewOfTheSeaSide; }

    public void setPricePerNight(float pricePerNight) { this.pricePerNight = pricePerNight; }

    public int getCapacity() { return capacity; }

    public boolean isHasBalcony() { return hasBalcony; }

    public boolean isHasViewOfTheSeaSide() { return hasViewOfTheSeaSide; }

    public int getPricePerNight(){ return (int) pricePerNight; }

    public void setPricePerNight() { this.pricePerNight = pricePerNight; }

        public String getDescription(){
            return "Pokoj č. "+roomId+": "+capacity+" míst, "+pricePerNight+" Kč/noc";
    }
}


