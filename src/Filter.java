import Models.Hotel;
import Models.Room;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Filter {

    public List<Hotel> hotels;

    {
        try {
            hotels = DataLoader.listLoader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Hotel> filterHotels(String country, String city, double stars) {
        List<Hotel> filteredHotels = new ArrayList<>();
        for (Hotel hotel : hotels) {

            if (hotel.getCountry().equals(country)) {

                if (hotel.getCity().equals(city)) {

                    if (hotel.getStars() == stars) {

                        filteredHotels.add(hotel);
                    }
                }
            }
        }

        return filteredHotels;
    }


    public List<Room> filterRooms(List<Hotel> hotels,double price) {
        List<Room> filteredRooms = new ArrayList<>();

        for (Hotel hotel: hotels)
        {
            for (Room room: hotel.getRooms()){
                if (price == room.getPrice()){
                    filteredRooms.add(room);
                }
            }
        }


        return filteredRooms;
    }

}
