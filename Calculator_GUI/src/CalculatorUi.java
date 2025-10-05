import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorUi extends JFrame {
    private final JTextField display;
    private double firstNum = 0;
    private String operator = "";
    private final CalculatorLogic calculator;

    public CalculatorUi() {
        super("Calculator by rhmvvCYB3R");
        calculator = new CalculatorLogic();

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "C","0","=","+"
        };

        for (String button : buttons) {
            JButton b = new JButton(button);
            b.setFont(new Font("Arial", Font.BOLD, 20));
            b.addActionListener(this::buttonPressed);
            buttonPanel.add(b);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void buttonPressed(ActionEvent e) {
        String command = ((JButton)e.getSource()).getText();

        if ("0123456789".contains(command)) {
            if (display.getText().equals("0")) {
                display.setText(command);
            } else {
                display.setText(display.getText() + command);
            }
        } else if ("+-*/".contains(command)) {
            firstNum = Double.parseDouble(display.getText());
            operator = command;
            display.setText("0");
        } else if ("=".equals(command)) {
            double secondNumber = Double.parseDouble(display.getText());
            double result = calculator.calculate(firstNum, secondNumber, operator);
            display.setText("" + result);
        } else if ("C".equals(command)) {
            display.setText("0");
            firstNum = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        new CalculatorUi();
    }
}
