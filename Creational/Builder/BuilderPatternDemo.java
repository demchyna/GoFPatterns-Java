import builder.Person;

public class BuilderPatternDemo {
    public static void main(String args[]) {

        Person person = Person.builderFactory()
                .addName("Mike")
                .addAge(27)
                .addPhone("08654382749")
                //.addAddress("Shevchenka st.")
                .build();

        System.out.println(person);

    }
}
