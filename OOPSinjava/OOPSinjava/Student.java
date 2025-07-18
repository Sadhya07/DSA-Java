public class Student {
    String name;
    //private int rno; -shows error-cannot be accesssed outside of class
    int rno;
    double percent;
    int age;
    final String schoolName = "BBPS"; //final- cannot change variable even with getter, setter func
    static int numberOfStudents;

    public Student(){
        //default /empty constructor
    }

    public Student(String naam, int roll, double per){//parameterized constructor
        // name= naam;
        // rno = roll;
        // percent = per;
        this.name = name; //this used in case of same variable name in constructor and class
        this.rno = rno;
        this.percent = percent;
        numberOfStudents++;
    }
    public int getRno(){  //getter
        return rno;
    }
    public void setRno(int roll){  //setter
        rno= roll;
    }
}
