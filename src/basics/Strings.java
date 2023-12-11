package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Advanced";
		bookTitle = "Advanced Concept in Bodybuilding";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		// (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Horton";
		String SIN = "98432658";
		
		System.out.println("There are " + SIN.length() + " digits in your SIN.");
		
		//Print the initials plus last 4 digits of SIN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.print(SIN.substring(5));



	}

}
