import singleton.SingleObject;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();

		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());

		object1.showMessage();
		object2.showMessage();
	}
}
