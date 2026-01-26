package CollectionProgram.Program1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastProg1
{
    public  static  void main (String []args)
    {
        List<String> list= new ArrayList<>();
        list.add("vg");
        list.add("san");
        list.add("nans");
        list.add("babi");
        System.out.println("printing the list values .."+list);

//        Iterator<String > itr= list.iterator();
//
//        while (itr.hasNext())
//        {
//            String  value = itr.next();
//
//            if(value.equals("vg"))
//            {
//                list.remove(value);
//                System.out.println("List value.." +list);
//            }
//        }

        List<String> str = list.stream().filter(e->
                !e.equals("nans")).toList();
        System.out.println("printing the stream result .." + str);
    }
}
