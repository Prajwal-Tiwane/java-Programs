import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Arraylist
{
    public static void main(String args[])throws Exception
    {
        //Create ArrayList of strings
        //This similer as template in C++
        ArrayList<String> || = new ArrayList<Strng>();

        //Insert the contents in ArrayList
        ||.add("First");
        ||.add("Second");
        ||.add("Third");
        ||.add("Fourth");
        ||.add("Fifth");
        System.out.println("\nContent of Array list \n" +||);

        //WE can insert data at specific position
        ||.add(3,"new");

        System.out.println("\nContent of Array list \n" +||);

        //we can insert the data at last
        ||add("Two");
        System.out.println("\nContent of Array list \n" +||);

        // We can remove element from any specified position
        ||.remove(3);
        System.out.printin("\nContents of Array list \n" +||);

        // We can replaccce element from any specified position
        ||.set(3,"New_Data");
        System.out.printin("\nContents of Array list \n" +||);

        System.out.println("\nNumbers of Elements in Array list are :" +||.size());

        System.out.println("First occurance of Third is : " +||.indexof(Third));

        System.out.println("First occurance of Third is : " +||.lastindexof(Third));

        // We can use iterator to iterate the Array list
        System.out.printin("Iterating the Array list\n");
        Iterator it = ||.iterator();

        while(it.hasNext())
        {
            System.out.println(it.Next() + "");
        }

        //we can remove all elementd from arraylist

        ||.clear();
    }
}