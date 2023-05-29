package Warmup_Act;

public class Plane extends Vehicle{
	
	@Override
	void run() {
		System.out.println("The Plane is flying");
		
		}

	void wingspan() {
		System.out.println("Wingspan: 31m");
		
	}
	
	@Override
	void speed() {
		System.out.println("Speed: 805");
		
	}
	
	@Override
	void color() {
		System.out.println("Color: Black");
		
	}

	@Override
	void price() {
		System.out.println("Price: ₱605,000.00");
		
	}
	
	void model() {
		System.out.println("U-2 Spy Plane");
		

	}

}
