package Frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton signIn, exit, register;
    ImageIcon background, icon;
    JLabel l;

    public HomePage() {
        frame = new JFrame("Home Page");

        panel = new JPanel();

        signIn = new JButton("Sign In");
        signIn.addActionListener(this);
        signIn.setFocusable(false);
        register = new JButton("Registration");
        register.addActionListener(this);
        register.setFocusable(false);
        exit = new JButton("Exit");
        exit.addActionListener(this);
        exit.setFocusable(false);

        icon = new ImageIcon("D:\\SVG files\\svg-xmlns=httpwww.w3.org2000svg-ver.png");
        background = new ImageIcon("Airplane.jpg");
        frame.setIconImage(icon.getImage());

        panel.setLayout(null);

        l = new JLabel("", background, JLabel.NORTH_EAST);

        l.setBounds(0, 0, 1920, 1000);
        signIn.setBounds(1550, 50, 80, 30);
        signIn.setBackground(Color.GREEN);

        register.setBounds(1650, 50, 110, 30);
        register.setBackground(Color.YELLOW);
        exit.setBounds(1780, 50, 80, 30);
        exit.setBackground(Color.RED);

        frame.add(panel);

        panel.add(signIn);
        panel.add(register);
        panel.add(exit);
        panel.add(l);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signIn) {
            frame.setVisible(false);
            new LoginPage();
        }

        if (e.getSource() == register) {
            frame.setVisible(false);
            new RegistrationPage();
        }

        if (e.getSource() == exit) {
            System.exit(0);

        }
    }
}
