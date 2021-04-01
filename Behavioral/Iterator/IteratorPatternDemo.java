import iterator.Impl.NameRepository;
import iterator.Iterable;
import iterator.Iterator;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		Iterable names = new NameRepository(
				new String[] { "Robert", "John", "Julie", "Lora", "Steven" });

		Iterator iterator = names.getIterator();

		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println("Hello " + name + "!");
		}
	}
}
