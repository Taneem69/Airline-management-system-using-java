package Frame;

import Engine.*;
import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import javax.swing.border.Border;

public class ERegistration implements ActionListener {
    PassengerFlightDetails p;
    JFrame frame;
    ImageIcon ii, pp;
    Container c;
    Font font, font2;
    JPanel panel, panel2, panel3, panel4;
    JLabel label, label2, label3, label4, label5, label6, label7, label8, label9;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9;
    JPasswordField pf1;
    Border border, border2;
    JButton Proceed;
    EmployeeDetails p6 = new EmployeeDetails();
    String ename, eage, eid, erole, enational, ephone;

    public ERegistration() {
        PassengerFlight pf = new PassengerFlight();

        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setTitle("Insert Flight Information");
        font = new Font("Poppins", Font.BOLD, 23);
        frame.setFont(font);
        frame.setSize(850, 700);
        frame.setLocation(10, 250);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        panel = new JPanel();
        panel.setBackground(new Color(0, 153, 155));
        panel.setBounds(0, 0, 150, 700);
        frame.add(panel);

        panel2 = new JPanel();
        panel2.setBackground(new Color(0, 153, 155));
        panel2.setBounds(710, 0, 150, 700);
        frame.add(panel2);
        // Frame er uporer border er jonno
        panel3 = new JPanel();
        panel3.setBackground(new Color(0, 153, 155));
        panel3.setBounds(0, 0, 800, 10);
        frame.add(panel3);
        // Frame er nicher border er jonno
        panel4 = new JPanel();
        panel4.setBackground(new Color(0, 153, 155));
        panel4.setBounds(0, 690, 800, 10);
        frame.add(panel4);

        border2 = BorderFactory.createLineBorder(new Color(0, 153, 155), 5);

        font2 = new Font("Helvatica", Font.BOLD, 22);
        label = new JLabel("         Insert Flight Information");
        label.setBorder(border2);
        label.setBounds(240, 60, 350, 50);
        label.setFont(font2);
        label.setForeground(new Color(0, 153, 155));
        label.setBackground(Color.RED);

        label6 = new JLabel("Employee Name");
        label6.setBounds(200, 140, 250, 50);
        label6.setFont(font);
        label6.setForeground(Color.DARK_GRAY);
        label6.setBackground(Color.RED);

        label7 = new JLabel("Employee Age");
        label7.setBounds(200, 190, 250, 50);
        label7.setFont(font);
        label7.setForeground(Color.DARK_GRAY);
        label7.setBackground(Color.RED);

        label8 = new JLabel("Employee ID");
        label8.setBounds(200, 240, 250, 50);
        label8.setFont(font);
        label8.setForeground(Color.DARK_GRAY);
        label8.setBackground(Color.RED);

        label9 = new JLabel("Employee Role");
        label9.setBounds(200, 290, 250, 50);
        label9.setFont(font);
        label9.setForeground(Color.DARK_GRAY);
        label9.setBackground(Color.RED);

        label3 = new JLabel("Employee Nationality");
        label3.setBounds(200, 340, 250, 50);
        label3.setFont(font);
        label3.setForeground(Color.DARK_GRAY);
        label3.setBackground(Color.RED);

        label2 = new JLabel("Employee Phone");
        label2.setBounds(200, 390, 250, 50);
        label2.setFont(font);
        label2.setForeground(Color.DARK_GRAY);
        label2.setBackground(Color.RED);

        frame.add(label9);

        frame.add(label8);

        frame.add(label7);

        frame.add(label6);

        frame.add(label3);

        frame.add(label2);

        frame.add(label);

        border = BorderFactory.createLineBorder(Color.DARK_GRAY, 2);

        tf2 = new JTextField();
        tf2.setBounds(430, 150, 200, 35);
        tf2.setFont(new Font("Monospace", Font.BOLD, 15));
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setBorder(border);

        frame.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(430, 200, 200, 35);
        tf3.setFont(new Font("Monospace", Font.BOLD, 15));
        tf3.setHorizontalAlignment(JTextField.CENTER);
        tf3.setBorder(border);

        frame.add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(430, 250, 200, 35);
        tf4.setFont(new Font("Monospace", Font.BOLD, 15));
        tf4.setHorizontalAlignment(JTextField.CENTER);
        tf4.setBorder(border);

        frame.add(tf4);

        tf5 = new JTextField();
        tf5.setBounds(430, 300, 200, 35);
        tf5.setFont(new Font("Monospace", Font.BOLD, 15));
        tf5.setHorizontalAlignment(JTextField.CENTER);
        tf5.setBorder(border);

        frame.add(tf5);

        tf6 = new JTextField();
        tf6.setBounds(430, 350, 200, 35);
        tf6.setFont(new Font("Monospace", Font.BOLD, 15));
        tf6.setHorizontalAlignment(JTextField.CENTER);
        tf6.setBorder(border);

        frame.add(tf6);

        tf7 = new JTextField();
        tf7.setBounds(430, 400, 200, 35);
        tf7.setFont(new Font("Monospace", Font.BOLD, 15));
        tf7.setHorizontalAlignment(JTextField.CENTER);
        tf7.setBorder(border);

        frame.add(tf7);

        Proceed = new JButton("Proceed");
        Proceed.setBounds(330, 520, 150, 40);
        Proceed.setFont(new Font("Arial Black", Font.PLAIN, 20));
        Proceed.setBorderPainted(false);
        Proceed.setFocusPainted(false);
        Proceed.setBackground(new Color(0, 153, 155));
        Proceed.setForeground(new Color(210, 210, 210));
        frame.add(Proceed);

        c = frame.getContentPane();
        c.setBackground(new Color(204, 204, 204));

        Proceed.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Proceed) {

            ename = tf2.getText();
            eage = tf3.getText();
            eid = tf4.getText();
            erole = tf5.getText();
            enational = tf6.getText();
            ephone = tf7.getText();

            JOptionPane jopt = new JOptionPane();

            String war;
            war = "Fill up each information";

            JLabel warLabel = new JLabel(war);

            warLabel.setFont(new Font("Calibri", Font.BOLD, 15));

            if (ename.isEmpty() == false && eage.isEmpty() == false && eid.isEmpty() == false
                    && erole.isEmpty() == false &&
                    enational.isEmpty() == false && ephone.isEmpty() == false) {
                String data = "\n\n\n        Employee Name : " + tf2.getText()
                        + "\n       Employee Age : " + tf3.getText() + "\n";

                data += "        Employee ID : " + tf4.getText() + "\n" + "        Employee Role : "
                        + tf5.getText() + "\n";
                data += "        Employee Nationality : " + tf6.getText() + "\n" + "        Employee Phone : "
                        + tf7.getText()
                        + "\n";

                showMessageDialog(null, "Registered Successfully");
                try {
                    FileWriter file = new FileWriter("CargoFlight.txt");
                    file.write(data);
                    file.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }

                p6.cmb1.insertItemAt(ename, 5);

                frame.setVisible(false);

            } else {
                showMessageDialog(null, "Please fill up all the information");
            }

        }

    }
}
