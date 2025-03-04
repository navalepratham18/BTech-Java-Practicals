class parent{
    void example1(){
        System.out.println("I am the Parent");
    }
}

public class singleInheritance extends parent {
    public static void main(String[] args) {
        parent p = new parent();
        p.example1();
    }
}
