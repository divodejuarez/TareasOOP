import java.util.Iterator;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		Vector v = new Vector();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);;
		Iterator it = new EnumerationAdapter(v.elements());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
