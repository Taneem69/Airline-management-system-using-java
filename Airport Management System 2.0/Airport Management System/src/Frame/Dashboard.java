package Frame;

import Engine.*;
import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Container;
import javax.swing.border.Border;

//for Dashboard
public class Dashboard implements ActionListener, MouseListener {
    JFrame frame;
    ImageIcon ii, pp, dd;
    Container c;
    Font font, font2;
    JPanel panel, panel2, panel3;
    JLabel label, label2, label3, label4, label5, label6, label7;
    JTextField tf1, tf2;
    JPasswordField pf1;
    JTextArea ta1;
    Border border, border2;

    JButton passengerFlight, cargoFlight, passengerDetails, employeeDetails, Logout;

    public Dashboard() {
        frame = new JFrame();
        frame.setTitle("DASHBOARD");
        font = new Font("Poppins", Font.BOLD, 20);
        frame.setFont(font);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(850, 600);
        // setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        ii = new ImageIcon("logo.png");
        frame.setIconImage(ii.getImage());

        passengerFlight = new JButton("Passenger Flights");

        passengerFlight.setBounds(530, 83, 240, 40);
        passengerFlight.setFont(new Font("Arial Black", Font.PLAIN, 20));
        passengerFlight.setBorderPainted(false);
        passengerFlight.setFocusPainted(false);
        passengerFlight.setBackground(new Color(210, 210, 210));
        passengerFlight.setForeground(new Color(0, 153, 155));
        passengerFlight.setOpaque(true);
        passengerFlight.setContentAreaFilled(false);

        frame.add(passengerFlight);

        cargoFlight = new JButton("Cargo Flights");

        cargoFlight.setBounds(800, 83, 240, 40);
        cargoFlight.setFont(new Font("Arial Black", Font.PLAIN, 20));
        cargoFlight.setBorderPainted(false);
        cargoFlight.setFocusPainted(false);
        cargoFlight.setBackground(new Color(210, 210, 210));
        cargoFlight.setForeground(new Color(0, 153, 155));
        cargoFlight.setOpaque(true);
        cargoFlight.setContentAreaFilled(false);

        frame.add(cargoFlight);

        passengerDetails = new JButton("Passenger Details");

        passengerDetails.setBounds(1070, 83, 240, 40);
        passengerDetails.setFont(new Font("Arial Black", Font.PLAIN, 20));
        passengerDetails.setBorderPainted(false);
        passengerDetails.setFocusPainted(false);
        passengerDetails.setBackground(new Color(210, 210, 210));
        passengerDetails.setForeground(new Color(0, 153, 155));
        passengerDetails.setOpaque(true);
        passengerDetails.setContentAreaFilled(false);

        frame.add(passengerDetails);

        employeeDetails = new JButton("Employee Details");

        employeeDetails.setBounds(1339, 83, 240, 40);
        employeeDetails.setFont(new Font("Arial Black", Font.PLAIN, 20));
        employeeDetails.setBorderPainted(false);
        employeeDetails.setFocusPainted(false);
        employeeDetails.setBackground(new Color(210, 210, 210));
        employeeDetails.setForeground(new Color(0, 153, 155));
        employeeDetails.setOpaque(true);
        employeeDetails.setContentAreaFilled(false);

        frame.add(employeeDetails);

        Logout = new JButton("Logout");

        Logout.setBounds(1780, 83, 100, 40);
        Logout.setFont(new Font("Arial Black", Font.PLAIN, 17));
        Logout.setBorderPainted(true);
        Logout.setFocusPainted(false);

        Logout.setForeground(new Color(210, 210, 210));
        Logout.setBackground(new Color(105, 115, 122));
        Logout.setOpaque(true);

        frame.add(Logout);

        dd = new ImageIcon("Dashboard.png");
        label6 = new JLabel(dd);
        label6.setBounds(0, 200, 1950, 820);
        label6.setBackground(new Color(0, 200, 15));
        frame.add(label6);

        pp = new ImageIcon("forgui.png");
        label = new JLabel(pp);
        label.setBounds(-10, 0, 600, 200);
        label.setBackground(new Color(0, 200, 15));
        frame.add(label);

        panel2 = new JPanel();
        panel2.setBackground(new Color(204, 204, 204));
        panel2.setBounds(100, 72, 1950, 65);
        frame.add(panel2);

        label3 = new JLabel("Passenger Flight Information");

        panel = new JPanel();
        panel.setBackground(new Color(0, 153, 160));
        panel.setBounds(0, 0, 1950, 200);
        frame.add(panel);

        border2 = BorderFactory.createLineBorder(new Color(0, 153, 155), 5);

        c = frame.getContentPane();
        c.setBackground(new Color(204, 204, 204));

        cargoFlight.addActionListener(this);
        Logout.addActionListener(this);
        passengerFlight.addActionListener(this);
        employeeDetails.addActionListener(this);

        passengerFlight.addMouseListener(this);
        cargoFlight.addMouseListener(this);
        passengerDetails.addMouseListener(this);
        employeeDetails.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Logout) {

            new LoginPage();
            frame.setVisible(false);

        }
        if (e.getSource() == passengerFlight) {
            new PassengerFlightDetails();
            frame.setVisible(false);
        }
        if (e.getSource() == cargoFlight) {
            new CargoFlightDetails();
            frame.setVisible(false);
        }
        if (e.getSource() == employeeDetails) {
            new EmployeeDetails();
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
        if (e.getSource() == passengerFlight) {
            passengerFlight.setForeground(new Color(105, 115, 122));
        }
        if (e.getSource() == cargoFlight) {
            cargoFlight.setForeground(new Color(105, 115, 122));
        }
        if (e.getSource() == passengerDetails) {
            passengerDetails.setForeground(new Color(105, 115, 122));
        }
        if (e.getSource() == employeeDetails) {
            employeeDetails.setForeground(new Color(105, 115, 122));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == passengerFlight) {
            passengerFlight.setForeground(new Color(0, 153, 155));
        }
        if (e.getSource() == cargoFlight) {
            cargoFlight.setForeground(new Color(0, 153, 155));
        }
        if (e.getSource() == passengerDetails) {
            passengerDetails.setForeground(new Color(0, 153, 155));
        }
        if (e.getSource() == employeeDetails) {
            employeeDetails.setForeground(new Color(0, 153, 155));
        }
    }
}
