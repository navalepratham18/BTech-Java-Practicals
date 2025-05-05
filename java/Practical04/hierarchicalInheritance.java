class parentClass{
    void Display(){
        System.out.println("\nI am Thonas");
    }
}

class child1 extends parentClass{
    void display2(){
        super.Display();
        System.out.println("I am Child 1");
    }
}

class child2 extends parentClass{
    void display3(){
        super.Display();
        System.out.println("I am Child 2");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        child1 ch1 = new child1();
        ch1.display2();

        child2 ch2 = new child2();
        ch2.display3();

    }
}
