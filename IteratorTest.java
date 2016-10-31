import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorTest {

	public static void main(String[] args) {
		List<Object> listToIterate = new ArrayList();
		
		List<Object> arrayList = new ArrayList<Object>();
		List<Object> vector = new Vector<Object>();
		
		arrayList.add(Integer.valueOf(1));
		arrayList.add(Integer.valueOf(2));
		
		vector.add(Integer.valueOf(3));
		vector.add(Integer.valueOf(4));
		
		listToIterate.addAll(arrayList);
		listToIterate.addAll(vector);
		
		for (Iterator iterator = listToIterate.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println("Value "+object);
		}

	}

}
