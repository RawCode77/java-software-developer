package basics;

public class SelectBodyPart {

	public static void main(String[] args) {
		// Execute different block of code based on the value of a condition
		
		String bodyPart = "Chest";
		
		switch (bodyPart) {
		case "Back" : 
			System.out.println("This is for outer, inner and lower back");
			break;
		case "Chest" : 
			System.out.println("This is for upper, lower and middle chest");
			break;
		case "Legs" : 
			System.out.println("This is for quadricepss, hamstring and calves");
			break;
		case "Arms" : 
			System.out.println("This is for biceps, triceps and forearms");
			break;
		case "Shoulders" : 
			System.out.println("This is for front, side and rear deltoids");
			break;
		
			
		}

	}

}
