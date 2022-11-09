package Ds_algo;
import java.util.*;
import java.lang.*;
import java.util.Collections;


//problem 2
//enum Languages
//{
//    Python(10-10+10*10),Java(9+9*9-9),Angular(12*12-12-12);
//    private int coders;
//    Languages(int p)
//    {
//        coders = p;
//    }
//    int getCoders(){
//        return coders;
//    }
//}






public class MyString {
    public MyString(String val){
        this.val = val;


    }

    private String val;
    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<String,Integer>();
        String str1 = new String("Java OOPs!");
        String str2 = new String("Java OOPs");
        map1.put(str1,new Integer(10));
        map1.put(str2,new Integer(20));
        Map<MyString,Integer> map2= new HashMap<MyString,Integer>();
        MyString str3 = new MyString(str1);
        MyString str4 = new MyString(str2);
        map2.put(str3,new Integer(10));
        map2.put(str4,new Integer(20));
        System.out.println(map2.get(str2));//would have given the mapped value 10 had it been str3 and not str2.
        System.out.println(map2.get(str4));

        //Problem 1
//        hacker_earth obj = new hacker_earth();
//        obj.start();
        //Problem 2
// Languages ap;
// for(Languages a : Languages.values()){
//     System.out.println(a + " " + a.getCoders() +" coders." );
// }

























    }
    //Problem 1
//    private void start()
//    {
//        System.out.println(check("12345"));
//        System.out.println(check("123456"));
//        System.out.println(check(null));
//
//    }
//    private boolean check(String aString)
//    {
//        try{
//            return aString.length() > 5;
//
//        }
//        catch (NullPointerException e)
//        {
//            System.out.println("An Exception has occured!");
//            return false;
//
//        }
//    }


}
