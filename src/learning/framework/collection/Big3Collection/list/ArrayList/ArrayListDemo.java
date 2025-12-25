package learning.framework.collection.Big3Collection.list.ArrayList;

/*
Array is fix size
ArrayList can change (auto boxing automatic size)
 */


import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {


        ArrayList<Integer> list  = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(10);

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("banana");
        fruit.add("Orange");
        fruit.add("Coconut");

        System.out.println("this is ArrayList before removing");
        System.out.println(list);
        System.out.println(fruit);

        // remove by index
        list.remove(0);
        fruit.remove(0);

        System.out.println("This is ArrayList after removing");
        System.out.println(list);
        System.out.println(fruit);


        // replace index0 by pineapple
        fruit.set(0 , "Pineapple");
        System.out.println(fruit);

        // get index0 in list
        System.out.println(list.get(0));

        // add last element
        fruit.addLast("Dragon fruit");
        System.out.println(fruit);

        //add first element
        list.addFirst(100);
        System.out.println(list);

//        more and more build in function
    }
}
