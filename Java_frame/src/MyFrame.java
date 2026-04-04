// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JProgressBar;
// import javax.swing.Timer;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// class MyProg extends JFrame implements ActionListener {

//     Container c;
//     JProgressBar pb;
//     JButton btn;
//     Timer timer;
//     int value = 0;

//     public MyProg() {
//         setTitle("Progress Bar Demo");

//         c = getContentPane();
//         c.setLayout(null);

//         Font fn = new Font("Arial", Font.PLAIN, 17);

//         // Progress Bar
//         pb = new JProgressBar(0, 100);
//         pb.setBounds(50, 50, 250, 40);
//         pb.setStringPainted(true);
//         pb.setForeground(Color.BLUE);
//         pb.setFont(fn);
//         pb.setValue(0);

//         // Button
//         btn = new JButton("Download");
//         btn.setBounds(120, 120, 120, 40);
//         btn.setFont(fn);

//         // Timer (fast animation)
//         timer = new Timer(50, this);

//         // Add components
//         c.add(pb);
//         c.add(btn);

//         // Action listener
//         btn.addActionListener(this);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {

//         if (e.getSource() == btn) {
//             value = 0;
//             pb.setValue(0);
//             btn.setEnabled(false);
//             timer.start();
//         }

//         if (e.getSource() == timer) {
//             value++;
//             pb.setValue(value);

//             if (value >= 100) {
//                 timer.stop();
//                 btn.setEnabled(true);
//             }
//         }
//     }
// }

// public class MyFrame {
//     public static void main(String[] args) {

//         MyProg frm = new MyProg();
//         frm.setSize(350, 250);
//         frm.setLocationRelativeTo(null); // center window
//         frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frm.setVisible(true);
//     }
// }