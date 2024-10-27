
import java.util.HashSet;
import java.util.Iterator;

class HS
{
    public static void main(String arg[])
    {

        HashSet<Integer> marks = new HashSet<>();

        marks.add(60);
        marks.add(70);
        marks.add(80);
        marks.add(66);

        System.out.println("Hashset :"+marks);

        marks.add(66);

       boolean v1 = marks.remove(60);
       System.out.println("is 60 removed : "+v1);


    }

}