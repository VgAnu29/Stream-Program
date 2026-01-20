package Stream.Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamWithSecondLargestNumber
{
    public static void main (String [] args)
    {
        List<Integer> secondLargest = Arrays.asList(1,4,5,68,8,9,34,67,89);

        //We cannot store this stream pipeline in another stream or list reference because findFirst() is a terminal operation that returns an Optional, not a Stream.
        //After calling orElseThrow(), the Optional is unwrapped and the final result is an Integer, so it must be stored in an Integer reference.
        //So the return value in single so the stream will not store the single value so it a sequence of elements right so it will store set of elements into one stream
     //   List<String> streamSecondHighest = secondLargest.stream()
        Integer streamSecondHighest= secondLargest.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No Second Highest Number"));

        System.out.println("Printing the second largest number" + streamSecondHighest);
    }
}
