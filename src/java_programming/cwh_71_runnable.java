package java_programming;

class MyThreadRunnable1 implements Runnable{

        public void run () {

            for(int i = 0;i<10;i++) {
                System.out.println("I am a thread1 and not threat");
            }
    }

    public static int speedUp(int a){
        return ++a;

    }
    }

class MyThreadRunnable2 implements Runnable{
    public void run(){
        for (int j = 0;j<10;j++) {
            System.out.println("I am a thread2 and not threat");
        }
    }
    public static int speedDown(int a){
        return --a;

    }
}


public class cwh_71_runnable {
    static int a = 69;
    public static void main(String[] args) {
        //Gun fires bullet analogy
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();

        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        //Cannot use start method directly on runnable interface.
        gun1.start();
        gun2.start();

        a = bullet1.speedUp(a);
        System.out.println(a);
         int b =a;

        System.out.println(bullet2.speedDown(b));


    }
}
