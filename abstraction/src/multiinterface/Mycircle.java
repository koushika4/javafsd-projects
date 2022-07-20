package multiinterface;

public class Mycircle implements circle, circleTwo{

	@Override
	public void calculateArea() {
		System.out.println(circleTwo.pi);
	}

	@Override
	public void calculateArea(int radius) {
				
	}

}