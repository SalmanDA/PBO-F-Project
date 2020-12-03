package id.ac.its.fikrisandi195;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		String radius = 
			    JOptionPane.showInputDialog("Enter the radius of Circle");
			  
			  if(Double.parseDouble(radius) <= 0) {
			   JOptionPane.showMessageDialog(null, "radius must be > 0.");
			  } 
			  else {
			   Circle c = new Circle( Double.parseDouble(radius));
			  
			   JOptionPane.showMessageDialog(null, "The Area is: " + c.area() +
			     "\nThe Circumference is: " + c.circumference());
			  }
	}

}
