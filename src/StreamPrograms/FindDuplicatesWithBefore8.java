package StreamPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Finding Unique and duplicate value in the list ..
public class FindDuplicatesWithBefore8
{
    public static void main (String [] args)
    {
        List<Integer> list = Arrays.asList(1,5,8,9,3,4,5,6,6,2,3,1);
        System.out.println("Printing list value .." + list);

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(Integer listVal : list)
        {
            if(!unique.add(listVal))
            {
                duplicate.add(listVal);
            }
        }

        System.out.println("Printing unique value .." + unique);
        System.out.println("Printing duplicates value .." + duplicate);


    }
}
