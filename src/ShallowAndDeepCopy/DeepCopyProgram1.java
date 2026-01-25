package ShallowAndDeepCopy;

public class DeepCopyProgram1
{
    public static void main (String [] args)
    {
        Address ad1 = new Address("Madurai");

        Person ps1 = new Person("San",ad1);

        //Deep Copy-- Its also creates an new object and also create new copies of all the referenced objects

        Address ad2 = new Address(ps1.address.city);
        Person ps2= new Person(ps1.name,ad2);

        ps2.address.city="Chennai";

        System.out.println(ps1.address.city); // Madurai
        System.out.println(ps2.address.city); // Chennai

    }
}
