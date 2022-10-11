package java_programming;


interface MyCamera{
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

interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling Number!" + phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting...");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
}
public class cwh_57_default {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        //ms.greet(); will throw an error.
         String[] ar = ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
            //10:15 vid Java Interfaces and Default Methods
        }
    }
}
