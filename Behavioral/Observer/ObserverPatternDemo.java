import converter.Observable;
import converter.Subscription;
import converter.impl.OctalObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Observable observable = new Observable();

        Subscription octalSubscription = observable.subscribe(new OctalObserver());

        Subscription binarySubscription = observable.subscribe((number) -> {
            System.out.println("Binary String: " + Integer.toBinaryString(number));
        });

        Subscription hexaSubscription = observable.subscribe((number) -> {
            System.out.println("Hex String: " + Integer.toHexString(number).toUpperCase());
        });

        observable.setState(268);

        hexaSubscription.unsubscribe();
        System.out.println();

        observable.setState(351);

        binarySubscription.unsubscribe();
        System.out.println();

        observable.setState(483);

        octalSubscription.unsubscribe();

    }
}
