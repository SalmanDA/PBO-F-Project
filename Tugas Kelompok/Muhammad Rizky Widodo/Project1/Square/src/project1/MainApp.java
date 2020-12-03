package project1;

import javax.swing.JOptionPane;

public class MainApp {

 public static void main(String[] args) {
  String side = 
    JOptionPane.showInputDialog("Enter the side of the Square");
  
  if(Double.parseDouble(side) <= 0 || Double.parseDouble(side) <= 0) {
   JOptionPane.showMessageDialog(null, "Side must be > 0.");
  } else {
   square r = new square( Double.parseDouble(side));
  
   JOptionPane.showMessageDialog(null, "The Area is: " + r.area() +
     "\nThe Circumference is: " + r.circumference());
  }
 }

}