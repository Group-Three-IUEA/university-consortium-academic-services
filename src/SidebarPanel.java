import javax.swing.*;
import java.awt.*;

public class SidebarPanel extends JPanel {

    public SidebarPanel(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new GridLayout(6, 1, 5, 5));
        setBackground(new Color(44, 62, 80));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel titleLabel = new JLabel("Portal Menu", JLabel.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(titleLabel);

        // Navigation buttons linked to respective cards
        add(createNavButton("Course Registration", cardLayout, cardPanel, "COURSE"));
        add(createNavButton("Fee Payment", cardLayout, cardPanel, "FEE"));
        add(createNavButton("Examination Results", cardLayout, cardPanel, "EXAM"));
        add(createNavButton("Hostel Applications", cardLayout, cardPanel, "HOSTEL"));
        add(createNavButton("Library Services", cardLayout, cardPanel, "LIBRARY"));
    }

    private JButton createNavButton(String text, CardLayout cardLayout, JPanel cardPanel, String cardName) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setBackground(new Color(52, 152, 219));
        button.setForeground(Color.WHITE);

        // Switch cards instantly on click
        button.addActionListener(e -> cardLayout.show(cardPanel, cardName));
        return button;
    }
}