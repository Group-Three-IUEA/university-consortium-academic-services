import javax.swing.*;
import java.awt.*;

public class LibraryPanel extends JPanel {
    public LibraryPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Library Services");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        JTextArea content = new JTextArea("Search the university catalog, reserve study spaces, and view currently checked-out books.");
        content.setEditable(false);
        add(new JScrollPane(content), BorderLayout.CENTER);
    }
}