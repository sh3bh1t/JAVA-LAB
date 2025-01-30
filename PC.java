import java.util.LinkedList;

class PC {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int MAX_SIZE = 10;

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == MAX_SIZE) {
            System.out.println("Buffer is full. Producer waiting...");
            wait();  // Buffer is full, producer waits
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notify();  // Notify consumer that there's data in the buffer
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer waiting...");
            wait();  // Buffer is empty, consumer waits
        }
        int value = buffer.removeFirst();
        System.out.println("Consumed: " + value);
        notify();  // Notify producer that there's space in the buffer
        return value;
    }

    public static void main(String[] args) {
        PC pc = new PC();
        
        // Producer thread
        new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    pc.produce(i);
                    Thread.sleep(100);  // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        
        // Consumer thread
        new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    pc.consume();
                    Thread.sleep(150);  // Simulate time taken to consume
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
