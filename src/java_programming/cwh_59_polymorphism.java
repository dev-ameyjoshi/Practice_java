package java_programming;


interface MyCamera2{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    } // cant use the private method here unless called in a default method.
    default void record4kVideo(){
        greet(); // private method can be called here.
        System.out.println("recording 4k vid");
    }
    //preference will be given to the one written in the class.


}

interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling Number!" + phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting...");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking Snap");
    }
    //    public void record4kVideo(){
//        System.out.println("recording 4k vid...");
//    }//Preference will be given to the one in this class as it is overriding the other method.
    public String[] getNetworks(){
        System.out.println("Getting List Of Networks...");
        String[] networksList = {"Harry", "Prashanth", "Anjali5g"};
        return networksList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }
    public void SampleMeth(){
        System.out.println("meth");
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();//This is a smartphone but please use it as a camera.
        //cam1.getNetworks(); --> Not allowed
        //cam1.SampleMeth();--> is again wrong.
        cam1.record4kVideo();
        MySmartPhone2 s = new MySmartPhone2();
        s.SampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(9899);

    }
}
