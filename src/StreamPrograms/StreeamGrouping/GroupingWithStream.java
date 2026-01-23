package StreamPrograms.StreeamGrouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingWithStream
{
    public static void  main (String [] args)
    {
        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee(1,"vg",10));
        empList.add(new Employee(12,"babi",20));
        empList.add(new Employee(3,"ant",30));
        empList.add(new Employee(4,"san",10));
        empList.add(new Employee(5,"sur",20));
        empList.add(new Employee(6,"nans",40));

        System.out.println("Printing the Employee List.." + empList);

        Map<Integer ,List<Employee>> map = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptNo));

        System.out.println("the Employee map.." + map);

        map.forEach((deptNo,employess)->
    {
        System.out.println("deptno" + deptNo);
        employess.forEach(System.out::println);
        System.out.println();
    });
    }
}
