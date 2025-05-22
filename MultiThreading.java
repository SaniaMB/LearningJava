public class MultiThreading {
    public static void main(String[] args) {

        // MultiThreading = Enable a program to run multiple threads concurrently
//                            (Thread = A set of instructions that run independently)
//                            Useful for background tasks or time-consuming operations

        // MyRunnable2 myRunnable2 = new MyRunnable2();
         Thread thread1 = new Thread(new MyRunnable2("Ping"));
         Thread thread2 = new Thread(new MyRunnable2("Pong"));

        System.out.println("Game Start!");

         thread1.start();
         thread2.start();

         try {
             thread1.join();
             thread2.join();
         }
         catch (InterruptedException e){
             System.out.println("Main thread was interrupted!");
         }

        System.out.println("Game Over!");

    }
}
