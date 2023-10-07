import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        while (true) {
            String firstName;
            String lastName;
            String fullName;
            
            try {
                System.out.println("Enter Student's first name: ");
                firstName = myObj.nextLine();
                System.out.println("Enter Student's last name: ");
                lastName = myObj.nextLine();
                fullName = firstName + " " + lastName;
            } catch (Exception e) {
                System.out.println("Please enter letters for your Name!");
                continue; // Skip the rest of the loop and start over
            }

            System.out.println("Enter Student's grade: ");
            double grade = myObj.nextDouble();

            if (grade >= 90) {
                System.out.println("Great job " + fullName + " got an A!");
            } else if (grade >= 80) {
                System.out.println(fullName + " got a B!");
            } else if (grade >= 70) {
                System.out.println(fullName + " got a C!");
            } else if (grade >= 60) {
                System.out.println(fullName + " needs to study more!");
            } else {
                System.out.println(fullName + " failed the class and needs to retake the class!");
            }

            System.out.println("Do you want to enter another student's information? (yes/no): ");
            String response = myObj.next();

            if (response.equalsIgnoreCase("no")) {
                System.out.print("Thank you! Have a great day!");
                break;
            }

            myObj.nextLine(); // Consume the newline character left in the buffer
        }

        myObj.close();
    }
}

