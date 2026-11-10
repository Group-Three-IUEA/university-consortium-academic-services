
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityPortalAppTest {

    @Test
    void testCoursePanel() {
        CoursePanel panel = new CoursePanel();

        assertTrue(containsText(panel, "Course Registration Dashboard"));
        assertTrue(containsText(panel, "Manage your semester enrollment"));
    }

    @Test
    void testExamPanel() {
        ExamPanel panel = new ExamPanel();

        assertTrue(containsText(panel, "Examination Results"));
        assertTrue(containsText(panel, "3.78 / 4.00"));
    }

    @Test
    void testFeePanel() {
        FeePanel panel = new FeePanel();

        assertTrue(containsText(panel, "Fee Payment & Financials"));
        assertTrue(containsText(panel, "$2,450.00"));
    }

    @Test
    void testHostelPanel() {
        HostelPanel panel = new HostelPanel();

        assertTrue(containsText(panel, "Hostel Applications & Accommodation"));
        assertTrue(containsText(panel, "room availability"));
    }

    @Test
    void testLibraryPanel() {
        LibraryPanel panel = new LibraryPanel();

        assertTrue(containsText(panel, "Library Services"));
        assertTrue(containsText(panel, "university catalog"));
    }

    @Test
    void testSidebarButtons() {
        CardLayout layout = new CardLayout();
        JPanel cards = new JPanel(layout);

        SidebarPanel sidebar = new SidebarPanel(layout, cards);

        int buttonCount = 0;

        for (Component component : sidebar.getComponents()) {
            if (component instanceof JButton) {
                buttonCount++;
            }
        }

        assertEquals(5, buttonCount);
    }

    @Test
    void testCardNavigation() {
        CardLayout layout = new CardLayout();
        JPanel cards = new JPanel(layout);

        JPanel course = new JPanel();
        JPanel fee = new JPanel();
        JPanel exam = new JPanel();
        JPanel hostel = new JPanel();
        JPanel library = new JPanel();

        cards.add(course, "COURSE");
        cards.add(fee, "FEE");
        cards.add(exam, "EXAM");
        cards.add(hostel, "HOSTEL");
        cards.add(library, "LIBRARY");

        SidebarPanel sidebar = new SidebarPanel(layout, cards);

        for (Component component : sidebar.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;

                if (button.getText().equals("Fee Payment")) {
                    button.doClick();
                    break;
                }
            }
        }

        assertTrue(fee.isVisible());
        assertFalse(course.isVisible());
    }

    private boolean containsText(Container container, String text) {
        for (Component component : container.getComponents()) {

            if (component instanceof JLabel) {
                if (((JLabel) component).getText().contains(text)) {
                    return true;
                }
            }

            if (component instanceof JTextArea) {
                if (((JTextArea) component).getText().contains(text)) {
                    return true;
                }
            }

            if (component instanceof Container) {
                if (containsText((Container) component, text)) {
                    return true;
                }
            }
        }

        return false;
    }
}
