 * BASIC GUI APPLICATION, DIALOGUE BOX
 */

import javax.swing.JOptionPane;

public class I006 {
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		// Dialogue box 
		
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		//Edge and sotre this value within an integer variable
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); 
		// with Integer parse method. A String based on what the user types in
		// And PERSE method will convert it to an integer that we can store it
		JOptionPane.showMessageDialog(null, "You are "+age+" years old"); 

		
		//We are using the double value
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); 
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall"); 

	
	}

}
