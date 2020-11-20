package EasyStorage_Challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * EasyStorage
 */
public class EasyStorage {
    private static final HashMap<String, String> hash_map = new HashMap<String, String>();

    public static void main(String[] args) {
        String item = "Glasses";
        String repository = "Bookshelf";
        store(item, repository);
        getAllData();
        System.out.println(getRepository(item, repository));
        System.out.println(getItem(item, repository));

    }

    public static void store(String item, String repository) {
        if (item == null || repository == null) {
            throw new NullPointerException();
        } else if (item.isEmpty() || repository.isEmpty()) {
            throw new IllegalArgumentException();
        }
        hash_map.put(item, repository);
        System.out.println(hash_map);

    }

    public static void getAllData() {
        System.out.println(hash_map);
    }

    public static String getRepository(String item, String repository) {
        if (hash_map.containsKey(item) == true) {
            return repository;
        } else {
            return null;
        }

    }

    public static String getItem(String item, String repository) {
        if (hash_map.containsValue(repository) == true) {
            return item;
        } else {
            return null;
        }
    }

}