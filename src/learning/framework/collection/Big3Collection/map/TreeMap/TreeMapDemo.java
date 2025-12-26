package learning.framework.collection.Big3Collection.map.TreeMap;

import java.util.TreeMap;

/*
* Tree Map already sorted
* */

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<String , Integer> fruitMap = new TreeMap<>();
        fruitMap.put("Banana" , 10);
        fruitMap.put("Apple" , 20);
        fruitMap.put("Mango", 30);
        fruitMap.put("Orange", 40);

        System.out.println(fruitMap);

//      print the first elements that already sorted by treeMap
        System.out.println(fruitMap.firstKey());

//      print first elements (key and value)
        System.out.println(fruitMap.firstEntry());

//      Research in hard to explain in one line hahaha
        System.out.println(fruitMap.higherKey("Ma"));

//      Research again haha
        System.out.println(fruitMap.lowerKey("Ma"));

        System.out.println(fruitMap.ceilingKey("Mango"));
    }
}
