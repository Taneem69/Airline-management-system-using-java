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
public class EmployeeDetails implements ActionListener, MouseListener {

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

    JComboBox<String> cmb1;
    JTextArea display1, display2;
    Employee e1, e2, e3, e4, e5;
    String[] name;
    JButton passengerFlight, cargoFlight, passengerDetails, employeeDetails, Logout, insert, delete;
    CFRegistration sf5;

    public EmployeeDetails() {

        frame = new JFrame();

        e1 = new Employee("Taneem", 21, "23-51975-2", "Pilot", "Bangladeshi", "1234567891");
        e2 = new Employee("Tahmid", 22, "23-56456-2", "Pilot", "Spanish", "34375875375");
        e3 = new Employee("Nishat", 25, "23-42323-2", "Pilot", "canadian", "43598934859");
        e4 = new Employee("zihad", 20, "23-75674-2", "security", "English", "34583394854");
        e5 = new Employee("Fardin", 27, "23-24234-2", "security", "french", "44358340958");

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

        name = new String[] { "e1", "e2", "e3", "e4", "e5" };
        cmb1 = new JComboBox<>(name);
        cmb1.setBounds(1480, 480, 150, 40);

        cmb1.setSelectedIndex(0);
        cmb1.setFont(new Font("Arial Black", Font.BOLD, 10));

        cmb1.setBackground(new Color(0, 153, 155));
        cmb1.setForeground(new Color(234, 234, 234));
        frame.add(cmb1);
        cmb1.addActionListener(this);

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

        label2 = new JLabel("         Employee Details");
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
        cargoFlight.addActionListener(this);
        passengerDetails.addActionListener(this);

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

            new ERegistration();

        }

        if (e.getSource() == passengerFlight) {

            new PassengerFlightDetails();
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

        if (cmb1.getSelectedItem() == "e1") {
            display1.setText("\n\n\n       Employee Name : " + e1.getName() + "\n"
                    + "       Employee Age : " + e1.getAge() + "\n"
                    + "       Employee Rolw : " + e1.getRole() + "\n"
                    + "       Employee Nationality: " + e1.getNationality() + "\n"
                    + "       Employee PhoneNo : " + e1.getPhoneNumber() + "\n");

            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }

        if (cmb1.getSelectedItem() == "e2") {
            display1.setText("\n\n\n       Employee Name : " + e2.getName() + "\n"
                    + "       Employee Age : " + e2.getAge() + "\n"
                    + "       Employee Rolw : " + e2.getRole() + "\n"
                    + "       Employee Nationality: " + e2.getNationality() + "\n"
                    + "       Employee PhoneNo : " + e2.getPhoneNumber() + "\n");

            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }

        if (cmb1.getSelectedItem() == "e3") {
            display1.setText("\n\n\n       Employee Name : " + e3.getName() + "\n"
                    + "       Employee Age : " + e3.getAge() + "\n"
                    + "       Employee Rolw : " + e3.getRole() + "\n"
                    + "       Employee Nationality: " + e3.getNationality() + "\n"
                    + "       Employee PhoneNo : " + e3.getPhoneNumber() + "\n");

            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }

        if (cmb1.getSelectedItem() == "e4") {
            display1.setText("\n\n\n       Employee Name : " + e4.getName() + "\n"
                    + "       Employee Age : " + e4.getAge() + "\n"
                    + "       Employee Rolw : " + e4.getRole() + "\n"
                    + "       Employee Nationality: " + e4.getNationality() + "\n"
                    + "       Employee PhoneNo : " + e4.getPhoneNumber() + "\n");

            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }
        if (cmb1.getSelectedItem() == "e5") {
            display1.setText("\n\n\n       Employee Name : " + e5.getName() + "\n"
                    + "       Employee Age : " + e5.getAge() + "\n"
                    + "       Employee Rolw : " + e5.getRole() + "\n"
                    + "       Employee Nationality: " + e5.getNationality() + "\n"
                    + "       Employee PhoneNo : " + e5.getPhoneNumber() + "\n");

            display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            display1.setEditable(false);
        }
        if (cmb1.getSelectedItem() == cmb1.getItemAt(5)) {
            try {
                FileReader reader = new FileReader("EmployeeDetails.txt");
                BufferedReader buffReader = new BufferedReader(reader);
                display1.read(reader, null);
                display1.setFont(new Font("Cooper Black", Font.PLAIN, 25));
                display1.setEditable(false);

            } catch (Exception ef) {
                System.out.println("Error");
            }

        }
        if (e.getSource() == delete) {
            cmb1.removeItemAt(cmb1.getSelectedIndex());
            display1.setText("");
            display1.setEditable(true);
        }

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