class parent1{
    void function1(){
        System.out.println("\nI am Parent 1");
    }
}

class subParent extends parent1{
    void function2() {
        super.function1();              // will print the inherited class's function
        System.out.println("I am Sub Parent\n");
    }
}

public class multiLevelInheritance{
    public static void main(String[] args) {
        subParent sP1 = new subParent();
        sP1.function1();
        sP1.function2();
    }
}
