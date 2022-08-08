

import math
import os
import random
import re
import sys
#

def countingSort(arr):
    range_arr=max(arr)
    ind_arr=[0] * (range_arr+1)
    for i in arr:
        ind_arr[i]+=1
    return ind_arr

if __name__ == '__main__':

    n = int(input("enter n: ").strip())

    arr = list(map(int, input("enter values: ").rstrip().split()))

    result = countingSort(arr)
    print(result)