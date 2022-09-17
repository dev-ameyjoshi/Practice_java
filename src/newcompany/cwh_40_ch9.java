package newcompany;


class  myEmployee{
    private int id;
    private  String name;

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
}
public class cwh_40_ch9 {
    public static void main(String[] args) {

        myEmployee Amey = new myEmployee();
//        Amey.id = 45;
//        Amey.name = "CodeWithHarry"; --> Throws an error due to private access modifier.
        Amey.setName("Amey Joshi");
        System.out.println(Amey.getName());;
        Amey.setId(234);
        System.out.println(Amey.getId());;

    }
}
