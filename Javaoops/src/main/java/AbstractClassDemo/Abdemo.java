package AbstractClassDemo;

//We cannot create an object of an abstract class in Java because it is an incomplete class that contains abstract methods
//without any implementation. Therefore, it cannot be instantiated directly.
//it must be inherited to other class

//below example show why we need contructor inside abstract class 
public abstract class Abdemo {
 int i;
 int j;

 public Abdemo(int i, int j) {
	this.i = i;
	this.j = j;
}
 
//when we dont add constructor to this abstract class then we have to initialize the varaible every time at the time of object creation 
 
}
