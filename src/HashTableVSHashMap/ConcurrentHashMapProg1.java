package HashTableVSHashMap;


import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapProg1
{
    public static void main (String []args)
    {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

        Runnable task1 =()->
        {
            for(int i=0;i<=5;i++)
            {
                map.put(i,"thread-1" + i);
                System.out.println(Thread.currentThread().getName()
                        + " put key " + i);
            }
        };

        Runnable task2 =()->
        {
            for(int i=6;i<=10;i++)
            {
                map.put(i,"thread-1" + i);
                System.out.println(Thread.currentThread().getName()
                        + " put key " + i);
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}

//ConcurrentHashMap is faster than synchronizedMap because it does not lock the entire map.
//while ConcurrentHashMap allows multiple threads to read and write concurrently by  locking only specific portions of the map
