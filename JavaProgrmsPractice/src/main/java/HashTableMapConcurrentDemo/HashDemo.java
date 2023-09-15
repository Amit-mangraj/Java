package HashTableMapConcurrentDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;


public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer, String>  hashtable = new Hashtable<>();
HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
ConcurrentHashMap<Integer, String> concurrent = new ConcurrentHashMap<>();

Runnable r = ()->{
	for(int i=0;i<10;i++) {
		int key = i;
		String Value = "Value-" + i;
		hashtable.put(key, Value);
		hashmap.put(key, Value);
		concurrent.put(key, Value);
	}
	
};

Thread t1= new Thread(r);
Thread t2 = new Thread(r);

t1.start();
t2.start();

try {
	t1.join();
	t2.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.print("HashTable Values: ");
for(int i=0;i<hashtable.size();i++) {
	System.out.print(" ");
	System.out.print(i+hashtable.get(i));
}
System.out.println();

System.out.print("HashMap Values: ");
for(int i=0;i<hashmap.size();i++) {
	System.out.print(" ");
	System.out.print(i+hashmap.get(i));
}

System.out.println();

System.out.print("concurrentHashmap Values: ");
for(int i=0;i<concurrent.size();i++) {
	System.out.print(" ");
	System.out.print(i+concurrent.get(i));
}
System.out.println();
// Printing the sizes of the maps to demonstrate thread safety
System.out.println("Hashtable size: " + hashtable.size()); // Should be 1000
System.out.println("HashMap size: " + hashmap.size());       // Should be around 2000
System.out.println("ConcurrentHashMap size: " + concurrent.size()); // Should be 1000	

	}

	

}
