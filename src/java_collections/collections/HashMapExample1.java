package java_collections.collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapExample1
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"Amisha");
		map.put(101,"Taniya");
		map.put(102,"Mansi");
		map.put(103,"Adeeba");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}