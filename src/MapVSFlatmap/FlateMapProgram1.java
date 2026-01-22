package MapVSFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlateMapProgram1
{
    public static void main (String [] args)
    {
        List<List<Integer>> list2 = List.of(
                List.of(1,2,3),
                List.of(4,6,8),
                List.of(5,7,8)
        );

        List<Integer>  flattenVal= list2.stream()
                .flatMap(list-> list.stream())
                .toList();

        System.out.println("printing the flatten value into the single elements ..." +flattenVal);

        List<String> listStr =List.of("Some stories lives in memories ","was i ever enough");

        List<String> flattenStr = listStr.stream()
                .flatMap(list-> Arrays.stream(list.split(" ")))
                .toList();

        System.out.println("Printing the String value into the "+flattenStr);

        // So here each element in the single stream so here there is no need fo the flat operation .
        List<String> mapList = List.of("value","can","entered");
        List<String> mapStr =mapList.stream()
                .map(list-> list.toUpperCase())
                .collect(Collectors.toList());

        mapStr.forEach(System.out::println);

    }
}

//Flat map is a stream operation ,it transforms each element into the stream and  then removing one level of nesting (flatten) all those element into the single element .
//Use the Flat map when one elements turns into multiple elements .


