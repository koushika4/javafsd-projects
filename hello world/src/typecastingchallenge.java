
public class typecastingchallenge {

	public static void main(String[] args) {
		
		String input = "12";
		
		//convert the string input above into appropriate primitive type
		
		byte mybyte = Byte.parseByte(input);
		System.out.println("Byte val = " + mybyte);
		
		int myint = Integer.parseInt(input);
		System.out.println("Integer val = " + myint);
		
	}
}
