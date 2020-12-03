package id.ac.its.salman159;

import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class StudentFrame extends JFrame{
	
	private final JLabel student;

    public StudentFrame() {
        setLayout(new FlowLayout());

        student = new JLabel();
        Icon photo = new ImageIcon(getClass().getResource("foto.png"));
        student.setIcon(photo);
        student.setText("<html>Nama: Salman Damai Alfariq<br>NRP: 05111940000159</html>");
        student.setHorizontalTextPosition(SwingConstants.CENTER);
        student.setVerticalTextPosition(SwingConstants.BOTTOM);
        student.setToolTipText("<html>Nama: Salman Damai Alfariq<br>NRP: 05111940000159</html>");
        add(student);
    }
}
