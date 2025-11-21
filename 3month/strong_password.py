#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'minimumNumber' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. STRING password
#

def minimumNumber(n, password):
    # Return the minimum number of characters to make the password strong
    spl='!@#$%^&*()-+'
    lst=[0,0,0,0]
    for ch in password:
        if ch.isdigit():
            lst[0]=1
        elif ch.islower():
            lst[1]=1
        elif ch.isupper():
            lst[2]=1
        elif ch in spl:
            lst[3]=1
    return (max(6-len(password),4-sum(lst)))
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    password = input()

    answer = minimumNumber(n, password)

    fptr.write(str(answer) + '\n')

    fptr.close()
