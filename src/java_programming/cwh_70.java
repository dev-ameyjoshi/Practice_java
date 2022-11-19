package java_programming;

//Multi-threading using thread class.
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(true){
            System.out.println("My thread is running");
            System.out.println(" I am happy");
            //i++;
        }
    }
    public static int speedDown(int a){
        return --a;
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(true){
            System.out.println("My thread2 for chatting with her");
            System.out.println(" I am sad");
           // i++;
        }
    }
    public static int speedUp(int a){
        return ++a;

    }
}
public class cwh_70 {
static int a = 0;
    public static void main(String[] args) {
           MyThread1 t1 = new MyThread1();
           MyThread2 t2 = new MyThread2();
//           t1.start();
//           t2.start();
        System.out.println(t2.speedUp(a));
        System.out.println(t1.speedDown(a));


    }
}
// extra resource : https://doc  s.oracle.com/javase/7/docs/api/java/lang/Thread.html
