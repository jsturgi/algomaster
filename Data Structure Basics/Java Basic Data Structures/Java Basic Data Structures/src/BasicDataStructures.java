import java.util.*;
public class BasicDataStructures
{
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3}; // initialize array
        System.out.println(numbers.length); // prints 3

        String[] clothes = new String[5]; // initialize array capable of holding 5 strings
        clothes[0] = "hi"; // sets first element

        for (int i = 0; i < numbers.length; i++) // increments by 1
        {
            System.out.println(numbers[i]);
        }

        for (int number: numbers) // for each loops directly fetches elements
        {
            System.out.println(number);
        }
    }
}

class LinkedListNode
{
    public int val;
    public LinkedListNode next;

    public LinkedListNode(int val)
    {
        this.val = val;
    }
}

class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode( int val )
    {
        this.val = val;
    }
}

class NTreeNode
{
    public int val;
    public ArrayList<NTreeNode> children;

    public NTreeNode(int val)
    {
        this.val = val;
        this.children = new ArrayList<NTreeNode>();
    }
}
