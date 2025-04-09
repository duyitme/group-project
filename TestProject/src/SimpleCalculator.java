import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame {

    private JTextField display;

    public SimpleCalculator() {
        // Khởi tạo khung GUI chính
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tạo ô hiển thị kết quả
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        add(display, BorderLayout.NORTH);

        // Tạo panel cho các nút
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calc = new SimpleCalculator();
            calc.setVisible(true);
        });
    }
}