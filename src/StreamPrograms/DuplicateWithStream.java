package StreamPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWithStream
{
    public static void main (String [] args)
    {
        List<Integer> list = Arrays.asList(1,5,8,9,3,4,5,6,6,2,3,1);

        Set<Integer> unique = new HashSet<>();
        List<Integer> duplicate = list.stream()
                .filter(a-> !unique.add(a))
                .collect(Collectors.toList());

        System.out.println("Printing unique value .." + unique);
        System.out.println("Printing duplicates value .." + duplicate);
    }
}
