package Frame;

import Engine.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.border.Border;

//Login Frame
public class LoginPage implements ActionListener, MouseListener {
    RegistrationPage p;
    JFrame frame;
    ImageIcon ii, pp, dd;
    Container c;
    Font font, font2;
    JPanel panel, panel2;
    JLabel label, label2, label3, label4, label5, label6, label7;
    JTextField tf1, tf2;
    JPasswordField pf1;
    Border border, border2;

    JButton Login, SignUp, Exit;

    public LoginPage() {

        frame = new JFrame();

        frame.setTitle("LOGIN");
        font = new Font("Poppins", Font.BOLD, 20);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(850, 600);
        // setLocationRelativeTo(null);
        frame.setLayout(null);
        // setResizable(false);

        ii = new ImageIcon("logo.png");
        frame.setIconImage(ii.getImage());

        pp = new ImageIcon("logo3.png");
        label4 = new JLabel(pp);
        label4.setBounds(126, 190, 600, 600);
        label4.setBackground(new Color(0, 200, 15));
        frame.add(label4);

        panel = new JPanel();
        panel.setBackground(new Color(0, 153, 155));
        panel.setBounds(0, 0, 900, 1100);
        frame.add(panel);

        label = new JLabel("Username");
        label.setBounds(1250, 350, 100, 50);
        label.setFont(font);
        label.setForeground(Color.DARK_GRAY);
        label.setBackground(Color.RED);
        // label.setOpaque(true);

        border2 = BorderFactory.createLineBorder(new Color(0, 153, 155), 5);

        font2 = new Font("Helvatica", Font.BOLD, 26);
        label2 = new JLabel(" LOGIN");
        label2.setBorder(border2);
        label2.setBounds(1340, 280, 107, 40);
        label2.setFont(font2);
        label2.setForeground(new Color(0, 153, 155));
        label2.setBackground(Color.RED);

        label3 = new JLabel("Password");
        label3.setBounds(1250, 430, 100, 50);
        label3.setFont(font);
        label3.setForeground(Color.DARK_GRAY);
        label3.setBackground(Color.RED);

        label5 = new JLabel("Don't have an account ?");
        label5.setBounds(1300, 640, 300, 50);
        label5.setFont(new Font("Poppins", Font.PLAIN, 15));
        label5.setForeground(Color.DARK_GRAY);
        label5.setBackground(Color.RED);

        frame.add(label5);

        frame.add(label3);

        frame.add(label2);

        frame.add(label);

        border = BorderFactory.createLineBorder(Color.DARK_GRAY, 2);
        tf1 = new JTextField();
        tf1.setBounds(1250, 395, 300, 40);
        tf1.setBorder(border);
        tf1.setFont(new Font("Monospace", Font.BOLD, 15));
        tf1.setHorizontalAlignment(JTextField.CENTER);

        tf1.setOpaque(true);

        frame.add(tf1);

        pf1 = new JPasswordField();
        pf1.setBounds(1250, 475, 300, 40);
        pf1.setBorder(border);
        pf1.setFont(new Font("Monospace", Font.BOLD, 15));
        pf1.setHorizontalAlignment(JTextField.CENTER);
        pf1.setOpaque(true);
        frame.add(pf1);

        Login = new JButton("Login");
        Login.setBounds(1250, 540, 80, 40);
        Login.setFont(new Font("Dialog Input", Font.BOLD, 15));
        Login.setBorderPainted(true);
        Login.setFocusPainted(false);
        Login.setBackground(new Color(0, 153, 155));

        Login.setForeground(new Color(210, 210, 210));

        Login.setOpaque(true);
        Login.setContentAreaFilled(true);

        frame.add(Login);

        SignUp = new JButton("Sign Up");
        SignUp.setBounds(1435, 643, 120, 40);
        SignUp.setFont(new Font("Dialog Input", Font.BOLD, 17));
        SignUp.setBorderPainted(false);
        SignUp.setFocusPainted(false);
        SignUp.setBackground(new Color(210, 210, 210));
        SignUp.setForeground(new Color(0, 153, 155));
        SignUp.setOpaque(true);
        SignUp.setContentAreaFilled(false);

        SignUp.addMouseListener(this);

        frame.add(SignUp);

        Exit = new JButton("Exit");
        Exit.setBounds(1470, 540, 80, 40);
        Exit.setFont(new Font("Dialog Input", Font.BOLD, 15));
        Exit.setBorderPainted(true);
        Exit.setFocusPainted(false);
        Exit.setForeground(new Color(210, 210, 210));
        Exit.setBackground(new Color(105, 115, 122));

        Exit.setOpaque(true);
        Exit.setContentAreaFilled(true);

        frame.add(Exit);

        c = frame.getContentPane();
        c.setBackground(new Color(204, 204, 204));

        Exit.addActionListener(this);
        SignUp.addActionListener(this);
        Login.addActionListener(this);

    }

    @SuppressWarnings("static-access")
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Login) {
            String user = tf1.getText();
            String pass = pf1.getText();
            String empty = "";
            boolean flag = false;
            JOptionPane jopt = new JOptionPane();

            String result, war;
            war = "Fill up each information";
            result = "Wrong username or password";
            JLabel resLabel = new JLabel(result);
            JLabel warLabel = new JLabel(war);

            resLabel.setFont(new Font("Calibri", Font.BOLD, 15));
            warLabel.setFont(new Font("Calibri", Font.BOLD, 15));

            if (user.isEmpty() == false && pass.isEmpty() == false) {

                try {
                    File file = new File("Login.txt");
                    Scanner scanner = new Scanner(file);

                    while (scanner.hasNextLine()) {
                        empty += scanner.nextLine() + "\n";
                    }

                    scanner.close();

                    // Check if username and password match any registration data
                    if (empty.contains("Username : " + user) && empty.contains("Password : " + pass)) {
                        flag = true;

                    }

                } catch (FileNotFoundException ex) {
                    System.out.println("File not found: " + ex.getMessage());
                }
                if (flag) {

                    new Dashboard();
                    frame.setVisible(false);

                } else {

                    jopt.showMessageDialog(null, resLabel, "Error Found", JOptionPane.OK_CANCEL_OPTION);
                }
                // frame.setVisible(false);
            }

            else {
                jopt.showMessageDialog(null, warLabel, "Empty Found", JOptionPane.OK_CANCEL_OPTION);
            }

        } else if (e.getSource() == SignUp) {

            new RegistrationPage();
            frame.setVisible(false);
        } else if (e.getSource() == Exit) {
            System.exit(0);
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

        SignUp.setForeground(Color.DARK_GRAY);

    }

    @Override
    public void mouseExited(MouseEvent e) {

        SignUp.setForeground(new Color(0, 153, 155));

    }

}
