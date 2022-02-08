package LEARNJAVA;

import java.util.HashMap;
import java.util.Map;

public class jala21 {
    private static Map<Integer, String> hash_map;

    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        System.out.println("Size of map is:- "+map.size());
        System.out.println(map);
        if (map.containsKey("vishal")) {
            Integer a = map.get("vishal");
            System.out.println("value for key"+a);
        }
        System.out.println(map.clone());
        map.containsKey(10);
        map.containsValue("vishal");
        map.isEmpty();
        System.out.println(map.size());
        map.remove(10,"vishal");
        System.out.println(map);
        map.putAll(new HashMap<>());
        System.out.println(new HashMap<>());

    }
    }

