package Polymorphism;

public class CompileTimePolymorphismDemo {
	   // 1st method with name add
	   public int add(int x, int y){ 
		   System.out.println("1 method");
	   return x+y;
	   }
	   
	   //we cannot overload a method just by changing the return type ,it will give compile time error
		/*
		 * public double add(int x, int y){ System.out.println("1 method"); return x+y;
		 * }
		 */
	   // 2nd method with name add
	   public int add(int x, int y, int z){
		   System.out.println("2method");
	   return x+y+z;
	   }
	   // 3rd method with name add
	   public int add(double x, int y){ 
		   System.out.println("3method");
	   return (int)x+y;
	   }
	   // 4th method with name add
	   public int add(int x, double y){ 
		   System.out.println("4method");
	   return x+(int)y;
	   }
	
	   public Long add(int a,Long b) {
		  System.out.println("5 method");
		   return a+b;
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphismDemo demo=new CompileTimePolymorphismDemo();
		   // In the below statement, the Compiler looks at the argument types and decides to call method 1
		   System.out.println(demo.add(3, 6));
		   // Similarly, in the below statement, the compiler calls method 2
		   System.out.println(demo.add(2,3,4));
		   // Similarly, in the below statement, the compiler calls method 4
		   System.out.println(demo.add(2,3.4));
		   // Similarly, in the below statement, the compiler calls method 3
		   System.out.println(demo.add(2.5,3)); 
		   
		   
		   System.out.println(demo.add(4,5)); 

	}

}
