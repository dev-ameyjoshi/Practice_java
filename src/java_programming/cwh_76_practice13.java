package java_programming;

class Practice13 extends Thread{
    public void run(){
        int i = 0;
        while(i<=10){
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Practice13b extends Thread{
    public void run(){
        int b = 0;
        while(b<=10){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            b++;
        }
    }
}
public class cwh_76_practice13 {
    public static void main(String[] args) {
        //UseFull Links :
        /*
        1)https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html#:~:text=sleep,-public%20static%20void&text=nanos)%20throws%20InterruptedException-,Causes%20the%20currently%20executing%20thread%20to%20sleep%20(temporarily%20cease%20execution,lose%20ownership%20of%20any%20monitors.




         */


        Practice13 p = new Practice13();
        Practice13b p1 = new Practice13b();
        p1.setPriority(6);
        p.setPriority(9);

        p.start();
        p1.start();

        System.out.println(p.getPriority());
        System.out.println(p1.getPriority());

//        p1.setPriority(Thread.MAX_PRIORITY);
//        p.setPriority(Thread.NORM_PRIORITY);

        System.out.println(p.getState());
        System.out.println(p1.getState());
        System.out.println(Thread.currentThread().getState());



    }
}
