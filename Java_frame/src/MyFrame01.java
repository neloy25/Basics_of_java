package Java_frame.src;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyProg01 extends JFrame implements ActionListener, ItemListener {

    Container c;
    JButton btn;
    int value = 0;
    JLabel lbl1 = new JLabel("Select Coffee");
    JLabel lbl2 = new JLabel("Selected");
    JLabel lbl3 = new JLabel("Type");
    JLabel lbl4 = new JLabel("Size");
    
    JRadioButton rb1 = new JRadioButton("Large");
    JRadioButton rb2 = new JRadioButton("Regular");
    JRadioButton rb3 = new JRadioButton("Small");
    ButtonGroup bg = new ButtonGroup();
    JComboBox<Object> cmb = new JComboBox<>();

    public MyProg01() {
        setTitle("Progress Bar Demo");

        c = getContentPane();
        c.setLayout(null);

        Font fn = new Font("Arial", Font.PLAIN, 17);
        Font fn1 = new Font("Arial", Font.BOLD, 17);

        btn = new JButton("Download");
        btn.setBounds(200, 200, 120, 50);
        btn.setFont(fn);

        lbl1.setBounds(50,20, 120,40);
        lbl1.setFont(fn);

        lbl2.setBounds(400,20, 120,40);
        lbl2.setFont(fn);

        lbl3.setBounds(400,50, 120,40);
        lbl3.setForeground(Color.RED);
        lbl3.setFont(fn1);

        lbl4.setBounds(400,80, 120,40);
        lbl4.setForeground(Color.BLUE);
        lbl4.setFont(fn1);

        cmb.setBounds(50,60,120,20);
        cmb.setFont(fn);
        cmb.addItem("Latte");
        cmb.addItem("Cappucino");
        cmb.addItem("Mocha");
        cmb.addItem("Black Coffee");
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        rb1.setBounds(200,50,100,30);
        rb1.setFont(fn);
        rb2.setBounds(200,80,100,30);
        rb2.setFont(fn);
        rb3.setBounds(200,110,100,30);
        rb3.setFont(fn);

        c.add(lbl1);
        c.add(btn);
        c.add(cmb);
        c.add(lbl2);
        c.add(lbl3);
        c.add(lbl4);
        c.add(rb1);
        c.add(rb2);
        c.add(rb3);

        btn.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        cmb.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            
        }

        if(e.getSource() == rb1) {
            lbl4.setText("Large");
        }
        if(e.getSource() == rb2) {
            lbl4.setText("Regular");
        }
        if(e.getSource() == rb3) {
            lbl4.setText("Small");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = (String)cmb.getSelectedItem();
        lbl3.setText(s);
    }
}

public class MyFrame01 {
    public static void main(String[] args) {

        MyProg01 frm = new MyProg01();
        frm.setBounds(200,100,550,450);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}