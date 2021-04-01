import singleton.SingleObject;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();

//		SingleObject object1 = new SingleObject();
//		SingleObject object2 = new SingleObject();

		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());

		System.out.println(object1.equals(object2));

		object1.showMessage();
		object2.showMessage();
	}
}
