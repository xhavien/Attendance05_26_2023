package Warmup_Act;

public class Main {
	
	public static void main(String[] args)  {
		
		
		Vehicle vehicle = new Vehicle();
		
		
		Car car = new Car();
		
		
		Plane plane = new Plane();
		
		
		Boat boat = new Boat();
		
		
		vehicle.run();
		System.out.println("The vehicle has stopped");
		System.out.println("");
		
		car.model();
		car.run();
		car.tiretype();
		car.color();
		car.speed();
		car.price();
		vehicle.stop();
		
		
		plane.model();
		plane.run();
		plane.wingspan();
		plane.color();
		plane.speed();
		plane.price();
		vehicle.stop();
		
		
		boat.model();
		boat.run();
		boat.sail();
		boat.color();
		boat.speed();
		boat.price();
		vehicle.stop();
		
		
	}

}
