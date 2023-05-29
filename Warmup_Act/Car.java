package Warmup_Act;

public class Car extends Vehicle{
	
	@Override
	void run() {
	System.out.println("The Car is driving");
	
	}

	void tiretype() {
	System.out.println("Tires: All Season");
	
	}

	@Override
	void speed() {
	System.out.println("Speed: 120");
	
	}

	@Override
	void color() {
	System.out.println("Color: Red");
	
	}

	@Override
	void price() {
	System.out.println("Price: ₱705,000.00");
	
	}

	void model() {
	System.out.println("Toyota VIOS");
	

	}
}


