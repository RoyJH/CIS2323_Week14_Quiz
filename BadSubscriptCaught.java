import java.util.*;
public class BadSubscriptCaught{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args){
		int name=0;
		String names[] = {"Billy","Richard","Timothy","Meagan","Jessica","Amanda","Nathan","Wendy"};
		
		System.out.print("Enter a number between 0 and 7: ");
		try {
			name = userInput.nextInt();
			System.out.println("The name located in position " + name + " is " + names[name].toString() + ".");
			return;
			}
			catch (ArrayIndexOutOfBoundsException exception){
					System.out.println("That number isn't valid!");
			}
		
	}
}