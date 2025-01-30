
import java.util.LinkedList;

class pc{
    private LinkedList<Integer> buffer= new LinkedList<>();
    private int max_size=10;
    
    public synchronized void producer(int value) throws InterruptedException{
        if(buffer.size()==max_size){
            wait();
        }
        buffer.add(value);
        System.out.println("produced " + value);
    }

    public synchronized int consumer() throws InterruptedException{
        if(buffer.isEmpty()){
            wait();
        }
        int value= buffer.removeFirst();
        System.out.println("consumed " + value);
        return value;
    }
}

class prog71{
    public static void main(String[] args) {
        pc pc = new pc();

        new Thread(()->{
            try {
                for(int i=1;i<=10;i++){
                    pc.producer(i);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                for(int i=1;i<=10;i++){
                    pc.consumer();
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}