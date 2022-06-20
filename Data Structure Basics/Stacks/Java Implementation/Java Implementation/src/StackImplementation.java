import java.util.*;
import java.util.stream.Collectors;

public class StackImplementation
{
    public static List<Integer> execute(List<String> program)
    {
        // initialize stack
        ArrayList<Integer> stack = new ArrayList<>();

        for (String instruction: program)
        {
            if (instruction.equals("peek"))
            {
                // print out the top item in stack
                System.out.println(stack.get(stack.size()-1));
            }
            else if (instruction.equals("pop"))
            {
                //pop the top item in stack
                stack.remove(stack.size() - 1 );
            }
            else
            {
              // get the data in the "push" instruction
              int data = Integer.parseInt(instruction.substring(5));
              // push data to the top of stack
                stack.add(data);
            }
        }
        return stack;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int programLength = Integer.parseInt(scanner.nextLine());
        List<String> program = new ArrayList<>();
        for (int i = 0; i < programLength; i++)
        {
            program.add(scanner.nextLine());
        }
        scanner.close();
        List<Integer> res = execute(program);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
