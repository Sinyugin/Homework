import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson8 extends JFrame {
    public int value;

    public Lesson8() {
        setTitle("Starter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(500, 500, 300, 120);
        Font font = new Font("Arial", Font.BOLD, 32);
        JTextField counterValue = new JTextField();
        JButton increaseButton = new JButton("+");
        JButton decreaseButton = new JButton("-");
        counterValue.setFont(font);
        increaseButton.setFont(font);
        decreaseButton.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue, BorderLayout.CENTER);
        add(increaseButton, BorderLayout.EAST);
        add(decreaseButton, BorderLayout.WEST);
        setVisible(true);

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValue.setText(String.valueOf(value));
            }
        });

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValue.setText(String.valueOf(value));
            }
        });

        counterValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.parseInt(counterValue.getText()); //преобразовал строку в число
            }
        });
    }

    public static void main(String[] args) {
        new Lesson8();
    }
}
