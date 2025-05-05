package Practical05;

interface vechile{
    void start();
    void stop();
}

class car implements vechile{
    @Override
    public void start(){
        System.out.println("Car is Starting....");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopping...");
    }
}
public class practical05 {
    public static void main(String[] args) {
        vechile mycar = new car();
        mycar.start();
        mycar.stop();
    }
}
