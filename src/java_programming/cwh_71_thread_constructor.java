package java_programming;


class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("I am a thread");
        }
    }

}


class MyThread3 implements Runnable{


    @Override
    public void run() {
        System.out.println("The new Thread is running.....");
    }
}
public class cwh_71_thread_constructor {
    public static void main(String[] args) {
       MyThread t1 = new MyThread("Amey");
       MyThread t2 = new MyThread("Ram Chandra");

       Runnable t3 = new MyThread3();
       Thread Son = new Thread(t3,"Paneer Tikka");

       t1.start();
       t2.start();

        Son.start();

        System.out.println("The id of the thread is :" + t1.getId());
        System.out.println("The id of the thread is :" + t2.getId());
        System.out.println("The name of the thread is :" + t1.getName());
        System.out.println("The name of the thread is :" + t2.getName());

        System.out.println("The name of the new thread is :" + Son.getName());

    }
}
