package Frame;

import Engine.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.FileWriter;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.border.Border;

//Registration Frame
public class RegistrationPage implements ActionListener, MouseListener {

    JFrame frame;
    ImageIcon ii, pp;
    Container c;
    Font font, font2;
    JPanel panel, panel2;
    JLabel label, label2, label3, label4, label5, label6, label7, label8, label9;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JPasswordField pf1;
    Border border, border2;
    JButton SignUp, SignIn;

    public RegistrationPage() {
        frame = new JFrame();
        // setUndecorated(true);
        frame.setTitle("REGISTRATION");
        font = new Font("Poppins", Font.BOLD, 23);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setFont(font);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(850, 600);
        // setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        ii = new ImageIcon("logo.png");
        frame.setIconImage(ii.getImage());

        pp = new ImageIcon(
                "logo3.png");
        label4 = new JLabel(pp);
        label4.setBounds(126, 190, 600, 600);
        label4.setBackground(new Color(0, 200, 15));
        frame.add(label4);

        panel = new JPanel();
        panel.setBackground(new Color(0, 153, 155));
        panel.setBounds(0, 0, 900, 1100);
        frame.add(panel);

        label = new JLabel("Name");
        label.setBounds(1270, 318, 110, 50);
        label.setFont(font);
        label.setForeground(Color.DARK_GRAY);
        label.setBackground(Color.RED);
        // label.setOpaque(true);

        border2 = BorderFactory.createLineBorder(new Color(0, 153, 155), 5);

        font2 = new Font("Helvatica", Font.BOLD, 26);
        label2 = new JLabel(" Registration");
        label2.setBorder(border2);
        label2.setBounds(1355, 250, 175, 50);
        label2.setFont(font2);
        label2.setForeground(new Color(0, 153, 155));
        label2.setBackground(Color.RED);

        label3 = new JLabel("Password");
        label3.setBounds(1270, 565, 110, 50);
        label3.setFont(font);
        label3.setForeground(Color.DARK_GRAY);
        label3.setBackground(Color.RED);

        label5 = new JLabel("Already have an account ?");
        label5.setBounds(1335, 680, 300, 50);
        label5.setFont(new Font("Poppins", Font.PLAIN, 15));
        label5.setForeground(Color.DARK_GRAY);
        label5.setBackground(Color.RED);

        label6 = new JLabel("Username");
        label6.setBounds(1270, 365, 115, 50);
        label6.setFont(font);
        label6.setForeground(Color.DARK_GRAY);
        label6.setBackground(Color.RED);

        label7 = new JLabel("Age");
        label7.setBounds(1270, 414, 115, 50);
        label7.setFont(font);
        label7.setForeground(Color.DARK_GRAY);
        label7.setBackground(Color.RED);

        label8 = new JLabel("Nationality");
        label8.setBounds(1270, 465, 122, 50);
        label8.setFont(font);
        label8.setForeground(Color.DARK_GRAY);
        label8.setBackground(Color.RED);

        label9 = new JLabel("Mobile No");
        label9.setBounds(1270, 516, 115, 50);
        label9.setFont(font);
        label9.setForeground(Color.DARK_GRAY);
        label9.setBackground(Color.RED);

        frame.add(label9);

        frame.add(label8);

        frame.add(label7);

        frame.add(label6);

        frame.add(label5);

        frame.add(label3);

        frame.add(label2);

        frame.add(label);

        border = BorderFactory.createLineBorder(Color.DARK_GRAY, 2);
        tf1 = new JTextField();
        tf1.setBounds(1410, 325, 200, 35);
        tf1.setFont(new Font("Monospace", Font.BOLD, 15));
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setBorder(border);
        tf1.setOpaque(true);

        frame.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(1410, 375, 200, 35);
        tf2.setFont(new Font("Monospace", Font.BOLD, 15));
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setBorder(border);
        tf2.setOpaque(true);
        frame.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(1410, 425, 200, 35);
        tf3.setFont(new Font("Monospace", Font.BOLD, 15));
        tf3.setHorizontalAlignment(JTextField.CENTER);
        tf3.setBorder(border);
        tf3.setOpaque(true);
        frame.add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(1410, 475, 200, 35);
        tf4.setFont(new Font("Monospace", Font.BOLD, 15));
        tf4.setHorizontalAlignment(JTextField.CENTER);
        tf4.setBorder(border);
        tf4.setOpaque(true);
        frame.add(tf4);

        tf5 = new JTextField();
        tf5.setBounds(1410, 525, 200, 35);
        tf5.setFont(new Font("Monospace", Font.BOLD, 15));
        tf5.setHorizontalAlignment(JTextField.CENTER);
        tf5.setBorder(border);
        tf5.setOpaque(true);
        frame.add(tf5);

        pf1 = new JPasswordField();
        pf1.setBounds(1410, 575, 200, 35);
        pf1.setFont(new Font("Monospace", Font.BOLD, 15));
        pf1.setHorizontalAlignment(JTextField.CENTER);
        pf1.setBorder(border);
        pf1.setOpaque(true);
        frame.add(pf1);

        SignUp = new JButton("Sign Up");
        SignUp.setBounds(1385, 640, 100, 40);
        SignUp.setFont(new Font("Dialog Input", Font.BOLD, 15));
        SignUp.setBorderPainted(true);
        SignUp.setFocusPainted(false);
        SignUp.setBackground(new Color(0, 153, 155));

        SignUp.setForeground(new Color(210, 210, 210));

        SignUp.setOpaque(true);
        SignUp.setContentAreaFilled(true);

        frame.add(SignUp);

        SignIn = new JButton("Sign In");
        SignIn.setBounds(1480, 685, 120, 40);
        SignIn.setFont(new Font("Dialog Input", Font.BOLD, 17));
        SignIn.setBorderPainted(false);
        SignIn.setFocusPainted(true);
        SignIn.setBackground(new Color(210, 210, 210));
        SignIn.setForeground(new Color(0, 153, 155));
        SignIn.setOpaque(true);
        SignIn.setContentAreaFilled(false);

        frame.add(SignIn);

        c = frame.getContentPane();
        c.setBackground(new Color(204, 204, 204));

        SignIn.addActionListener(this);
        SignUp.addActionListener(this);
        SignIn.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SignIn) {
            new LoginPage();
            frame.setVisible(false);
        }

