package shop;

// import files
import sign.CustomerLogin;
import sign.ManagerLogin;
import swing.Theme;

// import java swing packages
import javax.swing.*;
import javax.swing.border.EmptyBorder;

// import java awt packages
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Store extends JFrame implements ActionListener {

    // variables
    private static final long serialVersionUID = 1L;
    private final JButton buttonExit;
    private final JButton buttonEmployee;
    private final JButton buttonCustomer;

    public Store() {
        super("Store");

        this.setSize(Theme.GUI_WIDTH, Theme.GUI_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Theme.BACKGROUND_PANEL);

        JLabel title = new JLabel("Welcome to Store");
        title.setBounds(30, 40, 380, 75);
        title.setOpaque(true);
        title.setBorder(new EmptyBorder(0, 20, 0, 0));
        title.setFont(Theme.FONT_TITLE);
        title.setForeground(Theme.COLOR_TITLE);
        title.setBackground(Theme.BACKGROUND_TITLE);
        panel.add(title);

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(Theme.GUI_WIDTH - 140, 40, Theme.BUTTON_PRIMARY_WIDTH, 30);
        buttonExit.setFont(Theme.FONT_BUTTON);
        buttonExit.setBackground(Color.WHITE);
        buttonExit.setForeground(Theme.COLOR_TITLE);
        buttonExit.addActionListener(this);
        panel.add(buttonExit);

        buttonEmployee = new JButton("Employee");
        buttonEmployee.setBounds(325, 300, 150, 50);
        buttonEmployee.setFont(Theme.FONT_BUTTON);
        buttonEmployee.setBackground(Theme.BACKGROUND_BUTTON_PRIMARY);
        buttonEmployee.setForeground(Theme.COLOR_TITLE);
        buttonEmployee.addActionListener(this);
        panel.add(buttonEmployee);

        buttonCustomer = new JButton("Customer");
        buttonCustomer.setBounds(325, 400, 150, 50);
        buttonCustomer.setFont(Theme.FONT_BUTTON);
        buttonCustomer.setBackground(Theme.BACKGROUND_BUTTON_PRIMARY);
        buttonCustomer.setForeground(Theme.COLOR_TITLE);
        buttonCustomer.addActionListener(this);
        panel.add(buttonCustomer);

        JLabel header = new JLabel();
        header.setBackground(Theme.BACKGROUND_HEADER);
        header.setOpaque(true);
        header.setBounds(0, 0, Theme.GUI_WIDTH, 75);
        panel.add(header);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(buttonExit)) {
            System.exit(0);
        } else if (ae.getSource().equals(buttonEmployee)) {
            this.setVisible(false);
            new ManagerLogin().setVisible(true);
        } else if (ae.getSource().equals(buttonCustomer)) {
            this.setVisible(false);
            new CustomerLogin().setVisible(true);
        }
    }
}