import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        Cat cat = new Cat("Blacky", false, 10, 5);
        Dog dog = new Dog("Joker", false, 32, 20);
        Owl owl = new Owl("Oh", true, 40, 10);

        Owl owl2 = new Owl("Dumal", true, 60, 7);
        Cat cat2 = new Cat("Sova", false, 10, 8);

        Map<String, Pet> hashmap = new HashMap<String, Pet>();

        hashmap.put(cat.getName(), cat);
        hashmap.put(dog.getName(), dog);
        hashmap.put(owl.getName(), owl);
        hashmap.put(owl2.getName(), owl2);
        hashmap.put(cat2.getName(), cat2);

        for (String key: hashmap.keySet()) {
            Pet val = hashmap.get(key);
            System.out.println(val);
        }
    }
}
