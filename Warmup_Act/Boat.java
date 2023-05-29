package Warmup_Act;

public class Boat extends Vehicle {
	
	@Override
	void run() {
		System.out.println("The Boat is floating");
		
		}

	void sail() {
		System.out.println("Mainsail: Blue Ocean");
		
	}
	
	@Override
	void speed() {
		System.out.println("Speed: 18");
		
	}
	
	@Override
	void color() {
		System.out.println("Color: White");
		
	}
	
	@Override
	void price() {
		System.out.println("Price: ₱450,000.00");
		
	}

	void model() {
		System.out.println("Fandango Yacht");
		

	}
}



