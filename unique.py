

import math

import random
import re
import sys

#
# Complete the 'lonelyinteger' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def lonelyinteger(a):
    for i in a:
        flag=0
        for j in a:
            if j==i:
                flag=flag+1
            else:
                pass
        if flag==1:
            return i
if __name__ == '__main__':
   

    n = int(input("enter n.o of elements: ").strip())

    a = list(map(int, input("enter array with single unique digit: ").rstrip().split()))

    result = lonelyinteger(a)
    print (result)
