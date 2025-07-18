
import java.util.Scanner;
public class StudentClass {
    // creating a new data type
    // public static class Student {
    //     String name;
    //     int rno;
    //     double percent;
    // }
    // public static void func(Student x){
    //     System.out.println(x.name);
    //     return;
    // }
    // public static void change(Student s){
    //     s.name ="Rohan";
    //     return;
    // }
    public static void main(String[] args) {
        //dabba banaya with 3 diff dtypes
        // Student s1=new Student(); //declaration
        Student s1 = new Student("Raghav", 72, 92.1); //Constructor

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        System.out.println(s1.numberOfStudents);
        // System.out.println(s1.name);  //default values
        // System.out.println(s1.percent);//default values

        // s1.name ="guchu puchu";
        // s1.rno = 76;
        // s1.percent = 92.5;
        // System.out.println(s1.name);
        // s1.name="Raghav";
        // System.out.println(s1.name);
        //change(s1);
        // System.out.println(s1.name);
        //naya dabba banaya
        // Student s2=new Student();
        Student s2 = new Student("Rahul", 89, 94.32); 
        System.out.println(s2.schoolName);
        System.out.println(s2.numberOfStudents); // static variable is shared by all objects of the class
        //static methods cannot call non-static methods or variables
        // s2.name ="Akshat";
        // s2.percent=89.45;
        // s2.rno=56;5
        //both s1 and s2 are objects of same class

        // func(s1);
        // int x=5;
        // System.out.println(x);
        // change(x);
        // System.out.println(x);
        // s1.setRno(56);
        // System.out.println(s1.getRno());

    }
    
}
