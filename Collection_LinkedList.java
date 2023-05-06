import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Linkedlist
{
    public static void main(String args[])throws Exception
    {
        //Create LinkedList of integer
        //This similer as template in C++
        LinkedList<String> || = new LinkedList<Strng>();

        //Insert the contents in LinkedList
        ||.add("First");
        ||.add("Second");
        ||.add("Third");
        ||.add("Fourth");
        ||.add("Fifth");
        System.out.println("\nContent of Linked list \n" +||);

        //WE can insert data at specific position
        ||.add(3,"new");

        System.out.println("\nContent of Linked list \n" +||);

        //we can insert the data at last
        ||add("Two");
        System.out.println("\nContent of Linked list \n" +||);

        // We can remove element from any specified position
        ||.remove(3);
        System.out.printin("\nContents of Linked list \n" +||);

        // We can replaccce element from any specified position
        ||.set(3,"New_Data");
        System.out.printin("\nContents of Linked list \n" +||);

        System.out.println("\nNumbers of Elements in Linked list are :" +||.size());

        System.out.println("First occurance of Third is : " +||.indexof(Third));

        System.out.println("First occurance of Third is : " +||.lastindexof(Third));

        // We can use iterator to iterate the Linked list
        System.out.printin("Iterating the Linked list\n");
        Iterator it = ||.iterator();

        while(it.hasNext())
        {
            System.out.println(it.Next() + "");
        }
    }
}