package Frame;

import Engine.*;
import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.border.Border;

//for Dashboard
public class PassengerFlightDetails implements ActionListener, MouseListener {

        JFrame frame;
        ImageIcon ii, pp;
        Container c;
        Font font, font2;
        JPanel panel, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9;
        JLabel label, label2, label3, label4, label5, label6, label7, label8, label9;
        JTextField tf1, tf2;
        JPasswordField pf1;

        Border border, border2;
        String[] names;
        JComboBox<String> cmb, cmb2;
        JTextArea display, display1;

        PassengerFlight PF1, PF2, PF3, PF4, PF5;
        PFRegistration fr;

        JButton passengerFlight, cargoFlight, passengerDetails, employeeDetails, Logout, insert, delete;

        public PassengerFlightDetails() {

                frame = new JFrame();

                PF1 = new PassengerFlight("12A", "5 May 10:30 pm", "6 May 11:00 am", "AIUB airport", "Dubai Airport",
                                "Economic", "Emirates", 300000);
                PF2 = new PassengerFlight("34B", "6 May 1:00 pm", "6 May 11am", "AIUB airport", "Kennedy Airport",
                                "Business class", "Qatar Airways", 700000);
                PF3 = new PassengerFlight("56C", "7 May 8:30 am", "7 May 11:00 am", "AIUB airport", "Delhi Airport",
                                "Economic",
                                "Vistara", 150000);
                PF4 = new PassengerFlight("78D", "8 May 10:00 am", "8 May 1:00 pm", "AIUB airport",
                                "Chittogong Airport",
                                "Economic", "Bangladesh Biman", 50000);
                PF5 = new PassengerFlight("777", "9 May 10:00 pm", "10 May 6:00 pm", "AIUB airport", "Melbourn Airport",
                                "First class", "Airbus A380", 1000000);

                frame.setTitle("Passenger Flight Information");
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

                names = new String[] { "PF1", "PF2", "PF3", "PF4", "PF5" };
                cmb = new JComboBox<>(names);
                cmb.setBounds(1480, 480, 150, 40);
                cmb.setSelectedIndex(0);
                cmb.setFont(new Font("Arial Black", Font.BOLD, 10));
                cmb.setBackground(new Color(0, 153, 155));
                cmb.setForeground(new Color(234, 234, 234));
                frame.add(cmb);
                cmb.addActionListener(this);

                label3 = new JLabel();
                label3 = new JLabel(" Select Your Flight ");
                label3.setBounds(1470, 420, 420, 50);
                label3.setForeground(new Color(105, 115, 122));
                label3.setFont(new Font("Arial Black", Font.PLAIN, 16));
                frame.add(label3);

                panel5 = new JPanel();
                panel5.setBounds(1400, 350, 20, 520);
                panel5.setBackground(new Color(0, 153, 160));
                frame.add(panel5);

                display1 = new JTextArea();
                display1.setBounds(1400, 350, 285, 520);
                display1.setBackground(new Color(234, 234, 234));
                display1.setForeground(new Color(0, 153, 155));

                display1.setComponentOrientation(ComponentOrientation.UNKNOWN);
                display1.setBorder(border);

                frame.add(display1);

                display = new JTextArea();
                display.setBounds(900, 350, 495, 520);
                display.setBackground(new Color(234, 234, 234));
                display.setForeground(new Color(0, 153, 155));
                display.setComponentOrientation(ComponentOrientation.UNKNOWN);
                display.setBorder(border);

                frame.add(display);

                pp = new ImageIcon("forgui.png");
                label = new JLabel(pp);
                label.setBounds(-10, 0, 600, 200);
                label.setBackground(new Color(0, 200, 15));
                frame.add(label);

                label2 = new JLabel("  Passenger Flight Details");
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

                Logout.addActionListener(this);
                passengerFlight.addActionListener(this);
                insert.addActionListener(this);
                delete.addActionListener(this);
                cargoFlight.addActionListener(this);
                passengerDetails.addActionListener(this);
                employeeDetails.addActionListener(this);

                passengerFlight.addMouseListener(this);
                cargoFlight.addMouseListener(this);
                passengerDetails.addMouseListener(this);
                employeeDetails.addMouseListener(this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

                if (e.getSource() == insert) {

                        new PFRegistration();
                        frame.setVisible(false);

                }
                if (e.getSource() == Logout) {

                        new LoginPage();
                        frame.setVisible(false);

                }

                if (e.getSource() == cargoFlight) {

                        new CargoFlightDetails();
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

                if (cmb.getSelectedItem() == "PF1") {
                        display.setText("\n\n\n        Flight number : " + PF1.getFlightNumber() + "\n"
                                        + "        Departure time : " + PF1.getDepartureTime() + "\n"
                                        + "        Arrival time : " + PF1.getArrivalTime() + "\n"
                                        + "        Departure airport: " + PF1.getDepartureAirport() + "\n"
                                        + "        Arrival airport : " + PF1.getArrivalAirport() + "\n"
                                        + "        Class : " + PF1.getFlightClass() + "\n"
                                        + "        Plane name : " + PF1.getPlaneName() + "\n"
                                        + "        Cost : " + PF1.getCost() + "\n");
                        display.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                        display.setEditable(false);
                }

                if (cmb.getSelectedItem() == "PF2") {
                        display.setText("\n\n\n        Flight number : " + PF2.getFlightNumber() + "\n"
                                        + "        Departure time : " + PF2.getDepartureTime() + "\n"
                                        + "        Arrival time : " + PF2.getArrivalTime() + "\n"
                                        + "        Departure airport: " + PF2.getDepartureAirport() + "\n"
                                        + "        Arrival airport : " + PF2.getArrivalAirport() + "\n"
                                        + "        Class : " + PF2.getFlightClass() + "\n"
                                        + "        Plane name : " + PF2.getPlaneName() + "\n"
                                        + "        Cost : " + PF2.getCost() + "\n");
                        display.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                        display.setEditable(false);
                }

                if (cmb.getSelectedItem() == "PF3")

                {
                        display.setText("\n\n\n        Flight number : " + PF3.getFlightNumber() + "\n"
                                        + "        Departure time : " + PF3.getDepartureTime() + "\n"
                                        + "        Arrival time : " + PF3.getArrivalTime() + "\n"
                                        + "        Departure airport: " + PF3.getDepartureAirport() + "\n"
                                        + "        Arrival airport : " + PF3.getArrivalAirport() + "\n"
                                        + "        Class : " + PF3.getFlightClass() + "\n"
                                        + "        Plane name  " + PF3.getPlaneName() + "\n"
                                        + "        Cost : " + PF3.getCost() + "\n");
                        display.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                        display.setEditable(false);
                }

                if (cmb.getSelectedItem() == "PF4") {
                        display.setText("\n\n\n        Flight number : " + PF4.getFlightNumber() + "\n"
                                        + "        Departure time : " + PF4.getDepartureTime() + "\n"
                                        + "        Arrival time : " + PF4.getArrivalTime() + "\n"
                                        + "        Departure airport: " + PF4.getDepartureAirport() + "\n"
                                        + "        Arrival airport : " + PF4.getArrivalAirport() + "\n"
                                        + "        Class : " + PF4.getFlightClass() + "\n"
                                        + "        Plane name : " + PF4.getPlaneName() + "\n"
                                        + "        Cost : " + PF4.getCost() + "\n");
                        display.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                        display.setEditable(false);
                }

                if (cmb.getSelectedItem() == "PF5") {
                        display.setText("\n\n\n        Flight number : " + PF5.getFlightNumber() + "\n"
                                        + "        Departure time : " + PF5.getDepartureTime() + "\n"
                                        + "        Arrival time : " + PF5.getArrivalTime() + "\n"
                                        + "        Departure airport: " + PF5.getDepartureAirport() + "\n"
                                        + "        Arrival airport : " + PF5.getArrivalAirport() + "\n"
                                        + "        Class : " + PF5.getFlightClass() + "\n"
                                        + "        Plane name : " + PF5.getPlaneName() + "\n"
                                        + "        Cost : " + PF5.getCost() + "\n");
                        display.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                        display.setEditable(false);
                }

                if (cmb.getSelectedItem() == cmb.getItemAt(5)) {

                        try {
                                FileReader reader = new FileReader("PassengerFlight.txt");
                                BufferedReader buffReader = new BufferedReader(reader);
                                display.read(reader, null);
                                display.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                                display.setEditable(false);

                        } catch (Exception ef) {
                                System.out.println("Error");
                        }

                }
                if (e.getSource() == delete) {
                        display.setText("");
                        display.setEditable(true);
                        cmb.removeItemAt(cmb.getSelectedIndex());

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

        public void setVisible(boolean b) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
        }
}