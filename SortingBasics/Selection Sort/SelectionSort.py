from typing import List
import sys

def sort_list(unsorted_list: List[int]) -> List[int]:
    n = len(unsorted_list)
    
    for i in range(n):
        smallest_index = i 
        for j in range(i,n):
            if unsorted_list[j] < unsorted_list[i]:
                smallest_index = j
        unsorted_list[i], unsorted_list[smallest_index] = unsorted_list[smallest_index], unsorted_list[i]
    
    return unsorted_list

        


