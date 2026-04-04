import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jframe extends JFrame implements ActionListener{
    Container c;
    Font fn = new Font("Arial", Font.BOLD, 16);
    Font fn1 = new Font("Arial", Font.PLAIN, 13);

    JLabel lbl1  = new JLabel();
    JLabel lbl2  = new JLabel();

    JTextField input = new JTextField();
    JButton btn = new JButton("Convert");

    public Jframe() {
        c = getContentPane();
        c.setLayout(null);

        lbl1.setBounds(50,50,60,50);
        lbl1.setText("Dollar");
        lbl1.setFont(fn);

        lbl2.setBounds(250,90,150,50);
        lbl2.setText("Taka");
        lbl2.setFont(fn);

        input.setBounds(50,100,150,40);
        input.setFont(fn);

        btn.setBounds(130, 230, 100,30);
        btn.setFont(fn1);

        c.add(input);
        c.add(lbl1);
        c.add(lbl2);
        c.add(btn);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            int dollar = Integer.parseInt(input.getText());
            int taka = 126 * dollar;
            String s = "Taka: " + String.valueOf(taka);
            lbl2.setText(s);
        }
    }

    public Container getC() {
        return c;
    }

    public void setC(Container c) {
        this.c = c;
    }

    public Font getFn() {
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn1() {
        return fn1;
    }

    public void setFn1(Font fn1) {
        this.fn1 = fn1;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }

    public JTextField getInput() {
        return input;
    }

    public void setInput(JTextField input) {
        this.input = input;
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }
}