import javax.swing.*;
import java.awt.*;

public class ExamPanel extends JPanel {
    public ExamPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Examination Results");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        JTextArea content = new JTextArea("Access your grade reports, GPA summaries, and semester transcripts.\n\nCumulative GPA: 3.78 / 4.00");
        content.setEditable(false);
        add(new JScrollPane(content), BorderLayout.CENTER);
    }
}