package HashTableVSHashMap;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMapProg1
{

        public static void main (String []args)
        {
            Map<Integer,String> map = Collections.synchronizedMap(new ConcurrentHashMap<>());

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

//SynchronizedMap uses a single lock, allowing only one thread at a time
