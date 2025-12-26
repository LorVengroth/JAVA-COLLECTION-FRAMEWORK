package learning.framework.collection.Big3Collection.map.HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
//        key : String , value : Integer
        HashMap<String , Integer> empIds = new HashMap<>();

        /* key : roth , value : 123 */
        empIds.put("Roth" , 123);
        empIds.put("John", 345);
        empIds.put("Jerry" , 168);

        System.out.println(empIds);

        // return with the key value : 123
        System.out.println(empIds.get("Roth"));

        // input the key value and return with boolean
        System.out.println(empIds.containsKey("Gorgina"));

        // input the value and return with boolean
        System.out.println(empIds.containsValue(123));

        // replace the value base on key
        empIds.replace("Roth" , 777);

        System.out.println(empIds);

        // Remove base on key
        empIds.remove("John");
        System.out.println(empIds);

        // get the key by use .Keyset()
        System.out.println(empIds.keySet());

        // get the value by use .value
        System.out.println(empIds.values());

    }
}
