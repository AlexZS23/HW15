import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 //решить все задачки https://www.w3resource.com/java-exercises/collection/index.php#hashmap
 // в разделе Java Collection: HashMap

public class HashMapExercises {

    public static void main(String[] args) {
        firstExercise();
        secondExercise();
        thirdExercise();
        fourthExercise();
        fifthExercise();
        sixthExercise();
        seventhExercise();
        eighthExercise();
        ninthExercise();
        tenthExercise();
        eleventhExercise();
        twelfthExercise();
    }

    //    1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void firstExercise() {

        HashMap<Integer, String> hashMap1 = new HashMap<>();

        hashMap1.put(1, "First");
        hashMap1.put(2, "Second");
        hashMap1.put(3, "Third");
        hashMap1.put(4, "Fourth");

        for (Map.Entry mapping : hashMap1.entrySet()) {
            System.out.println(mapping.getKey() + " - " + mapping.getValue());
        }
    }

    //    Write a Java program to count the number of key-value (size) mappings in a map.
    public static void secondExercise() {

        HashMap<Integer, String> hashMap2 = new HashMap<>();

        hashMap2.put(1, "First");
        hashMap2.put(2, "Second");
        hashMap2.put(3, "Third");
        hashMap2.put(4, "Fourth");

        System.out.println("Размер текущего HashMap = " + hashMap2.size());
    }

    //    3. Write a Java program to copy all of the mappings from the specified map to another map.
    public static void thirdExercise() {
        HashMap<Integer, String> hashmap3 = new HashMap<>();
        HashMap<Integer, String> hashmap3plus = new HashMap<>();

        hashmap3.put(1, "First");
        hashmap3.put(2, "Second");

        hashmap3plus.put(3, "Third");
        hashmap3plus.put(4, "Fourth");

        hashmap3.putAll(hashmap3plus);

        System.out.println("Объединенный HashMap: " + hashmap3);
    }

    //    4. Write a Java program to remove all of the mappings from a map.
    public static void fourthExercise() {
        HashMap<Integer, String> hashMap4 = new HashMap<>();

        hashMap4.put(1, "First");
        hashMap4.put(2, "Second");

        hashMap4.clear();

        System.out.println("После удаления значений из HashMap: " + hashMap4);
    }

    //    5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static void fifthExercise() {

        HashMap<Integer, String> hashMap5 = new HashMap<>();

//        hashMap5.put(1, "First");
//        hashMap5.put(2, "Second");

        boolean checkIsMapEmpty = hashMap5.isEmpty();

        System.out.println("HashMap пустой? Ответ: " + checkIsMapEmpty);
    }

    //    6. Write a Java program to get a shallow copy of a HashMap instance.
    public static void sixthExercise() {
        HashMap<Integer, String> hashMap6 = new HashMap<>();

        hashMap6.put(1, "First");
        hashMap6.put(2, "Second");
        hashMap6.put(3, "Third");
        hashMap6.put(4, "Fourth");

        HashMap<Integer, String> hashMap6Clone = new HashMap<>();
        hashMap6Clone = (HashMap<Integer, String>) hashMap6.clone();

        System.out.println("Клонированный HashMap: " + hashMap6Clone);
    }

    //    7. Write a Java program to test if a map contains a mapping for the specified key.
    public static void seventhExercise() {
        HashMap<Integer, String> hashMap7 = new HashMap<>();

//        hashMap7.put(1, "First");
        hashMap7.put(2, "Second");
        hashMap7.put(3, "Third");
        hashMap7.put(4, "Fourth");

        boolean checkFirstKey = hashMap7.containsKey(1);

        System.out.println("HashMap " + hashMap7 + " содержит ключ 1? Ответ: " + checkFirstKey);
    }

    //    8. Write a Java program to test if a map contains a mapping for the specified value.
    public static void eighthExercise() {
        HashMap<Integer, String> hashMap8 = new HashMap<>();

        hashMap8.put(1, "First");
        hashMap8.put(2, "Second");
        hashMap8.put(3, "Third");
        hashMap8.put(4, "Fourth");

        boolean checkForValue = hashMap8.containsValue("Third");

        System.out.println("HashMap " + hashMap8 + " содержит значение Third? Ответ: " + checkForValue);
    }

    //9. Write a Java program to create a set view of the mappings contained in a map.
    public static void ninthExercise() {

        HashMap<Integer, String> hashMap9 = new HashMap<>();

        hashMap9.put(1, "First");
        hashMap9.put(2, "Second");
        hashMap9.put(3, "Third");
        hashMap9.put(4, "Fourth");

        Set setMap = hashMap9.entrySet();

        System.out.println("Значение из Set: " + setMap);
    }

    //    10. Write a Java program to get the value of a specified key in a map.
    public static void tenthExercise() {

        HashMap<Integer, String> hashMap10 = new HashMap<>();

        hashMap10.put(1, "First");
        hashMap10.put(2, "Second");
        hashMap10.put(3, "Third");
        hashMap10.put(4, "Fourth");

        System.out.println("Значение ключа 4 = " + hashMap10.get(4));
    }

    //    11. Write a Java program to get a set view of the keys contained in this map.
    public static void eleventhExercise() {

        HashMap<Integer, String> hashMap11 = new HashMap<>();

        hashMap11.put(1, "First");
        hashMap11.put(2, "Second");
        hashMap11.put(3, "Third");
        hashMap11.put(4, "Fourth");

        Set<Integer> keys = hashMap11.keySet();

        System.out.println("Ключи HashMap: " + keys);
    }

//    12. Write a Java program to get a collection view of the values contained in this map.

    public static void twelfthExercise() {

        HashMap<Integer, String> hashMap12 = new HashMap<>();

        hashMap12.put(1, "First");
        hashMap12.put(2, "Second");
        hashMap12.put(3, "Third");
        hashMap12.put(4, "Fourth");

        System.out.println("Значения HashMap: " + hashMap12.values());
    }
}


