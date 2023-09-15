package Polymorphism;

public class AnyVehicle {
	public int km;
	public int fuel;
public void move() {
	System.out.println("Any Vehicle can move");
}
public double milage(int km,int fuel) {
	System.out.print("Milage of Anyvehicle is ");
	return km/fuel;
}
}
