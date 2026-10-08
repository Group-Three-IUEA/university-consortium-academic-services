import javax.swing.*;
import java.awt.*;

public class FeePanel extends JPanel {
    public FeePanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Fee Payment & Financials");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        JTextArea content = new JTextArea("View tuition balances, transaction history, and pay semester fees securely.\nCurrent Balance: $2,450.00");
        content.setEditable(false);
        add(new JScrollPane(content), BorderLayout.CENTER);
    }
}