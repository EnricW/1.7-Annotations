package level2.exercise1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person.setName("Eric");
            person.setAge(37);

            JsonSerializer.serialize(person);
            System.out.println("Object serialized successfully!");

        } catch (IOException e) {
            System.err.println("Error serializing: " + e.getMessage());
        }
    }
}
