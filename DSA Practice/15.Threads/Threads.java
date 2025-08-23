class A extends Thread{
    public void run(){
        for(int i = 1;i<=100;i++){
            System.out.println("Hii....");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1;i<=100;i++){
            System.out.println("Bharathi!");
             try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class Threads{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
         System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}