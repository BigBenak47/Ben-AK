import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		Movie movie = new Movie();
		String user = "yes";
		int rating;
		while(user.equals("yes")) {
		System.out.println("Enter the title of a movie ");
		user = myObj.nextLine();  // Read user input
		movie.setTitle(user);
		System.out.println("Enter the movie’s rating ");
		user = myObj.nextLine();  // Read user input
		movie.setRating(user);
		System.out.println("enter the number of tickets sold");
		rating= myObj.nextInt();  // Read user input
		myObj.nextLine();
		movie.setSoldTickets(rating);
		System.out.println(movie.toString());
		System.out.println("Do you want to enter another? (yes or no)");
		user = myObj.nextLine();  // Read user input
		while (!(user.equals("yes")) && !(user.equals("no"))) 
		{
			System.out.print("input was invalid, try again");
			user = myObj.nextLine();  // Read user input
		}
		}
		System.out.println("Goodbye ");
		
		

	}

}
