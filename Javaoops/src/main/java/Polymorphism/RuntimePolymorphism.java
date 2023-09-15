package Polymorphism;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent class object with parent class constructor
     AnyVehicle vehicleObj = new AnyVehicle();
    System.out.println(vehicleObj.milage(100, 6));
     
    //parent class object with child class constructor
     AnyVehicle AnyVehiclebikeObj = new Bike();
    System.out.println(AnyVehiclebikeObj.milage(80, 7));
    
    //child clss object with child class constructor 
     Bike bikeObj = new Bike();
     System.out.println(bikeObj.milage(40, 3));
     
    // Bike bikeObj2 = new AnyVehicle(); we can not create child class object with parent class constructor
     
	}

}
