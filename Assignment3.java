import java.util.Scanner;

import javax.swing.JOptionPane;
public class Assignment3 {
	public static void main(String[]args)
	{
		String U, P;
		U = JOptionPane.showInputDialog("Enter your username");// prompt the user to input the username.
		
		for (int i = 0; i < 3; i++ ){
			if ( U.equals("admin")){i=+3; }// loop allows three times to enter the username.
			                               // admin is set up as a default username.
			if (!U.equals("admin")){
				U = JOptionPane.showInputDialog("Enter your username");i++; }}// prompt the user to enter the username again after entering wrong input. 
		
		if (!U .equals("admin")) {
			JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");// displays the message after the required number of attempts.
			System.exit(0);
			}
		
		P = JOptionPane.showInputDialog("Enter your password");// prompt the user to input the password.
		for (int c = 0; c < 3; c++ ){
			if (P.equals("pass")){
			JOptionPane.showMessageDialog(null, "Wellcome " + U);c+=3; }// loop allows three times to enter the password.
                                                                       // pass is set up as a default password.
		
			if (!P.equals("pass")){
				P = JOptionPane.showInputDialog("Enter your password");c++; }}// prompt the user to enter the password again after entering wrong input.
		
		if (!P.equals("pass")) {
			JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");// displays the message after the required number of attempts.
			System.exit(0);
			}
		String[] choices = { "Admin", "Student", "Staff"};// after the account success it prompt user to select the account type.
		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		JOptionPane.showMessageDialog(null, "Welcome" + input + "!");// displays the message after selecting the account type.

       }
}
		
		
		
		
		
		
		
		
		
		
		
		
	
