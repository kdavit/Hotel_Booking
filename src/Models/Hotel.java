package Models;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private String country;
    private String city;
    private double stars;
    private ArrayList<Room> rooms = new ArrayList<>();


    public Hotel(String name, String country, String city, int stars, ArrayList<Room> rooms) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.stars = stars;
        this.rooms = rooms;
    }

    public Hotel(){}

    public Hotel(String name, String country, String city, double stars, ArrayList<Room> filteredRooms){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room)
    {
        rooms.add(room);
    }


}
