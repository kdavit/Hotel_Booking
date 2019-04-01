import javax.swing.*;

public class FilteredGUI extends JFrame {
    private JTextArea hotelsTextArea;

    public void setHotelsTextArea(JTextArea hotelsTextArea) {
        this.hotelsTextArea = hotelsTextArea;
    }

    public JTextArea getHotelsTextArea() {
        return hotelsTextArea;
    }
}
