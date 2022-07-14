
public class ternary {
	
	public static void main(String[] args) {
		
		int age = 19;
		boolean hasLicense = true;
		
		boolean canDrive = (age > 18) ? true : false;
		
		boolean canRentACar = canDrive ? (hasLicense ? true : false) : false;
		
		System.out.println("Age = " + age);
		System.out.println("Has License = " + hasLicense);
		System.out.println("Can Drive ? " + canDrive);
		System.out.println("Can Rent a car ? " + canRentACar);
		
		//
		
		System.out.println("");
		
		String result = canDrive ? (hasLicense ? "Has License Can Drive" : "No License can't drive") : "cannot drive";
		
		System.out.println(result);
	}
}
