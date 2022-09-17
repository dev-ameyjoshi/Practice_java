package newcompany;

class Employee{
 int salary;
 String name;


 public int getSalary(){
     return salary;
    }

    public String getName(){
     return name;

    }
    public void setName(String n){
      name = n;

    }
}

class Square{
    int side;
   public int area(){
       return side*side;
   }
   public int perimeter(){
       return side*4;
   }


}

class Tommy{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void Firing(){
        System.out.println("Firing");
    }
}

class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling...");
    }
}
//String with no value gives null as result when printed on terminal.

public class cwh_39_ch8ps {
    public static void main(String[] args) {

        //Problem 1
        Employee amey = new Employee();
        amey.setName("Amey");
        amey.salary = 23333;
        System.out.println(amey.getName());
        System.out.println(amey.getSalary());

        //Problem 2
        CellPhone Nokia = new CellPhone();
        Nokia.callFriend();
        Nokia.vibrating();
        Nokia.ringing();

//          Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
//        Problem 4
        Tommy player1 = new Tommy(); // every class needs object initiation with new name.
        player1.hit();
        player1.run();
        player1.Firing();


    }
}
