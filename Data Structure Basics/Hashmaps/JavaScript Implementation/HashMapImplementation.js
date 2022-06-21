function getCounter(arr)
{
    // initialize a hashmap to store each number and its count
    const counter = new Map();
    for (const num of arr)
    {
        // check if num is a key in the hash map
        if (counter.has(num))
        {
            // update the count of num to increase by 1
            counter.set(num, counter.get(num) + 1);
        }
        else
        {
            // set the count of num to 1
            counter.set(num,1);
        }
    }
    return counter;
}

function splitWords(s)
{
    return s == "" ? [] : s.split(' ');
}

function* main()
{
    const arr = splitWords(yield).map((v => parseInt(v)));
    const res = getCounter(arr)
    const sortedCounter = new Map([...res].sort((a,b) => a[0] - b[0]));
    for (const[index,value] of sortedCounter.entries())
    {
        console.log(index,value);
    }
}
class EOFError extends Error {}
{
    const gen = main();
    const next = (line) => gen.next(line).done && process.exit();
    let buf = '';
    next();
    process.stdin.setEncoding('utf8');
    process.stdin.on('data', (data) => {
        const lines = (buf + data).split('\n');
        buf = lines.pop();
        lines.forEach(next);
    });
    process.stdin.on('end', () => {
        buf && next(buf);
        gen.throw(new EOFError());
    });
}