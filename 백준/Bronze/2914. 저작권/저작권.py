import sys
import math
A, I = map(int, sys.stdin.readline().split())

res = A * I

while(True):
    if math.ceil(res / A) == I:
            res -= 1
    else:
        break

print(res + 1)