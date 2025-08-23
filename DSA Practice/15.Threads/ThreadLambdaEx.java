/*class A implements Runnable{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("Hii....");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("Bharathi!");
             try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}
*/

class ThreadLambdaEx{
    public static void main(String[] args){

        Runnable obj1 = ()->{
            
                for(int i = 1;i<=5;i++){
                System.out.println("Hii....");
            
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
           
                }
            
        };
       
       Runnable obj2 = () -> {
           
                for(int i = 1;i<=5;i++){
                System.out.println("Bharathi!");
            
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
           
                }
            
        };
 
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}