// RULE FOR INTERFACE
// interfaces all abstract methods
// the method which are declared in the interfaces are public and abstract
// the variable in interfaces are public / static / final
// we can not create instance of interface 
// when a class can  implement one interface or more then one interfaces
// interface helps us to achieve multiple functionalities as a class is implementing more then one interface 
// one interface can extends another interface but an interface can't extend a class


// RULE FOR OVERRIDEING
// 1. Same name as the above method name
// 2. return type should be same
// 3. Same Parameter list
// 4. Same access modifiers.

import java.util.Scanner;

interface i1{
	public void show();
	public int add(int x, int y);
	void m1();
}

interface fact extends i1{
	public int factorial(int num);
}

abstract class subclass implements fact{
	public void show() {
		System.out.println("In Show()");
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int factorial(int num) {
		int f= 1;
		for(int i = num; i >= 1; i--) {
			f *=i;
		}
		return f;
	}
}

class subclass2 extends subclass{
	public void m1() {
		System.out.println("In M1");
	}
}



public class intrefaces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		subclass2 s = new subclass2();
		s.show();
		System.out.println(s.add(2, 2));
		s.m1();
		
		System.out.print("\nEnter the num : ");
		int num = sc.nextInt();
		System.out.println(s.factorial(5));
	}

}
