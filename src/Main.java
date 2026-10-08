import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Run on the Event Dispatch Thread for Swing thread safety
        SwingUtilities.invokeLater(() -> {
            new UniversityPortalApp();
        });
    }
}