package Models;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private String country;
    private String city;
    private int stars;
    private ArrayList<Room> rooms;


    public Hotel(String name, String country, String city, int stars, ArrayList<Room> rooms) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.stars = stars;
        this.rooms = rooms;
    }

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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
