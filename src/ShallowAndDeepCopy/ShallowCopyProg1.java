package ShallowAndDeepCopy;

public class ShallowCopyProg1
{
    public static void main (String []args)
    {
        Address add1 = new Address("Chennai");

        Person p1 = new Person("vg",add1);

        //Shallow Copy --It's create a new object and both object will share the same inner object .

        Person p2 = new Person(p1.name,p1.address);

        p2.address.city ="Bangalore";

        System.out.println(p1.address.city); // Bangalore
        System.out.println(p2.address.city); // Bangalore
    }
}

//One object changes data
//Another object unexpectedly gets affected
//Causes bugs in multithreading & real systems
