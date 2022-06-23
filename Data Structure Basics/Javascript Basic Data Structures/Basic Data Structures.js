const arr = [0,1,2,3,4,5];
let subarray = arr.slice(2,5); // 2,3,4
subarray = arr.slice(-2); // 4,5

const numbers = [2,6,13,5];
// c-like for loop fetches elements using indices
for (let i = 0; i < numbers.length; i++)
{
    const number = numbers[i];
    console.log(number);
}

// foreach loop directly fetches elements and their indices
numbers.forEach(function (item,index)
{
    console.log(`${item} ${index}`);
    // 2 0
    // 6 1
    // 13 2
    // 5 3
})

// for of loops directly fetches elements

for (const number of numbers)
{
    console.log(number);
}

class LinkedListNode
{
    constructor(val, next = null)
    {
        this.val = val;
        this.next = next;
    }
}

function LinkedListNode(val, next)
{
    this.val = val;
    this.next = next;

    const LinkedListNode = {val: 1, next: {val: 2, next: null}};
}

class TreeNode
{
    constructor(val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class NTreeNode
{
    constructor(val)
    {
        this.val = val;
        this.children = [];
    }
}