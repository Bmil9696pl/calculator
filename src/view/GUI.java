package view;

import calculate.calculate;
import shuntingYard.shuntingYard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class GUI {
    private static GUI form;

    private JTextField expressionTextField;
    private JButton Zakoncz;
    private JButton BP;
    private JButton right_parenth;
    private JButton CLRButton;
    private JButton left_partenth;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton division;
    private JButton multiplication;
    private JButton six;
    private JButton five;
    private JButton four;
    private JButton subtraction;
    private JButton three;
    private JButton two;
    private JButton one;
    private JButton zero;
    private JButton dot;
    private JButton isEqual;
    private JButton sum;
    private JPanel mainPanel;

    private String string = "";

    public boolean checkValid(){
        if(!Objects.equals(string, "")) {
            Character c = string.charAt(string.length()-1);
            return Character.isLetterOrDigit(c);
        } else {
            return false;
        }
    }

    public GUI() {

        Zakoncz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        BP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(string.length()>0) {
                    string = string.substring(0, string.length() - 1);
                }
                expressionTextField.setText(string);
            }
        });
        CLRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string = "";
                expressionTextField.setText(string);
            }
        });
        left_partenth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "(";
                expressionTextField.setText(string);
            }
        });
        right_parenth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += ")";
                expressionTextField.setText(string);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "7";
                expressionTextField.setText(string);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "8";
                expressionTextField.setText(string);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "9";
                expressionTextField.setText(string);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "4";
                expressionTextField.setText(string);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "5";
                expressionTextField.setText(string);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "6";
                expressionTextField.setText(string);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "1";
                expressionTextField.setText(string);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "2";
                expressionTextField.setText(string);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "3";
                expressionTextField.setText(string);
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "0";
                expressionTextField.setText(string);
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkValid()) {
                    string += ".";
                    expressionTextField.setText(string);
                }
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkValid()) {
                    string += "/";
                    expressionTextField.setText(string);
                }
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkValid()) {
                    string += "*";
                    expressionTextField.setText(string);
                }
            }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkValid()) {
                    string += "-";
                    expressionTextField.setText(string);
                }
            }
        });
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkValid()) {
                    string += "+";
                    expressionTextField.setText(string);
                }
            }
        });
        isEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkValid() ) {
                    string = String.valueOf(calculate.calculate(shuntingYard.infixToRpn(string)));
                    expressionTextField.setText(string);
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Kalkulator");
        form = new GUI();
        mainFrame.setContentPane(form.mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
