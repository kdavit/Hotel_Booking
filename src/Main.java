import Models.Hotel;
import Models.Room;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {

//        ArrayList<Hotel> hotelTest = new ArrayList<>();
//        ArrayList<Room> roomTest = new ArrayList<>();
//
//
//        Filter test = new Filter(hotelTest);
//
//        for (Hotel hotel : test.filterHotels("tbiliso", "saqartvelo", "tbilisi", 4)) {
//            System.out.println("Name: " + hotel.getName());
//            System.out.println("Attached rooms:");
//            for (Room room : hotel.getRooms()) {
//                System.out.println(room.getNumber());
//            }
//            System.out.println("-------------------");
//        }

        Filter filter = new Filter();
        filter.filterHotels("საქართველო","ბათუმი",4);
        System.out.println(filter);

        List<Hotel> l = DataLoader.listLoader();


        for(int i = 0; i < l.size(); i++)
        {
            List<Room> r = l.get(i).getRooms();
            System.out.printf("სასტუმრო: " + l.get(i).getName() + "     ოთახები:");
            for (int j = 0;j<=r.size()-1;j++)
            {
                System.out.printf(r.get(j).getNumber() + ", ");
            }
            System.out.printf("\n");
        }

}
}