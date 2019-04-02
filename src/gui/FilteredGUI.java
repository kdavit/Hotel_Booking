import javax.swing.*;

public class FilteredGUI extends JFrame {
    private JTextArea hotelsTextArea;
    private JPanel root;

    public FilteredGUI() {
        add(root);
        setTitle("Result");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    public void setHotelsTextArea(String text) {
        this.hotelsTextArea.setText(text);
    }

    public String getHotelsTextArea() {
        return hotelsTextArea.getText();
    }
}
