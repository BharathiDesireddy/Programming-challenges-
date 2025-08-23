public class DemoThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); // sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        t1.setName("Worker-Thread");
        t1.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
