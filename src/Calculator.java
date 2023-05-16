import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JDialog {
    private JPanel calculator;
    private JTextField ecran;
    private JButton equals;
    private JButton divide;
    private JButton multiply;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton sum;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton difference;
    private JButton ACButton;
    private JButton a6Button;
    private JButton a9Button;
    private JButton dot;
    private char sign;
    private double a,b, res;
    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ecran.setText("0");
                a = 0;
                b = 0;
                res = 0;
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a1Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a1Button.getText());
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a2Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a2Button.getText());
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a3Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a3Button.getText());
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a4Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a4Button.getText());
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a5Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a5Button.getText());
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a6Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a6Button.getText());
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a7Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a7Button.getText());
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a8Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a8Button.getText());
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().equals("0")) {
                    ecran.setText(a9Button.getText());
                } else {
                    ecran.setText(ecran.getText() + a9Button.getText());
                }
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ecran.getText().contains(".")) {
                    ecran.setText(ecran.getText());
                } else {
                    ecran.setText(ecran.getText() + dot.getText());
                }
            }
        });

        //MATH OPERATIONS LOGIC

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(ecran.getText());

                ecran.setText("0");
                sign = '+';
            }
        });
        difference.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(ecran.getText());
                ecran.setText("0");
                sign = '-';
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(ecran.getText());
                ecran.setText("0");
                sign = 'x';
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(ecran.getText());
                ecran.setText("0");
                sign = '/';
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(ecran.getText());
                if (sign == '+') {
                    res = a + b;
                    ecran.setText(String.valueOf(res));
                } else if (sign == '-') {
                    res = a - b;
                    ecran.setText(String.valueOf(res));
                } else if (sign == 'x') {
                    res = a * b;
                    ecran.setText(String.valueOf(res));
                } else if (sign == '/') {
                    res = a / b;
                    ecran.setText(String.valueOf(res));
                }

            }
        });

    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
