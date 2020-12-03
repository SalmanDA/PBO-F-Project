package id.ac.its.salman159;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		String length = 
				JOptionPane.showInputDialog("Enter the length of Rectangle");
		String width = 
				JOptionPane.showInputDialog("Enter the width of Rectangle");
		
		if(Double.parseDouble(length) <= 0 || Double.parseDouble(width) <= 0) {
			JOptionPane.showMessageDialog(null, "Length and Width must be > 0.");
		} else {
			Rectangle r = new Rectangle( Double.parseDouble(length), Double.parseDouble(width));
		
			JOptionPane.showMessageDialog(null, "The Area is: " + r.area() +
				 "\nThe Circumference is: " + r.circumference());
		}
	}

}
