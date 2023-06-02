package sign;

// import files
import panels.Manager;
import shop.Store;
import swing.Theme;

// import java swing and awt packages
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerLogin extends JFrame implements ActionListener {

    // variables
    private static final long serialVersionUID = 1L;
    private final JButton buttonExit, buttonLogin, buttonBack;
    private final JTextField usernameTF;
    private final JPasswordField passwordF;

    public ManagerLogin() {
        super("Manager Login");

        this.setSize(Theme.GUI_WIDTH, Theme.GUI_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Theme.BACKGROUND_PANEL);

        JLabel title = new JLabel("Manager Login");
        title.setBounds(30, 40, 320, 75);
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

        buttonBack = new JButton("Back");
        buttonBack.setBounds(Theme.GUI_WIDTH - 140, 80, Theme.BUTTON_PRIMARY_WIDTH, 30);
        buttonBack.setFont(Theme.FONT_BUTTON);
        buttonBack.setBackground(Theme.BACKGROUND_BUTTON_PRIMARY);
        buttonBack.setForeground(Theme.COLOR_TITLE);
        buttonBack.addActionListener(this);
        panel.add(buttonBack);

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(210, 280, 120, 30);
        usernameLabel.setFont(Theme.FONT_REGULAR);
        panel.add(usernameLabel);

        usernameTF = new JTextField();
        usernameTF.setBounds(330, 280, 220, 30);
        usernameTF.setFont(Theme.FONT_INPUT);
        panel.add(usernameTF);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(210, 320, 120, 30);
        passwordLabel.setFont(Theme.FONT_REGULAR);
        panel.add(passwordLabel);

        passwordF = new JPasswordField();
        passwordF.setBounds(330, 320, 220, 30);
        passwordF.setFont(Theme.FONT_INPUT);
        panel.add(passwordF);

        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(230, 400, 300, 30);
        buttonLogin.setFont(Theme.FONT_BUTTON);
        buttonLogin.setBackground(Theme.BACKGROUND_BUTTON_PRIMARY);
        buttonLogin.setForeground(Theme.COLOR_BUTTON_PRIMARY);
        buttonLogin.addActionListener(this);
        panel.add(buttonLogin);

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
        } else if (ae.getSource().equals(buttonLogin)) {
            if (usernameTF.getText().equals("admin") && passwordF.getText().equals("admin")) {
                JOptionPane.showMessageDialog(null, "Login Succesful, welcome Manager");
                this.setVisible(false);
                new Manager().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid ID or Password");
            }
        } else if (ae.getSource().equals(buttonBack)) {
            this.setVisible(false);
            new Store().setVisible(true);
        }
    }
}
