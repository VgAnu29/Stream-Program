package HashTableVSHashMap;

import java.util.HashMap;
import java.util.Hashtable;

//Lambda and Stream do work with the hashtable but its not efficient and they defeat the purpose of the stream and its pipeline
public class HashTableProgram
{
    public static void main (String [] args )
    {
        Hashtable<Integer,String> hashTable  = new Hashtable<>();

        Thread t1 = new Thread(()->
        {
            System.out.println("Thread-1 trying to put value...");
            hashTable.put(1,"java"); //synchronized here .
            hashTable.put(2,"Sql");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {}
            System.out.println("Thread-1 finished");
        });

        // Thread 2 - Reader thread
        Thread t2 = new Thread(() -> {
            System.out.println("Thread-2 trying to read value...");
            String value = hashTable.get(1); // synchronized method--blocked here 
            System.out.println("Thread-2 read value: " + value);
        });

        t1.start();
        t2.start();
    }
}
