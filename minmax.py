
import math
import os
import random
import re
import sys
import time

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#
st=time.time()
def Sum(arr):
    min_ = arr[0]
    max_ = arr[0]
    sum_ = 0
    for i in arr:
        sum_ += i
        if i > max_:
            max_ = i
        if i < min_:
            min_ = i
    print(sum_ - max_, sum_ - min_)
def miniMaxSum(arr):
    arr.sort()
    max=0
    min=0
    minlist=arr[:4]

    maxlist=arr[-4:]

    for i in minlist:
        min+=i
    for i in maxlist:
        max+=i
    print(min,max)
if __name__ == '__main__':

    arr = list(map(int, input("enter values: ").rstrip().split()))

    miniMaxSum(arr)
    Sum(arr)
et=time.time()
elapsed_time=et-st
print("time:",elapsed_time,"seconds")

