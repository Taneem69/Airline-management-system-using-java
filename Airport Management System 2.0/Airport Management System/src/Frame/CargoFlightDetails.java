package Frame;

import Engine.*;
import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.Container;
import javax.swing.border.Border;

//for Dashboard
public class CargoFlightDetails implements ActionListener, MouseListener {

    PassengerFlight[] flight = new PassengerFlight[100];

    JFrame frame;
    ImageIcon ii, pp;
    Container c;
    Font font, font2;
    JPanel panel, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9;
    JLabel label, label2, label3, label4, label5, label6, label7, label8, label9;
    JTextField tf1, tf2;
    JPasswordField pf1;
    JTextArea ta1;
    Border border, border2;

    JComboBox<String> cmb;
    JTextArea display1, display2;
    CargoFlight CF1, CF2, CF3, CF4, CF5;
    PassengerFlight PF1, PF2, PF3, PF4, PF5;
    String[] name;
    JButton passengerFlight, cargoFlight, passengerDetails, employeeDetails, Logout, insert, delete;
    CFRegistration sf5;

    public CargoFlightDetails() {

        frame = new JFrame();

        CF1 = new CargoFlight("92A", "09 May 12.30 am", "10 May 12.30", "AIUB Airport", "Cox'sbazar Airport", "Cox Air",
                200000);
        CF2 = new CargoFlight("84A", "10 Feb 12.30 am", "10 May 12.30", "AIUB Airport", "Stockholm Airport",
                "Virginia Express",
                500000);
        CF3 = new CargoFlight("72A", "12 Jun 12.30 am", "10 May 12.30", "AIUB Airport", "Norway  Airport", "Europe Air",
                600000);
        CF4 = new CargoFlight("65A", "15 May 1:30 am", "10 May 12.30", "AIUB Airport", "Colombo Airport",
                "Colombo Warrior",
                150000);
        CF5 = new CargoFlight("52A", "09 May 5.30 am", "10 May 12.30", "AIUB Airport", "Syedpur Airport", "Janani Air",
                650000);
        frame.setTitle("Cargo Flight Information");
        font = new Font("Poppins", Font.BOLD, 20);
        frame.setFont(font);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        insert = new JButton("Insert");

        insert.setBounds(1520, 700, 90, 40);
        insert.setFont(new Font("Arial Black", Font.PLAIN, 15));
        insert.setBorderPainted(true);
        insert.setFocusPainted(false);

        insert.setForeground(new Color(210, 210, 210));
        insert.setBackground(new Color(105, 115, 122));

        frame.add(insert);

        delete = new JButton("Delete");

        delete.setBounds(1520, 800, 90, 40);
        delete.setFont(new Font("Arial Black", Font.PLAIN, 15));
        delete.setBorderPainted(true);
        delete.setFocusPainted(false);

        delete.setForeground(new Color(210, 210, 210));
        delete.setBackground(new Color(105, 115, 122));

        frame.add(delete);

        name = new String[] { "CF1", "CF2", "CF3", "CF4", "CF5" };
        cmb = new JComboBox<>(name);
        cmb.setBounds(1480, 480, 150, 40);

        cmb.setSelectedIndex(0);
        cmb.setFont(new Font("Arial Black", Font.BOLD, 10));

        cmb.setBackground(new Color(0, 153, 155));
        cmb.setForeground(new Color(234, 234, 234));
        frame.add(cmb);
        cmb.addActionListener(this);

        label3 = new JLabel();
        label3 = new JLabel("Select Your Flight");
        label3.setBounds(1480, 420, 420, 50);
        label3.setForeground(new Color(105, 115, 122));
        label3.setFont(new Font("Arial Black", Font.PLAIN, 16));
        frame.add(label3);

        panel5 = new JPanel();
        panel5.setBounds(1400, 350, 20, 520);
        panel5.setBackground(new Color(0, 153, 160));
        frame.add(panel5);

        display2 = new JTextArea();
        display2.setBounds(1400, 350, 285, 520);
        display2.setBackground(new Color(234, 234, 234));
        display2.setForeground(new Color(0, 153, 155));

        display2.setComponentOrientation(ComponentOrientation.UNKNOWN);
        display2.setBorder(border);

        frame.add(display2);

        display1 = new JTextArea();
        display1.setBounds(900, 350, 495, 520);
        display1.setBackground(new Color(234, 234, 234));
        display1.setForeground(new Color(0, 153, 155));
        display1.setComponentOrientation(ComponentOrientation.UNKNOWN);
        display1.setBorder(border);

        frame.add(display1);

        pp = new ImageIcon("forgui.png");
        label = new JLabel(pp);
        label.setBounds(-10, 0, 600, 200);
        label.setBackground(new Color(0, 200, 15));
        frame.add(label);

        label2 = new JLabel("       Cargo Flight Details");
        label2.setBounds(1130, 230, 420, 70);
        label2.setForeground(new Color(105, 115, 122));
        label2.setFont(new Font("Arial Black", Font.BOLD, 25));
        frame.add(label2);

        // Details label er frame er panel ta
        border2 = BorderFactory.createLineBorder(new Color(105, 115, 122), 6);
        panel4 = new JPanel();
        panel4.setBounds(1130, 230, 390, 70);
        panel4.setBackground(new Color(234, 234, 234));
        panel4.setForeground(new Color(210, 210, 210));

        panel4.setBorder(border2);
        frame.add(panel4);
        // text area er nicher panel ta
        panel3 = new JPanel();
        panel3.setBackground(new Color(0, 153, 160));
        panel3.setBounds(875, 325, 830, 570);
        frame.add(panel3);

        panel2 = new JPanel();
        panel2.setBackground(new Color(204, 204, 204));
        panel2.setBounds(100, 72, 1950, 65);
        frame.add(panel2);

        panel = new JPanel();
        panel.setBackground(new Color(0, 153, 160));
        panel.setBounds(0, 0, 1950, 200);
        frame.add(panel);

        border2 = BorderFactory.createLineBorder(new Color(0, 153, 155), 5);

        c = frame.getContentPane();
        c.setBackground(new Color(204, 204, 204));

        insert.addActionListener(this);
        Logout.addActionListener(this);
        passengerFlight.addActionListener(this);
        delete.addActionListener(this);

        passengerDetails.addActionListener(this);
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
        if (e.getSource() == insert) {

            new CFRegistration();

            frame.setVisible(false);

        }

        if (e.getSource() == passengerFlight) {

            new PassengerFlightDetails();
            frame.setVisible(false);
        }

        if (e.getSource() == passengerDetails) {

            new PassengerDetails();
            frame.setVisible(false);

        }
        if (e.getSource() == employeeDetails) {

            new EmployeeDetails();
            frame.setVisible(false);

        }

        if (cmb.getSelectedItem() == "CF1") {
            display1.setText("\n\n\n        Flight number : " + CF1.getFlightNumber() + "\n"
                    + "        Departure time : " + CF1.getDepartureTime() + "\n"
                    + "        Arrival time : " + CF1.getArrivalTime() + "\n"
                    + "        Departure airport: " + CF1.getDepartureAirport() + "\n"
                    + "        Arrival airport : " + CF1.getArrivalAirport() + "\n"

                    + "        Plane name : " + CF1.getPlaneName() + "\n"
                    + "        Cost : " + CF1.getCost() + "\n");
            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }

        if (cmb.getSelectedItem() == "CF2") {
            display1.setText("\n\n\n        Flight number : " + CF2.getFlightNumber() + "\n"
                    + "        Departure time : " + CF2.getDepartureTime() + "\n"
                    + "        Arrival time : " + CF2.getArrivalTime() + "\n"
                    + "        Departure airport: " + CF2.getDepartureAirport() + "\n"
                    + "        Arrival airport : " + CF2.getArrivalAirport() + "\n"

                    + "        Plane name : " + CF2.getPlaneName() + "\n"
                    + "        Cost : " + CF2.getCost() + "\n");
            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }

        if (cmb.getSelectedItem() == "CF3")

        {
            display1.setText("\n\n\n        Flight number : " + CF3.getFlightNumber() + "\n"
                    + "        Departure time : " + CF3.getDepartureTime() + "\n"
                    + "        Arrival time : " + CF3.getArrivalTime() + "\n"
                    + "        Departure airport: " + CF3.getDepartureAirport() + "\n"
                    + "        Arrival airport : " + CF3.getArrivalAirport() + "\n"

                    + "        Plane name : " + CF3.getPlaneName() + "\n"
                    + "        Cost : " + CF3.getCost() + "\n");
            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }

        if (cmb.getSelectedItem() == "CF4") {
            display1.setText("\n\n\n        Flight number : " + CF4.getFlightNumber() + "\n"
                    + "        Departure time : " + CF4.getDepartureTime() + "\n"
                    + "        Arrival time : " + CF4.getArrivalTime() + "\n"
                    + "        Departure airport: " + CF4.getDepartureAirport() + "\n"
                    + "        Arrival airport : " + CF4.getArrivalAirport() + "\n"

                    + "        Plane name : " + CF4.getPlaneName() + "\n"
                    + "        Cost : " + CF4.getCost() + "\n");
            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }

        if (cmb.getSelectedItem() == "CF5") {
            display1.setText("\n\n\n        Flight number : " + CF5.getFlightNumber() + "\n"
                    + "        Departure time : " + CF5.getDepartureTime() + "\n"
                    + "        Arrival time : " + CF5.getArrivalTime() + "\n"
                    + "        Departure airport: " + CF5.getDepartureAirport() + "\n"
                    + "        Arrival airport : " + CF5.getArrivalAirport() + "\n"

                    + "        Plane name : " + CF5.getPlaneName() + "\n"
                    + "        Cost : " + CF5.getCost() + "\n");
            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }
        if (cmb.getSelectedItem() == cmb.getItemAt(5)) {
            try {
                FileReader reader = new FileReader("CargoFlight.txt");
                BufferedReader buffReader = new BufferedReader(reader);
                display1.read(reader, null);
                display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                display1.setEditable(false);

            } catch (Exception ef) {
                System.out.println("Error");
            }

        }
        if (e.getSource() == delete) {

            cmb.removeItemAt(cmb.getSelectedIndex());
            display1.setText("");
            display1.setEditable(true);

        }

    }

    private void setVisible(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
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