package ExceptionHandlingDemo;

public class ExceptionHandDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//class loader loadClass Method will not able to load the class Test as it is not present in classPath
         Class.forName("Test");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Class Not Found");
			//throwable class printStackrace for displaying exception in the console
			//e.printStackTrace();
		}
	}

}
