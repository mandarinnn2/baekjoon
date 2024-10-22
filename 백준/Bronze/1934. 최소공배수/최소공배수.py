import sys
import math

T = int(sys.stdin.readline())

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    lcm = (A * B) // math.gcd(A, B)
    print(lcm)