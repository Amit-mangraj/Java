package Polymorphism;

public class Bike extends AnyVehicle{

public int kilomiter;
public int fu;
@Override	
public void move() {
	System.out.println("Bike can move too!");
}
@Override
public double milage(int km,int fuel) {
	System.out.print("Milage of Bike is ");
	return km/fuel;
}
}
