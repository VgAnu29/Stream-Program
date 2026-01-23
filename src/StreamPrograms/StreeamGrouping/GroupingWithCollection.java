package StreamPrograms.StreeamGrouping;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Grouping the list by deptNo elements ...

public class GroupingWithCollection
{
    public static void main (String [] args)
    {
        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee(1,"vg",10));
        empList.add(new Employee(12,"babi",20));
        empList.add(new Employee(3,"ant",30));
        empList.add(new Employee(4,"san",10));
        empList.add(new Employee(5,"sur",20));
        empList.add(new Employee(6,"nans",40));

        System.out.println("Printing the Employee List.." + empList);

        Map<Integer,List<Employee>> map =new HashMap<Integer,List<Employee>>();

        for(Employee emp : empList)
        {
            int departmentNo = emp.getDeptNo();
            System.out.println("Printing the departmentNo.." + departmentNo);
            //If department not present ,create new Array List
            if(!map.containsKey(departmentNo))
            {
                System.out.println("map value .." + map);
                map.put(departmentNo,new ArrayList<>());
            }

            map.get(departmentNo).add(emp);
            System.out.println("map 1value .." + map);
        }

        for(Map.Entry<Integer,List<Employee>> entry :map.entrySet())
        {
            System.out.println(" printing the full elements .." +entry);

            for(Employee e : entry.getValue())
            {
                System.out.println("get value .." + e);
            }
        }

    }
}
