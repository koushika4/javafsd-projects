package staticcontext;

public class staticblocktest {
	
	public static void main(String[] args) {
		System.out.println("Inside Main Method");
	}
	static {
		System.out.println("Static block 2");
		System.out.println("Create connection to system 1");
	}
	static {
		System.out.println("Static block 1");
	}
}
