import java.util.*;

public class abstractlist {
    public static void main(String args[])
    {

        // Creating an empty AbstractList
        AbstractList<String> list = new LinkedList<String>();

        // Use add() method to add elements in the list
        list.add("This");
        list.add("is");
        list.add("for");
        list.add("your");
        list.add("Benefit");

        // Displaying the AbstractList
        System.out.println("AbstractList:" + list);
    }
}
