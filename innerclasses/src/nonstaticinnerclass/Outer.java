package nonstaticinnerclass;

public class Outer {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();
		
		Outer.Inner inner = outer.new Inner();
		inner.f2();
	}

}
