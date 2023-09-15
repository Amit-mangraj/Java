package ExceptionHandlingDemo;


class Demo {
	int var =8;
}

public class ExceptionHandlingDemo1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking a method or member variable from a null object
        //Accessing or modifying a null object’s field.
		Demo d = null;
		try {
			System.out.println(d.var);
			
			//this statement will not be executed 
			System.out.println("This Statement executed after exception occured");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Nullpointer Exception Caught");
			d = new Demo();
			System.out.println(d.var);
		}

	}

}
