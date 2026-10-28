// ConceptDemo.java
// Mirza Zukic
// October 28, 2026
// Demonstrates an array adapter, sorting, removal, and wildcards.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConceptDemo {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 4, 7};
        ArrayAdapter adapter = new ArrayAdapter(numbers);
        List<Integer> list = adapter.toList();

        System.out.println("Before sorting: " + list);             //This section of code creates an array with six numbers,
        Collections.sort(list);                                   //it then converts it into a list then also prints the list,
        System.out.println("After sorting: " + list);            //before sorting it from the least to greatest. after it removes,
                                                                //the needed value it calls the printlist method to display again.
        list.remove(Integer.valueOf(4));
        System.out.println("After removing 4: " + list);

        printList(list);
    }

    public static void printList(List<?> list) {                                    //this is the printlist method, it accepts any list type and also prints it.
        System.out.println("Printing list using unbounded wildcard: " + list);
    }
}

class ArrayAdapter {
    private Integer[] array;
                                                                  //This class stores an integer array using a constructor,
    public ArrayAdapter(Integer[] array) {                       // it also provides a toList method to make it a mutable list.
        this.array = array;                                     // it creates an ArrayList using a diamond operator and adds the elements
    }                                                          // with the collections.addAll() and then finally returns the lsit

    public List<Integer> toList() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}