import javax.swing.*;
import java.awt.*;

public class CoursePanel extends JPanel {
    public CoursePanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Course Registration Dashboard");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        JTextArea content = new JTextArea("Manage your semester enrollment, select electives, and review prerequisites here.");
        content.setEditable(false);
        add(new JScrollPane(content), BorderLayout.CENTER);
    }
}