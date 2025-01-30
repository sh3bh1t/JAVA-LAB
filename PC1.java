import java.util.LinkedList;

class PC{
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int MAX_SIZE=10;

    public synchronized void produce(int value) throws InterruptedException{
        while(buffer.size()==MAX_SIZE){
            wait();
        }
        buffer.add(value);
        System.out.println("produced " + value);
    }

    public synchronized int consume() throws InterruptedException{
        if(buffer.isEmpty()){
            wait();
        }
        int value=buffer.removeFirst();
        System.out.println("consumed " + value);
        return value;
    }
}

class PC1{
    public static void main(String[] args) {
        PC pc=new PC();

        new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    pc.produce(i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    pc.consume();
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}