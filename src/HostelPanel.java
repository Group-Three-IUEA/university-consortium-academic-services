import javax.swing.*;
import java.awt.*;

public class HostelPanel extends JPanel {
    public HostelPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Hostel Applications & Accommodation");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        JTextArea content = new JTextArea("Apply for on-campus housing, check room availability, and submit maintenance requests.");
        content.setEditable(false);
        add(new JScrollPane(content), BorderLayout.CENTER);
    }
}