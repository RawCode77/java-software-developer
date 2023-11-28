package basics;

public class OptimalRepRange {
	public static void main(String[] args) {

		// This program will give suggestions of what to rep range is best based on the your goal 
		//(workout goals could be size(8-10 reps), cutting(12-15 reps) or strength(1-5 reps) )

		int repRange = 0;
		
		
		if (repRange >= 12) {
			System.out.println("This 12-20 rep range is mostly used when cutting and shaping as well as  "
					+ "\n" +"help your muscle increase it's tolerance to exercise and build a "
					+ "\n" +"good foundation for you to expose it to heavier loads without risking injury. ");
		}
		else if ((repRange <= 10) && (repRange >= 8)) {
			System.out.println("If you're training for muscle size, choose a weight"
					+ "\n" +"at which you reach muscle failure in the 8-12-rep range."); 
			
		}
		else if ((repRange >= 1) && (repRange <= 5)) {
			System.out.println("Your within the 1-5 Reps if you are"
					+ "\n" +" looking specifically for strength gains.");
		}
		
		else if ((repRange == 7) || (repRange == 11) ) {
			System.out.println("You should consider doing 8-10 .");
			
		}	
		else {
			System.out.println("Your not workin hard enough!");
		}

	
	}
}
