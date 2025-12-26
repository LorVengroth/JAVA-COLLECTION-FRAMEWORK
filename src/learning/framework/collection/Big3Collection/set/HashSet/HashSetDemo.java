package learning.framework.collection.Big3Collection.set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Roth");
        names.add("Hor");
        names.add("Sorng");
        names.add("Roth");

        HashSet<String> names2 = new HashSet<>();
        names2.add("LuXin");
        names2.add("HaoXin");
        names2.add("Hor");

        // because it not contain duplicate so it show only 3 element
        System.out.println(names);

        List<String> list1 = new ArrayList<>();
        list1.add("Lyheng");
        list1.add("Lypheng");
        names.addAll(list1);
        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        // remove method
        names.remove("Lypheng");
        System.out.println(names);

        // find the same thing return the value that match each other
//        names.retainAll(names2);
//        System.out.println(names);

        // return the thing that names2 dont have
        names.removeAll(names2);
        System.out.println(names);


        // contain all
        System.out.println(names.containsAll(names2));

    }

}
