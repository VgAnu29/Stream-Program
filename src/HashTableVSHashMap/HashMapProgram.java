package HashTableVSHashMap;

//Why is Hashmap preferred over Hashtable ?
// Because HashTable was retrofitted into the collection so it is a legacy class,inefficient and the poor concurrency design
//So very thread is synchronized ,one thread locks the entire map and other thread must have to wait ,even for the read operations..

//HashMap is not synchronized and its a cleaner API , modern design and for the better concurrency solutions and allow one null key and multiple null values.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapProgram
{
   public static void main (String [] args)
   {
       HashMap<Integer,String> hashMap = new HashMap<>();

       hashMap.put(1,"vg");
       hashMap.put(2,"babi");
       hashMap.put(3,"nans");
       hashMap.put(4,"san");

       System.out.println("Printing the Hashmap  elements .." +hashMap);

       for(Map.Entry<Integer,String> entry : hashMap.entrySet())
       {
           System.out.println("Enter value whole map .." + entry);
           System.out.println("Enter only the key  .." + entry.getKey());
           System.out.println("Enter only the value .." + entry.getValue());
       }
       //Lambda Expression to get the key + value .. //This is called as Cleaner and modern API-> Allows lambda and stream functionality .
       hashMap.forEach((k,v)-> System.out.println("get the key " + k  + " get the value " + v));

       //Modern API with the Stream operations.

       hashMap.entrySet().stream().filter(a-> a.getKey()>1)
               .forEach(a-> System.out.println("get the value.." + a.getValue()));

       //HashMap with parallel Stream
       Map<Integer, String> map = new HashMap<>();

       for (int i = 1; i <= 10; i++) {
           map.put(i, "Value-" + i);
       }
       //So with the help of Parallel Stream ,multiple thread can access the read operation with the help of ForkJoinPool
       System.out.println("Parallel thread.." +map);
       map.entrySet().parallelStream().forEach(e -> {
           System.out.println(
                   Thread.currentThread().getName()
                           + " -> " + e.getKey()
                           + " = " + e.getValue()
           );
       });
       Map<Integer, Integer> map1 = new HashMap<>();

       // Prepare data
       List<Integer> numbers = new ArrayList<>();
       for (int i = 1; i <= 1000; i++) {
           numbers.add(i);
       }

       numbers.parallelStream()
               .forEach(n -> {
                   map.put(n, String.valueOf(n));    // not thread safe
               });

       System.out.println("Expected size : 1000");
       System.out.println("Actual size   : " + map.size());


   }
}
