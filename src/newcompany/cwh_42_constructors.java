package newcompany;


import java.lang.invoke.MutableCallSite;

class MyMainEmployee{
    private int id;
    private  String name;
    private int salary;


    public MyMainEmployee(){
        name = "Amey";
        id = 20;
        //has no return value and no need to explicitly call it.
    }
    public MyMainEmployee(String MyName ,int myId){
        name = MyName;
        id = myId;

    }
    public MyMainEmployee(String MyName ,int myId,int money ){
        name = MyName;
        id = myId;
        salary = money;
    }

    public String getName(){

        return name;

    }
    public void setName(String n){

        this.name = n;


    }
    public void setId(int  i){

        this.id=i;


    }
    public int getId(){

        return id;

    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int m){
        this.salary = m;
    }


}
public class cwh_42_constructors {
    public static void main(String[] args) {
//          MyMainEmployee amey = new MyMainEmployee("Amey",21);
            MyMainEmployee amey = new MyMainEmployee("Amey",21,200000); // "Amey",21

            // amey.setName("Amey Joshi");
            //amey.setId(234);

            System.out.println("My name is : " +amey.getName());
            System.out.println("My id  is : " +amey.getId());
            System.out.println("My Salary is : " + amey.getSalary());


            //Construcutors comes into play when we dont want to always
            // keep using these getters and setters to  get the values.
            // Method Overloading can be possible with constructors as well.
            //With No arguments in the mymainemployee object creation
            // , paramter in the other overloading class is passed.

    }
}
