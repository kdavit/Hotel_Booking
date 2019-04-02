import model.Hotel;

import javax.swing.*;
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
        setResizable(false);
        submitButton.addActionListener(e -> {


            String country = countryField.getText();
            String city = cityField.getText();
            String star = starField.getText();
            String price = priceField.getText();

            if(country.isEmpty() || city.isEmpty() || star.isEmpty() || price.isEmpty()) {
                JOptionPane.showMessageDialog(rootPanel, "Please enter text");
            } else {
                Filter filter = new Filter();
                List<Hotel> test = filter.filterHotels(country, city, Integer.parseInt(star), Integer.parseInt(price));
                StringBuilder x = new StringBuilder();
                for (Hotel hotel : test) {
                    x.append("სასტუმრო: ").append(hotel.getName()).append("\nოთახები: ");
                    for (int i = 0; i < hotel.getRooms().size(); i++) {
                        x.append("\n").append(hotel.getRooms().get(i).getNumber()).append(";");
                    }
                    x.append("\n");
                }
                if(x.toString().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel, "Can't find matching hotels");
                } else {
                    FilteredGUI filteredGUI = new FilteredGUI();
                    filteredGUI.setHotelsTextArea(x.toString());
                    filteredGUI.setVisible(true);
                    filteredGUI.pack();
                }
            }

        });
    }

}
