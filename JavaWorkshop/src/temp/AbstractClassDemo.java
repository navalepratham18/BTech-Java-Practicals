// Abstract class  can have abstract as well as non abstract method
// Abstract methods are once which doesn't have implementation and ends with ;
// Even a single method is abstract, the class has to be declared abstract
// We can not create instance of abstract class
// Abstract class can have constructors
// There should be concrete subclass which extends abstract class to override abstract methods to provide implementation
// We can only create the instance of concrete subclass, even a single abstract method is not provide with implementation then this subclass also to be said as abstract class



abstract class AbstractClass {
	public abstract void show();
	
	int add(int x, int y) {
		return x + y;
	}
	
	public abstract void display();
}

abstract class  subclass extends AbstractClass{
	public void show() {
		System.out.println("In show method");
	}
	
	void m1() {
		System.out.println("In M1");
	}
}

class subclass2 extends subclass{
	public void display() {
		System.out.println("in display");
	}
}


public class AbstractClassDemo {
	public static void main(String[] args) {
		subclass2 s = new subclass2();
		
		s.show();
		s.m1();
		System.out.println(s.add(2, 3));
		s.display();
	}
	
}
