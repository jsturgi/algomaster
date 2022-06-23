function sortList(unsortedList)
{
    const n = unsortedList.length;
    for (let i = n - 1; i >= 0; i--)
    {
        let swapped = false;
        for (let j = 0; j < i; j++)
        {
            if (unsortedList[j]>unsortedList[j+1]) // check if swap is needed
            {
                let temp = unsortedList[j];
                unsortedList[j] = unsortedList[j + 1]; //swap
                unsortedList[j + 1] = unsortedList[j] //swap
                swapped = true // set break con

            }
        }
        if (!swapped) return unsortedList; // check break con
    }
    return unsortedList;
}