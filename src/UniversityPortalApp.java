import javax.swing.*;
import java.awt.*;

public class UniversityPortalApp extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    public UniversityPortalApp() {
        setTitle("University Academic Services Portal");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Initialize CardLayout and the center panel holding the cards
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Add the individual service panels with unique string keys
        cardPanel.add(new CoursePanel(), "COURSE");
        cardPanel.add(new FeePanel(), "FEE");
        cardPanel.add(new ExamPanel(), "EXAM");
        cardPanel.add(new HostelPanel(), "HOSTEL");
        cardPanel.add(new LibraryPanel(), "LIBRARY");

        // Create the navigation sidebar, passing the layout and card container reference
        SidebarPanel sidebarPanel = new SidebarPanel(cardLayout, cardPanel);

        // Add components to the main frame
        add(sidebarPanel, BorderLayout.WEST);
        add(cardPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}