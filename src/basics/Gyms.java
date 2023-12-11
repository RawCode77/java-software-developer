package basics;

public class Gyms {

	public static void main(String[] args) {
		// Declare and define an array implicitly
		String[] gyms = {"Golds Gym", "World Gym", "Strata Gym", "Power Flex", "Le Gym"};
		System.out.println(gyms[0]);
		System.out.println(gyms[1]);
		System.out.println(gyms[2]);
		System.out.println(gyms[3]);
		System.out.println(gyms[4]);
		
		
		
		//Declare array
		String[] bodybuilders;
		
		// Define the array
		bodybuilders = new String[3];
		bodybuilders[0] = "Lee Haney";
		bodybuilders[1] = "Flex Wheeler";
		bodybuilders[2] = "Markus Ruhl";
		System.out.println(bodybuilders[2]);
		
		
		// Declare the array explicitly
		String[] gymLocation = new String[5];
		gymLocation[0] = "West Island";
		gymLocation[1] = "Brossard";
		gymLocation[2] = "Little-Burgundy";
		gymLocation[3] = "St.Laurent";
		gymLocation[4] = "Centre-Ville";
		int i = 0;
			
		//Do Loop: enters the loop THEN  test condition
		do {
			System.out.println("The Gym Location is : " + gymLocation[i]);
			i = i + 1;
		} while (i < 5);
			
		//While Loop: tests condition first then enters loop
		int n = 0;
		boolean gymFound = false;
		while (!gymFound) {
			String location = gymLocation[n];
			System.out.println(location);
			if (location == "St.Laurent") {
				System.out.println("LOCATION FOUND!");
				gymFound = true;
			}
			n++;
		}
		
		System.out.println("\nPRINTING WITH FOR LOOP");
		//For Loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(gymLocation[x]);
		}
			

	}

}
