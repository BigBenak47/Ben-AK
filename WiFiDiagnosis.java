/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 2/09/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ben Amon-Kotey
*/

import java.util.Scanner; // Import the Scanner Class
public class WiFiDiagnosis {
	public static void main(String[] args) {
	System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
	System.out.println("First step: reboot your computer");
	System.out.println("Are you able to connect with the internet? (yes or no)");
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	String user = myObj.nextLine();  // Read user input
	if(user.equals("yes")) {
		System.out.println("Rebooting your computer seemed to work");
		
	}
	else
	{
	System.out.println("Second step: reboot your computer");
	System.out.println("Are you able to connect with the internet? (yes or no)");
    user = myObj.nextLine();  // Read user input
	if(user.equals("yes")) {
		System.out.println("Rebooting your computer seemed to work");
			
	}
	else {
		
	System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
	System.out.println("Are you able to connect with the internet? (yes or no)");

    user = myObj.nextLine();  // Read user input
	if(user.equals("yes")) {
		System.out.println("Checking the router's cables seemed to work");
			
	}
	
	else {
	System.out.println("Fourth step: move your computer closer to your router");
	System.out.println("Are you able to connect with the internet? (yes or no)");

    user = myObj.nextLine();  // Read user input
	if(user.equals("yes")) {
	System.out.println("Rebooting your computer seemed to work");
				
	}
	else {
	System.out.println("Fifth step: contact your ISP");
	System.out.println("Make sure your ISP is hooked up to your router.");
	}
	}

}
}}}

