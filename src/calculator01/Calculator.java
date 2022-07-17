package calculator01;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        JPanel mainPanel = new JPanel();
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);

        topPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        mainPanel.setLayout(new GridLayout(4,4));

        topPanel.add(new JLabel("0"));
        mainPanel.add(new JOperandButton("7"));
        mainPanel.add(new JOperandButton("8"));
        mainPanel.add(new JOperandButton("9"));
        mainPanel.add(new JOperatorButton("/"));
        mainPanel.add(new JOperandButton("4"));
        mainPanel.add(new JOperandButton("5"));
        mainPanel.add(new JOperandButton("6"));
        mainPanel.add(new JOperatorButton("x"));
        mainPanel.add(new JOperandButton("1"));
        mainPanel.add(new JOperandButton("2"));
        mainPanel.add(new JOperandButton("3"));
        mainPanel.add(new JOperatorButton("-"));
        mainPanel.add(new JOperandButton("0"));
        mainPanel.add(new JOperandButton("."));
        mainPanel.add(new JOperatorButton("="));
        mainPanel.add(new JOperatorButton("+"));


        frame.setVisible(true);
    }
}
