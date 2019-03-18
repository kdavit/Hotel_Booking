import Models.Hotel;
import Models.Room;

import java.io.IOException;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {


        Filter filter = new Filter();
        List<Hotel> test =  filter.filterHotels("საქართველო","ბათუმი",4);
        List<Room> testroom = filter.filterRooms(test,115);
        for (Hotel hotel:test)
        {
            System.out.printf(hotel.getName());
            for (Room room : testroom)
            {
                System.out.println("  " + room.getNumber());
            }
        }



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