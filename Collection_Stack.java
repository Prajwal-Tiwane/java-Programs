import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Stack
{
    public static void main(String args[])throws Exception
    {
        //Create Stack of integer
        //This similer as template in C++
        Stack<String> || = new Stack<Strng>();

        //Insert the contents in Stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //int i;

        // We can remove element from any specified position
        Integer elements = st.pop();

        System.out.printin("Poped elements id "+element);

       //we can search elements in stack as
       int position = 0;
       position = st.search(30);

       if(position == 1)
       {
        System.out.println("There is no such elements in stack");
       }
       else
       {
        System.out.println("Element is found at position "+position)
       }
       //Display all the content of stack
       System.out.println("Stack contains :" +st);
    }
}