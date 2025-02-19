import java.io.*;
import java.util.*;
public class WordFrequencyCounter {
public static void main(String[] args) {
Map<String, Integer> originalMap = new HashMap<>();
originalMap.put("A", 1);
originalMap.put("B", 2);
originalMap.put("C", 1);
Map<Integer, List<String>> invertedMap = invertMap(originalMap);
System.out.println(invertedMap);
}
public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
Map<V, List<K>> invertedMap = new HashMap<>();
for (Map.Entry<K, V> entry : map.entrySet()) {
invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
}
return invertedMap;
}
}
