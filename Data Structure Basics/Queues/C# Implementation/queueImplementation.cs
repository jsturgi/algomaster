using System;
using System.Collections.Generic;
using System.Linq;

class Queues
{
    public static List<int> RotateLeftTillZero(List<int> nums)
    {
        //initialize a new queue out of nums
        Queue<int> queue = new Queue<int>(nums);
        // continue the loop till front of queue is 0.
        while (queue.peek() != 0)
        {
            //remove the front of the queue and add it to the end.
            queue.Enqueue(queue.Dequeue());
        }
        // create a list of queue
        return queue.toList();
    }

    public static List<string> SplitWords(string s)
    {
        return string.IsNullOrEmpty(s) ? new List<string>() : s.Trim().Split(' ').ToList();
    }

    public static void Main()
    {
        List<int> nums = SplitWords(Console.ReadLine()).Select(int.Parse).ToList();
        List<int> res = RotateLeftTillZero(nums);
        Console.WriteLine(String.Join(" ", res));
    }
}