package AbstractClassDemo;

public class Abdemo1 extends Abdemo  {
	int k;
	int l;
	public Abdemo1(int i, int j,int k, int l) {
		//The super keyword refers to superclass (parent) objects. It is used to call 
		//superclass methods, and to access the superclass constructor. 
		super(i,j);
		this.k = k;
		this.l = l;
	}
	

}
