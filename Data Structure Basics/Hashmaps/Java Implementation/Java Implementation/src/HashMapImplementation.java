import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class HashMapImplementation
{
    public static HashMap<Integer, Integer> getCounter(List<Integer> arr)
    {
        // initialize a hash map to store each number and its count
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : arr)
        {
            // check if num is  a key in the hah map
            if (counter.containsKey(num))
            {
                // update the count of num to increase by 1
                counter.put(num, counter.get(num) + 1);
            }
            else
            {
                // set the count of num to 1
                counter.put(num, 1);
            }
        }
        return counter;
    }

    public static List<String> splitWords(String s)
    {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        HashMap<Integer, Integer> counter = getCounter(arr);
        Map<Integer, Integer> sortedCounter = new TreeMap<>(counter);
        for (int key : sortedCounter.keySet()) {
            System.out.println(key + " " + sortedCounter.get(key));
        }
    }
}
