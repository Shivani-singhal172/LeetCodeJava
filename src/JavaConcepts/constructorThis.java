package JavaConcepts;

public class constructorThis {
	
	String name;
	int age ;
	
	public constructorThis(String name) {
		
		System.out.println("Called constructor");
		System.out.println("The name is "+name);
	}
	 
	
	
	public static void main(String [] args) {
		
		constructorThis classob = new constructorThis("shivani");
		
		constructorThis classobj2 = new constructorThis("shobhit");
		
	}

}
