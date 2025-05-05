package Practical03;

class Empolyee{
    int id;
    String name;
    double salary;

    Empolyee(){
        id = 01;
        name = "Prathamesh";
        salary = 999999;
    }

    Empolyee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("\nId : "+id+"\nName : "+name+"\nSalary : "+salary);
    }

}

public class practical03 {
    public static void main(String[] args) {
        Empolyee e1 = new Empolyee();
        e1.display();
        Empolyee e2 = new Empolyee(02, "Qwerty", 999999);
        e2.display();
    }
}
