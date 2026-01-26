package CollectionProgram.Program1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeProg1
{
    public  static  void main (String []args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("vg");
        list.add("san");
        list.add("nans");
        list.add("babi");
        System.out.println("printing the list values .." + list);

        for (String value : list) {
            if (value.equals("nans")) {
                list.remove(value); // allowed
            }
        }

        System.out.println(list);
    }
}
