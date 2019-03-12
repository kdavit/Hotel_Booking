import Models.Hotel;
import Models.Room;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        ArrayList<Hotel> hotelTest = new ArrayList<>();
        ArrayList<Room> roomTest = new ArrayList<>();

        roomTest.add(new Room(404,150));
        roomTest.add(new Room(405,120));
        hotelTest.add(new Hotel("tbiliso","saqartvelo","tbilisi",4, roomTest));
        hotelTest.add(new Hotel("mze","dedamiwa","tbilisi",5, roomTest));
        hotelTest.add(new Hotel("vardebi","saqartvelo","konoha",3, roomTest));

        Filter test = new Filter(hotelTest);

        for (Hotel hotel : test.filterHotels("tbiliso", "saqartvelo", "tbilisi", 4)) {
            System.out.println("Name: " + hotel.getName());
            System.out.println("Attached rooms:");
            for (Room room : hotel.getRooms()) {
                System.out.println(room.getNumber());
            }
            System.out.println("-------------------");
        }
    }

}