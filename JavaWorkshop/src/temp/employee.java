package temp;

import java.util.Scanner;

public class employee {
	int empID; 
	String name;
	
//	int empID = 101; 
//	String name = "NooBEngineer";
	
	employee(){
		empID = 101;
		name = "NooBEngineer";
	}
	
	employee(int empID, String name){
		this.empID = empID;
		this.name = name;
	}
	
	public void assignMethod01(){
		empID = 101;
		name = "NooBEngineer";
	}
	
	public void assignMethod02(int eid, String ename){
		empID = eid;
		name = ename;
	}
	
	public static void main(String[] args) {
		
		//default Constructor
		employee emp1 = new employee();
		
		// parameterized constructor
		employee emp2 = new employee(102, "iiiaamnooob");
		
		// assignMethod02
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Emp03 ID :");
		int eid = sc.nextInt();
		System.out.print("Enter Emp3 Name : ");
		String ename = sc.next();
		
		employee emp3 = new employee();
		emp3.assignMethod02(eid, ename);
		
		System.out.println();
		System.out.println(emp1.empID+ "    "+ emp1.name);
		System.out.println(emp2.empID+ "    "+ emp2.name);
		System.out.println(emp3.empID+ "    "+ emp3.name);
	}

}
