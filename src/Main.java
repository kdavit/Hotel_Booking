import model.Hotel;
import model.Room;

import javax.swing.*;
import java.io.IOException;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyGUIForm myGUIForm = new MyGUIForm();
                myGUIForm.setVisible(true);
            }
        });

//        Filter filter = new Filter();
//        List<Hotel> test =  filter.filterHotels("საქართველო","ბათუმი",4, 115);
//        for (Hotel hotel:test) {
//
//            System.out.printf(hotel.getName() + ":");
//            for (int i = 0; i < hotel.getRooms().size(); i++){
//
//                System.out.printf("  " + hotel.getRooms().get(i).getNumber());
//            }
//            System.out.printf("\n");
//        }
//
//
//
//        List<Hotel> l = DataLoader.listLoader();
//
//
//        for(int i = 0; i < l.size(); i++)
//        {
//            List<Room> r = l.get(i).getRooms();
//            System.out.printf("სასტუმრო: " + l.get(i).getName() + "     ოთახები:");
//            for (int j = 0;j<=r.size()-1;j++)
//            {
//                System.out.printf(r.get(j).getNumber() + ", ");
//            }
//            System.out.printf("\n");
//        }

    }
}