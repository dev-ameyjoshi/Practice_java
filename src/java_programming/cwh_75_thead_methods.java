package java_programming;

//usefull links: https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html

class MyNewThr1 extends Thread{

    public void run(){
//         int i = 0;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you" );
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            i++;
        }
    }
}
class MyNewThr2 extends Thread{

    public void run(){

        int limit = 0;
        while(limit<1000){
//            System.out.println("I am a thread");
            System.out.println("My Thank you!" );
            limit++;
        }
    }
}

public class cwh_75_thead_methods {
    public static void main(String[] args) {
         MyNewThr1 t1 = new MyNewThr1();
         MyNewThr2 t2 = new MyNewThr2();
         t1.start();
//         try{
//             t1.join();
//         }catch (Exception e){
//             System.out.println(e);
//         }
         t2.start();
         //setdaemon thread
        //deprecated means do not use that method.
        //join and sleep method requires to be enclosed within try and catch block.
        //print stack trace method.

    }
}
