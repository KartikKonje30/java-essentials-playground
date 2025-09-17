import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class CF {
    
    public static void main(String[] args) {
        
        // Collection Framework
        // Information int pdf.

        // List is an interface which is implemented by different classes
        
        // Most known and used are: 
        
        // 1. List --> ArrayList, LinkedList, Vector, Stack
        // To store data in sequential order, duplicate elements are allowed here.

        // Example for ArrayList:
        // ArrayList after size is exceeded, the elemets are then shifted into a new array of size greater than the prevous array size by 1/5th.

        // ArrayList<Integer> arrayList = new ArrayList();
        // arrayList.add(10);
        // arrayList.add(20);
        // arrayList.add(30); 

        // System.out.println(arrayList);
        // System.out.println(arrayList.size());
        // System.out.println(arrayList.contains(20));
        // System.out.println(arrayList.get(2));

        // List is the parent interface so can be used in the same way for creating arraylist
        
        // List<Integer> arrayList2 = new ArrayList();
        // arrayList2.add(10);
        // arrayList2.add(20);
        // arrayList2.add(30); 

        // arrayList.addAll(arrayList2);

        // System.out.println(arrayList);

        // Example for LinkedList
        // LinkedList is internally a DoubleLinkedList.
        // linkedlist creates a node for every element added into the list
        // also storing address pointers for next element
        // It resolves the point of exceeding the size as in arraylist as it creates a node for each element stored randomly in the memory.
        // Its efficient if we want to add a new element between two elements as we need to only update its address pointers of next element, but in array we need to shift all the elements if we want to do same.

        // List<Integer> List = new LinkedList();
        // List.add(10);
        // List.add(20);
        // List.add(30); 

        // System.out.println(List);


        // 2. Set --> HashSet, LinkedHashSet
        // To store unique element only.

        // 3. Queue --> LinkedList, PriorityQueue, Dequeue

        // 4. Maps --> HashMap, HashTable, TreeMap
        // To store key-value pairs



    }

}
