package Stream.Programs;

import java.util.*;

//To find the 2nd highest number .
public class NormalProgramOfSecLargestNumber
{
    public static void main (String []args)
    {
        List<Integer> listNum = Arrays.asList(2,5,6,8,9,0,3,4,6,2);

        System.out.println("Printing the list value .." +listNum);
        //So to find the highest --need to add ony the unique element from the list .
        Set<Integer> uniqueNum =new HashSet<>(listNum);

        System.out.println("Printing the unique List elements .." +uniqueNum);

        //To make the elements into the reverse order

        List<Integer> setIntoList = new ArrayList<>(uniqueNum);

        System.out.println("printing the changed set into list elements " +setIntoList);

        //Reversing the elements from the list

        Collections.sort(setIntoList,Collections.reverseOrder());

        System.out.println("printing t " +setIntoList);

        if(setIntoList.size() <2)
        {
            throw new RuntimeException("No second highest");
        }

        Integer secHighElem = setIntoList.get(1);
        System.out.println("Printing the second highest elements from the list " + secHighElem);

    }
}
