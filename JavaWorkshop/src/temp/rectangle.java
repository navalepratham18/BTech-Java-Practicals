package temp;

import java.util.Scanner;

public class rectangle {
	
	int len, bre;
	public rectangle() {
		int len = 0;
		int bre = 0;
	}
	
	rectangle(int len, int bre) {
		this.len= len;
		this.bre= bre;
	}
	
	public void setlen(int len) {
		this.len= len;
	}

	public int getlen() {
		return len;
	}
	
	public int getbre() {
		return bre;
	}
	
	public void setbre(int bre) {
		this.bre= bre;
	}
	
	public void calArea() {
		System.out.println("Area of Rectangle with LENGTH(" + len+ ") BREADTH("+ bre+ ") : "+ len*bre);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		rectangle r = new rectangle(2, 2);
//		r.calArea();
		
		rectangle[] arr = new rectangle[2];
		for(int i = 0; i< arr.length; i++) {
			arr[i]= new rectangle(sc.nextInt(), sc.nextInt());
		}
		
		for(int i = 0; i<2; i++) {
			arr[i].calArea();
		}
		
		
	}

}
