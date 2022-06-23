import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SelectionSort
{
    public static List<Integer> sortList(List<Integer> unsortedList)
    {
        for (int i = 0; i < unsortedList.size(); i++)
        {
            int min_index = i; // set min index to the pivot index
            for (int j = i; j < unsortedList.size(); j++)
            {
                if (unsortedList.get(j) < unsortedList.get(min_index)) // compare items in array to current min index
                {
                    min_index = j; // if value of index is less than min index, update
                }
            }
            // swap
            int temp = unsortedList.get(i);
            unsortedList.set(i,unsortedList.get(min_index));
            unsortedList.set(min_index,temp);
        }
        return unsortedList;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> unsortedList = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        List<Integer> res = sortList(unsortedList);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

