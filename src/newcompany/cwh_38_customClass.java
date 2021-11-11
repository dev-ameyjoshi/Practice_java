package newcompany;



 class Employee1{
int id ;
int salary;
String name;

public void printDetails(){

            System.out.println("My id is " + id);
            System.out.println("My name is "+ name);

            }

            public int getSalary(){
            return salary;
            }
}


public class cwh_38_customClass {
    public static void main(String[] args) {
               Employee1 amey = new Employee1(); // Instantiating a new object

              //        Setting properties for amey


                          amey.id = 12;
                          amey.name = " Amey";
                          amey.salary = 99;
                          int salary = amey.getSalary();

                //        System.out.println(amey.id);
                //        System.out.println(amey.name);

                        amey.printDetails();
                        System.out.println(salary);

    }
}
