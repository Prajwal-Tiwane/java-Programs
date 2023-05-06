import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Vector
{
    public static void main(String args[])throws Exception
    {
        //Create Vector of integer
        //This similer as template in C++
        //In this case vector if size 10 get created
        Vector<String> || = new Vector<Strng>();

        //we can create vector as in which size of vector is 50
        Vector<String> v1 = new Vector<Strng>(50);

        //we can create vector as in which size of vector is 50
        //when vector become full its size gets incremented by 10
        Vector<String> v2 = new Vector<Strng>(50,10);

        //Insert the contents in Vector
        ||.add("10");
        ||.add("20");
        ||.add("30");
        ||.add("40");
        ||.add("50");
        System.out.println("\nContent of Vector \n" +||);

        //WE can insert data at specific position
        ||.add(3,11);
        System.out.println("\nContent of Linked list \n" +||);

        // We can remove element from any specified position
        ||.remove(3);
        System.out.printin("\nContents of Vector \n" +||);

        // We can replaccce element from any specified position
        ||.set(3,21);
        System.out.printin("\nContents of Vector \n" +||);

        System.out.println("\nNumbers of Elements in Vector are :" +||.size());

        System.out.println("First occurance of Third is : " +||.indexof(Third));

        System.out.println("First occurance of Third is : " +||.lastindexof(Third));

        // We can use iterator to iterate the Vector
        System.out.printin("Iterating the Vector\n");
        Iterator it = ||.iterator();

        while(it.hasNext())
        {
            System.out.println(it.Next() + "");
        }

        //we can remove all elementd from arraylist

        ||.clear();
    }
}