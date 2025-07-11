package Frame;

import Engine.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

public class PassengerDetails implements ActionListener, MouseListener {
        JPanel panel, panel2, panel3;
        JFrame frame;
        JButton passengerFlight, cargoFlight, passengerDetails, employeeDetails, Logout;
        JTable table;
        JLabel label;

        ImageIcon image1, pp;

        PassengerFlight PF1, PF2, PF3, PF4, PF5;
        CargoFlight CF1, CF2, CF3, CF4, CF5;
        Passenger p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20;

        private String[] columnNames = { "Name", "Age", "Passport Number", "Phone Number", "Nationality",
                        "Booked Flight Details" };

        public PassengerDetails() {

                initializePassengerAndFlights();

                frame = new JFrame();
                frame.setTitle("Passenger Details");

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

                pp = new ImageIcon("forgui.png");
                label = new JLabel(pp);
                label.setBounds(-10, 0, 600, 200);
                label.setBackground(new Color(0, 200, 15));
                frame.add(label);

                panel2 = new JPanel();
                panel2.setBackground(new Color(204, 204, 204));
                panel2.setBounds(100, 72, 1950, 65);
                frame.add(panel2);

                panel3 = new JPanel();
                panel3.setBackground(new Color(0, 153, 160));
                panel3.setBounds(0, 0, 1950, 200);
                frame.add(panel3);

                panel = new JPanel();
                panel.setBackground(new Color(204, 204, 204));

                image1 = new ImageIcon("logo.png");
                frame.setIconImage(image1.getImage());

                panel.setLayout(null);

                initializeTable();

                frame.add(panel);

                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                Logout.addActionListener(this);
                cargoFlight.addActionListener(this);
                passengerFlight.addActionListener(this);
                employeeDetails.addActionListener(this);
        }

        private void initializePassengerAndFlights() {

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

                CF1 = new CargoFlight("98A", "12 May 10:00 am", "12 May 11:00 pm", "AIUB airport", "Kennedy Airport",
                                "FedEx Express", 100000);
                CF2 = new CargoFlight("76B", "13 May 1:00 am", "14 May 1:00 pm", "AIUB airport", "Dubai Airport",
                                "UPX Airline",
                                700000);
                CF3 = new CargoFlight("45A", "15 May 1:30 am", "15 May 8:00 pm", "AIUB airport", "Delhi Airport", "DHL",
                                100000);
                CF4 = new CargoFlight("12D", "11 May 10:00 pm", "12 May 11:00 pm", "AIUB airport", "Stockholm Airport",
                                "Amazon Air", 100000);
                CF5 = new CargoFlight("74A", "14 May 11:00 pm", "15 May 1:00 pm", "AIUB airport", "Melbourn Airport",
                                "Atlas Air", 300000);

                p1 = new Passenger("Durjoy", 21, "345DGETRY", "Bangladeshi", "33473477472", PF1);
                p2 = new Passenger("Progga", 22, "495YTRGAG", "Indian", "35438583355", CF3);
                p3 = new Passenger("Shifat", 25, "658TWDBJS", "Bangladeshi", "53458584536", PF3);
                p4 = new Passenger("Rayan", 23, "687JFDHFK", "Canadian", "34534598934", CF4);
                p5 = new Passenger("Pritha", 21, "478JFNJKy", "Korean", "43583958593", PF5);
                p6 = new Passenger("Arian", 24, "66fvhdgff", "Brazilian", "67567534534", PF4);
                p7 = new Passenger("Tahmid", 20, "56dfjdfjk", "Argentine", "45345353353", PF2);
                p8 = new Passenger("Nishat", 29, "34dfbjdhr", "Thai", "40645643234", PF5);
                p9 = new Passenger("Zihad", 45, "23dbvdjjh", "Japanese", "96785685456", CF4);
                p10 = new Passenger("Sanak", 27, "78fjbdffj", "Korean", "78678575664", CF1);
                p11 = new Passenger("Fardin", 32, "43ndjfvvd", "Bangladeshi", "98685675634", CF2);
                p12 = new Passenger("Shanto", 34, "21dcbdhch", "Bangladeshi", "12313234234", PF4);
                p13 = new Passenger("Safa", 56, "98jnfvkjf", "Russian", "56745646450", PF5);
                p14 = new Passenger("Mahin", 43, "63fjjnjkn", "Chinese", "45645644556", CF5);
                p15 = new Passenger("Nusaer", 55, "85hjdbcj", "Chinese", "76667567656", CF2);
                p16 = new Passenger("Mohammad", 68, "11dvjkdfc", "Indian", "23423424344", CF4);
                p17 = new Passenger("Zeba", 30, "33dcjdfdf", "Indian", "89786756444", CF5);
                p18 = new Passenger("Zarifa", 23, "99fdchdcd", "Canadian", "67564534554", PF4);
                p19 = new Passenger("Neha", 37, "44hdbjhdd", "Australian", "56756745984", PF5);
                p20 = new Passenger("Jannat", 34, "15edncjdf", "Russian", "89868575665", PF2);

        }

