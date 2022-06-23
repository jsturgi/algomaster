import java.util.*;
import java.util.stream.Collectors;

public class InsertionSort
{
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> toSort)
    {
        for (int current: toSort)
        {
            while (current > 0 && toSort.get(current) < toSort.get(current-1))
            {
                int temp = toSort.get(current);
                toSort.set(current, toSort.get(current-1));
                current--;
            }
        }
        return toSort;
    }
    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> unsortedList = (ArrayList<Integer>) splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        List<Integer> res = insertionSort(unsortedList);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
