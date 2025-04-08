class SharedResource {
    private int data;
    private boolean available = false;

    // Producer Method
    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait(); // Wait if data is already produced
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // Notify consumer
    }

    // Consumer Method
    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait if no data is produced
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // Notify producer
    }
}

// Producer Class
class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
                Thread.sleep(1000); // Simulate processing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Consumer Class
class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
                Thread.sleep(1500); // Simulate processing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Main Class
public class practical07 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        consumer.start();
    }
}