        // durjoy er part
        if (e.getSource() == SignUp) {
            String name = tf1.getText();
            String user = tf2.getText();
            String age = tf3.getText();
            String nationality = tf4.getText();
            String mobile = tf5.getText();
            String password = pf1.getText();
            JOptionPane jopt = new JOptionPane();

            String war;
            war = "Fill up each information";

            JLabel warLabel = new JLabel(war);

            warLabel.setFont(new Font("Calibri", Font.BOLD, 15));

            if (name.isEmpty() == false && user.isEmpty() == false && age.isEmpty() == false
                    && nationality.isEmpty() == false &&
                    mobile.isEmpty() == false && password.isEmpty() == false) {
                String data = "\n\nName : " + tf1.getText() + "\nUsername : " + tf2.getText() + "\n";

                data += "Age : " + tf3.getText() + "\n" + "Nationality : " + tf4.getText() + "\n";
                data += "Mobile no : " + tf4.getText() + "\n" + "Password : " + pf1.getText() + "\n" + "\n";
                showMessageDialog(null, "Registered Successfully");
                try {
                    FileWriter file = new FileWriter("Login.txt", true);
                    file.write(data + "\n" + "\n");
                    file.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            } else {
                showMessageDialog(null, "Please fill up all the information");
            }
            new LoginPage();
            frame.setVisible(false);

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        SignIn.setForeground(Color.DARK_GRAY);

    }

    @Override
    public void mouseExited(MouseEvent e) {

        SignIn.setForeground(new Color(0, 153, 155));

    }

}
