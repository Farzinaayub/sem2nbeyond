


import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    hr=int(s[:2])
    msec=s[2:8]
    if s[-2:]=='PM':
        hr=hr%12+12
    else:
        hr=hr%12
    return f"{hr:02}{msec}"

if __name__ == '__main__':
   

    s = input("00:00:00AM format: ")

    result = timeConversion(s)
    print("24 hr format: ",result)

    
    