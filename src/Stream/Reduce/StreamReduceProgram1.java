package Stream.Reduce;

import java.util.Arrays;
import java.util.List;

//Reduce method is used  to combine all elements of the stream into the single stream.
public class StreamReduceProgram1
{
    public static void main (String [] args)
    {
        List<Integer> list = Arrays.asList(3,5,6,8,9,2,3);

        //1.Reduce with  Sum operation with lambda
        int sum1 = list.stream().reduce(0,(a,b)-> a+b);
        System.out.println("Printing the sum value with Lambda.." +sum1);

        // Reduce with Method Reference
        int sum2 = list.stream().reduce(0,Integer::sum);
        System.out.println("Printing the sum value with Method Reference .." +sum2);

        //2.Reduce -> Multiple operation (Lambda)
        int sumMul1 = list.stream().reduce(1,(a,b)-> a*b);
        System.out.println("Reduce multiple.."+sumMul1);

//3.Find Max number --Lambda
        int maxNum = list.stream().reduce(Integer.MIN_VALUE,(a,b)-> a>b?a:b);
        System.out.println("Max Number for Lambda.." + maxNum);

        //4.Find Min number --Lambda
        int minNum = list.stream().reduce(Integer.MAX_VALUE,(a,b)-> a<b?a:b);
        System.out.println("Max Number for Lambda.." + minNum);

        //5.Concat
        List<String> str = Arrays.asList("vg","babi","nans");

        String strConcat = str.stream().reduce(" ",(a,b)-> a + " " + b);
        System.out.println("Printing the concatenate string value .." + strConcat);

        //Count elements using Reduce ..
        int count = list.stream().reduce(0,(a,b)-> a+1);
        System.out.println("Counting the list of elements in the list .." +count);

        //Count before java 8
        int cnt1=0;
        for(int cnt : list)
        {
            cnt1++;
        }
        System.out.println("counting with java .." + cnt1);

    }
}
