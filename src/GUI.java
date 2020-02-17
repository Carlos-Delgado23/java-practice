import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(280, 155);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // USER
        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);


        //PASSWORD
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        //BUTTON
        button = new JButton("Login");
        button.setBounds(98, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        //SUCCESS WITH CORRECT USERNAME AND PASSWORD
        success = new JLabel("");
        success.setBounds(90, 105, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    // LOGIN VALIDATION
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("Charlie") && password.equals("charlietre123")){
            success.setText("Login Successful!");
        } else {
            success.setText("Try again");
        }
    }
}
