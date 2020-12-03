

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class StudentFrame extends JFrame {
 private final JLabel student;
 
 public StudentFrame() {
         setLayout(new FlowLayout());

         student = new JLabel();
         Icon photo = new ImageIcon(getClass().getResource("test.png"));
         student.setIcon(photo);
         student.setText("<html>Muhammad Rizky Widodo<br />NRP: 05111940000216</html>");
         student.setHorizontalTextPosition(SwingConstants.CENTER);
         student.setVerticalTextPosition(SwingConstants.BOTTOM);
         student.setBackground(new Color(50f, 50f, 50f, 1f / 3f));
         student.setToolTipText("Muhammad Rizky Widodo NRP: 05111940000216");
         add(student);
     }
}