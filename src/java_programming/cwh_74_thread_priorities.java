package java_programming;


class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you!" + this.getName());
        }
    }
}
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        //JVM behaviour -it maintains Ready queue
        //usefull link : https://docs.oracle.com/javase/7/docs/technotes/guides/vm/thread-priorities.html
        //java.lang.Thread.MIN_PRIORITY  = 1
        //java.lang.Thread.NORM_PRIORITY = 5
        //java.lang.Thread.MAX_PRIORITY  = 10
        //execution is also highly dependent on the OS.hence the execution of each thread will vary a bit accordingly.
         MyThr1 t1 = new MyThr1("Amey");
         MyThr1 t2 = new MyThr1("Jacob");
         MyThr1 t3 = new MyThr1("Hailey");
         MyThr1 t4 = new MyThr1("Ranveer");
         MyThr1 t5 = new MyThr1("Samuel(Most important!)" );
         t5.setPriority(Thread.MIN_PRIORITY);
         t4.setPriority(Thread.MIN_PRIORITY);
         t3.setPriority(Thread.MIN_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
         t1.setPriority(Thread.MIN_PRIORITY);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
    }
}
