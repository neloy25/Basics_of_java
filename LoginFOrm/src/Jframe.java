import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Jframe extends JFrame implements ActionListener{
    Container c;
    Font fn = new Font("Arial", Font.BOLD, 16);
    Font fn1 = new Font("Arial", Font.PLAIN, 13);

    JLabel lbl1  = new JLabel("Username ");
    JLabel lbl2  = new JLabel("Password");
    JLabel lbl3  = new JLabel();

    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton btn = new JButton("Submit");
    ArrayList<User> users = LoadData.loadAll();
    ArrayList<User> user1 = new ArrayList<>();


    public Jframe() {
        c = getContentPane();
        c.setLayout(null);

        lbl1.setBounds(50,50,100,50);
        lbl1.setFont(fn);

        username.setBounds(150,60,150,30);
        username.setFont(fn1);

        lbl2.setBounds(50,100,100,50);
        lbl2.setFont(fn);

        lbl3.setBounds(130, 210, 150,30);
        lbl3.setFont(fn);

        password.setBounds(150,110,150,30);
        password.setFont(fn1);

        btn.setBounds(130, 170, 100,30);
        btn.setFont(fn1);

        c.add(username);
        c.add(password);
        c.add(lbl1);
        c.add(lbl2);
        c.add(btn);
        c.add(lbl3);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            String user = username.getText();
            String pass = new String(password.getPassword());

            for(User u : users) {
                if(user.equals(u.getUsername())) {
                    if(pass.equals(u.getPassword())) {
                        lbl3.setText("Valid User");
                    } else {
                        lbl3.setText("Wrong Password");
                    }
                    return;
                }
            }
            lbl3.setText("Invalid User");
        }
    }
}