import Models.Hotel;
import Models.Room;

import java.util.ArrayList;

public class Filter {

    private ArrayList<Hotel> hotels;

    public Filter(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<Hotel> filterHotels(String name, String country, String city, int stars) {
        ArrayList<Hotel> filteredHotels = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getName().equals(name) && hotel.getCountry().equals(country) && hotel.getCity().equals(city) && hotel.getStars() == stars) {
                ArrayList<Room> filteredRooms = filterRooms(hotel.getRooms());
                Hotel h = new Hotel(hotel.getName(), hotel.getCountry(), hotel.getCity(), hotel.getStars(), filteredRooms);
                filteredHotels.add(h);
            }
        }
        return filteredHotels;
    }


    public ArrayList<Room> filterRooms(ArrayList<Room> rooms) {
        ArrayList<Room> filteredRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getPrice() == 150) {
                filteredRooms.add(room);
            }
        }
        return filteredRooms;
    }

}
