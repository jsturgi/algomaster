#include <algorithm> // copy
#include <iostream> // cin, cout, streamsize
#include <iterator> // ostream_iterator, prev
#include <limits> // numeric_limits
#include <string> // getline, string
#include <utility> // move
#include <vector> // vector

std::vector<int> execute(std::vector<std::string> program)
{
    // initialize the stack
    std::vector<int> stack;
    for (std::string instruction : program)
    {
        if (instruction == "peek")
        {
            //print out the top item in stack
            std::cout << stack.back() << std::endl;
        }
        else if (instruction == "pop")
        {
            // pop the top item in stack
            stack.pop_back();
        }
        else
        {
            // get the data in the "push" instruction
            int data = std::stoi(instruction.substr(5));
            // push data to the top of stack
            stack.push_back(data);
        }
    }
    return stack;
}
void ignore_line()
{
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
}

template<typename T>
void put_words(const std::vector<T>& v)
{
    if (!v.empty())
    {
        std::copy(v.begin(), std::prev(v.end()), std::ostream_iterator<T>{std::cout, " "});
        std::cout << v.back();
    }
    std::cout << '\n';
}
int main()
{
    int program_length;
    std::cin >> program_length;
    ignore_line();
    std::vector<std::string>program;
    for (int i = 0; i < program_length; i++)
    {
        std::string line;
        std::getline(std::cin, line);
        program.emplace_back(std::move(line));
    }
    std::vector<int> res = execute(program);
    put_words(res);
}
