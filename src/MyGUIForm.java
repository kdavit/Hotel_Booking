import model.Hotel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MyGUIForm extends JFrame {
    private JTextField countryField;
    private JTextField priceField;
    private JTextField cityField;
    private JTextField starField;
    private JButton submitButton;
    private JPanel rootPanel;

    public MyGUIForm() {
        add(rootPanel);

        setTitle("Filter Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FilteredGUI filteredGUI = new FilteredGUI();

                String country = countryField.getText();
                String city = cityField.getText();
                int star = Integer.parseInt(starField.getText());
                int price = Integer.parseInt(priceField.getText());

                Filter filter = new Filter();
                List<Hotel> test = filter.filterHotels(country, city, star, price);
                for (Hotel hotel : test) {

                    filteredGUI.getHotelsTextArea().append("სასტუმრო: " + hotel.getName() + "   ოთახები: ");

                    System.out.printf("სასტუმრო: " + hotel.getName() + "   ოთახები: ");
                    for (int i = 0; i < hotel.getRooms().size(); i++) {

                        filteredGUI.getHotelsTextArea().append("  " + hotel.getRooms().get(i).getNumber() + ";");
                        System.out.printf("  " + hotel.getRooms().get(i).getNumber() + ";");
                    }
                    System.out.printf("\n");
                }

                JOptionPane.showMessageDialog(rootPanel, filteredGUI.getHotelsTextArea());
            }
        });
    }

}
