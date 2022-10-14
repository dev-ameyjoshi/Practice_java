package java_programming;


abstract class Pen{
   abstract void write();
   abstract void refill();
   abstract void changeNib();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }

    void changeNib(){
        System.out.println("Changing the Nib...");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting");
    }

}


interface basicAnimal{
    void eat();
    void sleep();
}

interface smartTvRemote{
    void switchOn();
    void turnOff();
}

interface tvRemote extends smartTvRemote{
    void changeChannel();
    void changePort();
}

class tv implements tvRemote{
    public void switchOn(){
        System.out.println("Tv Turned On");
    }

    @Override
    public void changeChannel() {
        System.out.println("Switching To channel 140");
    }

    @Override
    public void changePort() {
        System.out.println("HDMI1 -> HDMI2");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Turned Of");
    }
}
class Human extends Monkey implements basicAnimal{
    public void speak(){
        System.out.println("Hello Sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

abstract class Telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("Lifting Call");
    }
    void disconnect(){
        System.out.println("Call Disconnected");
    }
}
public class cwh_60_ch11ps {
    public static void main(String[] args) {
        //Q.1 +Q.2
       FountainPen pen = new FountainPen();
       pen.changeNib();

       //Q.3

        Human amey = new Human();
        amey.sleep();

        //Q.4
        Telephone mine = new SmartTelephone();
        mine.ring();
        mine.lift();
        mine.disconnect();

        //Q.5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();

        //Q.6+Q.7
        tv modes = new tv();
        modes.switchOn();
        modes.changePort();
        modes.changeChannel();
        modes.turnOff();

    }
}
