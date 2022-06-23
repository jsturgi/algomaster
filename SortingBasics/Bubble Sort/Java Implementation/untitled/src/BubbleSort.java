import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BubbleSort
{
    public static List<Integer> sortList(List<Integer> unsortedList)
    {
        int n = unsortedList.size();
        for (int i = n - 1; i >= 0; i--)
        {
            boolean swapped = false;
            for (int j = 0; j < i; j++)
            {
                if (unsortedList.get(j) > unsortedList.get(j+1))
                {
                    int temp = unsortedList.get(j+1);
                    unsortedList.set(j+1,unsortedList.get(j));
                    unsortedList.set(j, temp);
                    swapped = true;
                }
            }
            if(!swapped) return unsortedList;
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
