#include <algorithm> // copy
#include <deque> // deque
#include <iostream> // cin, cout
#include <iterator> // back_inserter, istream_iterator, ostream_iterator, prev
#include <sstream> // istringstream
#include <string> // getline, string
#include <vector> // vector

std::vector<int> rotate_left_till_zero(std::vector<int> nums)
{
    // initialize the queue out of nums
    std::deque<int> queue(nums.begin(), nums.end());

    // continue the loop till front of queue is 0
    while (queue.front() != 0)
    {
        // peek at the front of queue and add it to the back of queue
        queue.push_back(queue.front());
        // dequeue the first member
        queue.pop_front();
    }

    // create a vector out of the queue
    std::vector<int> res;
    while (!queue.empty())
    {
        res.emplace_back(std::move(queue.front()));
        queue.pop_front();
    }
    return res;
}

template<typename T>
std::vector<T> get_words()
{
    std::string line;
    std::getline(std::cin, line);
    std::istringstream ss{line};
    std::vector<T> v;
    std::copy(std::istream_iterator<T>{ss}, std::istream_iterator<T>{}, std::back_inserter(v));
    return v;
}

template<typename T>
void put_words(const std::vector<T>& v)
{
    if (!v.empty())
    {
        std::copy(v.begin(), std::prev(v.end()), std::ostream_iterator<T>{std::cout, " "});
    }
    std::cout << '\n';
}
int main()
{
    std::vector<int> nums = get_words<int>();
    std::vector<int> res = rotate_left_till_zero(nums);
    put_words(res);
}
