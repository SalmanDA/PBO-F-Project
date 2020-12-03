package id.ac.its.fikrisandi195;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class LabelFrame extends JFrame {
	private final JLabel mahasiswa;
	
	public LabelFrame() {
			super("Profil");
	        setLayout(new FlowLayout());
	        
	        mahasiswa = new JLabel();
	        Icon photo = new ImageIcon(getClass().getResource("fikri.jpg"));
	        mahasiswa.setIcon(photo);
	        mahasiswa.setText("<html> Nama: Muhammad Fikri Sandi Pratama <br> NRP: 05111940000195 </html>");
	        mahasiswa.setHorizontalTextPosition(SwingConstants.CENTER);
	        mahasiswa.setVerticalTextPosition(SwingConstants.BOTTOM);
	        mahasiswa.setToolTipText("Nama: Muhammad Fikri Sandi Pratama, NRP: 05111940000195");
	        add(mahasiswa);
	        
	    }
	
}
