function sortList(unsortedList)
{
    for (let i = 0; i < unsortedList.length; i++)
    {
        let minIndex = i; // set original min index
        for (let j = i; j < unsortedList.length; j++)
        {
            if (unsortedList[j] < unsortedList[minIndex])
            {
               minIndex = j; // set pivot to new min index
            }
        }
        // swap
        let temp = unsortedList[i];
        unsortedList[i] = unsortedList[minIndex];
        unsortedList[minIndex] = j;
    }
    return unsortedList;
}

function splitWords(s) {
    return s == "" ? [] : s.split(' ');
}

function* main() {
    const unsortedList = splitWords(yield).map((v) => parseInt(v));
    const res = sortList(unsortedList);
    console.log(res.join(' '));
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