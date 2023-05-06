import java.lang.*;
import java.io.*;
import java.util.*;

class Student
{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
    public class TestCollection3
{
    
    public static void main(String args[])throws Exception
    {
        //Creating user-defined class object
        Student s1 = new Student(101,"A".23);
        Student s2 = new Student(102,"B".21);
        Student s3 = new Student(103,"C".25);

        ArrayList<Student> al new ArrayList<Student>();  //Creating ArrayLIst
        al.add(s1);     //adding student class object
        al.add(s2);
        al.add(s3);

        Iterator itr = al.Iterator();
        //traversing elements of ArrayList object
        
        while(itr.hasNext())
        {
            Student st = (Student)itr.next();
            if(st.age >= 20)
            {
                System.out.println(st.rollno+""+st.name+"+st.age");
            }
        }
    }
}