        private void initializeTable() {

                DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                model.addRow(new Object[] { p1.getName(), p1.getAge(), p1.getPassengerPassportNumber(),
                                p1.getPhoneNumber(),
                                p1.getNationality(), p1.bookedFlightDetails() });
                model.addRow(new Object[] { p2.getName(), p2.getAge(), p2.getPassengerPassportNumber(),
                                p2.getPhoneNumber(),
                                p2.getNationality(), p2.bookedFlightDetails() });
                model.addRow(new Object[] { p3.getName(), p3.getAge(), p3.getPassengerPassportNumber(),
                                p3.getPhoneNumber(),
                                p3.getNationality(), p3.bookedFlightDetails() });
                model.addRow(new Object[] { p4.getName(), p4.getAge(), p4.getPassengerPassportNumber(),
                                p4.getPhoneNumber(),
                                p4.getNationality(), p4.bookedFlightDetails() });
                model.addRow(new Object[] { p5.getName(), p5.getAge(), p5.getPassengerPassportNumber(),
                                p5.getPhoneNumber(),
                                p5.getNationality(), p5.bookedFlightDetails() });
                model.addRow(new Object[] { p6.getName(), p6.getAge(), p6.getPassengerPassportNumber(),
                                p6.getPhoneNumber(),
                                p6.getNationality(), p6.bookedFlightDetails() });
                model.addRow(new Object[] { p7.getName(), p7.getAge(), p7.getPassengerPassportNumber(),
                                p7.getPhoneNumber(),
                                p7.getNationality(), p7.bookedFlightDetails() });
                model.addRow(new Object[] { p8.getName(), p8.getAge(), p8.getPassengerPassportNumber(),
                                p8.getPhoneNumber(),
                                p8.getNationality(), p8.bookedFlightDetails() });
                model.addRow(new Object[] { p9.getName(), p9.getAge(), p9.getPassengerPassportNumber(),
                                p9.getPhoneNumber(),
                                p9.getNationality(), p9.bookedFlightDetails() });
                model.addRow(new Object[] { p10.getName(), p10.getAge(), p10.getPassengerPassportNumber(),
                                p10.getPhoneNumber(),
                                p10.getNationality(), p10.bookedFlightDetails() });
                model.addRow(new Object[] { p11.getName(), p11.getAge(), p11.getPassengerPassportNumber(),
                                p11.getPhoneNumber(),
                                p11.getNationality(), p11.bookedFlightDetails() });
                model.addRow(new Object[] { p12.getName(), p12.getAge(), p12.getPassengerPassportNumber(),
                                p12.getPhoneNumber(),
                                p12.getNationality(), p12.bookedFlightDetails() });
                model.addRow(new Object[] { p13.getName(), p13.getAge(), p13.getPassengerPassportNumber(),
                                p13.getPhoneNumber(),
                                p13.getNationality(), p13.bookedFlightDetails() });
                model.addRow(new Object[] { p14.getName(), p14.getAge(), p14.getPassengerPassportNumber(),
                                p14.getPhoneNumber(),
                                p14.getNationality(), p14.bookedFlightDetails() });
                model.addRow(new Object[] { p15.getName(), p15.getAge(), p15.getPassengerPassportNumber(),
                                p15.getPhoneNumber(),
                                p15.getNationality(), p15.bookedFlightDetails() });
                model.addRow(new Object[] { p16.getName(), p16.getAge(), p16.getPassengerPassportNumber(),
                                p16.getPhoneNumber(),
                                p16.getNationality(), p16.bookedFlightDetails() });
                model.addRow(new Object[] { p17.getName(), p17.getAge(), p17.getPassengerPassportNumber(),
                                p17.getPhoneNumber(),
                                p17.getNationality(), p17.bookedFlightDetails() });
                model.addRow(new Object[] { p18.getName(), p18.getAge(), p18.getPassengerPassportNumber(),
                                p18.getPhoneNumber(),
                                p18.getNationality(), p18.bookedFlightDetails() });
                model.addRow(new Object[] { p19.getName(), p19.getAge(), p19.getPassengerPassportNumber(),
                                p19.getPhoneNumber(),
                                p19.getNationality(), p19.bookedFlightDetails() });
                model.addRow(new Object[] { p20.getName(), p20.getAge(), p20.getPassengerPassportNumber(),
                                p20.getPhoneNumber(),
                                p20.getNationality(), p20.bookedFlightDetails() });

                table = new JTable(model);
                table.setFont(new Font(null, 7, 20));
                table.setRowHeight(40);

                JScrollPane scrollPane = new JScrollPane(table);
                scrollPane.setBounds(300, 240, 1300, 700);
                panel.add(scrollPane);
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