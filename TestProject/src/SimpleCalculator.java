import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {

    private JTextField display;
    private boolean start = true;

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
    
 // Thêm nút số
    public void addNumberButtons(JPanel panel) {
        ActionListener numberListener = e -> {
            String digit = e.getActionCommand();
            if (start) {
                display.setText(digit);
                start = false;
            } else {
                display.setText(display.getText() + digit);
            }
        };

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            panel.add(button);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calc = new SimpleCalculator();
            JPanel buttonPanel = (JPanel) calc.getContentPane().getComponent(1);
            calc.addNumberButtons(buttonPanel); // Gọi hàm thêm nút số
            calc.setVisible(true);
        });
    }
}