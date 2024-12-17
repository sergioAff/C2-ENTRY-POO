package Models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private String city;
    private Type type;
    private double rating;
    private boolean lunch;
    private List<Room> rooms;
    private List<Clients> clients;

    public Hotel(String name, String city, Type type, double rating, boolean lunch) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.rating = rating;
        this.lunch = lunch;
        this.rooms = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Type getType() {
        return type;
    }

    public double getRating() {
        return rating;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Clients> getClients() {
        return clients;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void addReservation(Clients client) {
        this.clients.add(client);
    }
}