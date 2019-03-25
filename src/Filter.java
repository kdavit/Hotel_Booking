import model.Hotel;
import model.Room;

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


    public List<Hotel> filterHotels(String country, String city, double stars, double price) {
        List<Hotel> filteredHotels = new ArrayList<>();
        List<Room> filteredRooms = new ArrayList<>();
        for (Hotel hotel : hotels) {

            if (country.equals(hotel.getCountry())) {

                if (city.equals(hotel.getCity())) {

                    if (stars == hotel.getStars()) {

                        filteredHotels.add(hotel);
                    }
                }
            }
        }

        for (int i = 0; i < filteredHotels.size(); i++) {
            for (Room room : filteredHotels.get(i).getRooms()) {
                if (price == room.getPrice()) {
                    filteredRooms.add(room);
                }
                filteredHotels.get(i).setRooms(filteredRooms);
            }
        }

        return filteredHotels;
    }
}






