import java.util.ArrayList;
public class Agency
{
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(5);
list.add(10);
list.add(15);
list.add(20);
list.add(25);

int counter = 0;
while(counter < list.size())
{
    counter++;
    list.set(counter, list.get(counter)+5);
}
System.out.println(list.toString());
    }
}
