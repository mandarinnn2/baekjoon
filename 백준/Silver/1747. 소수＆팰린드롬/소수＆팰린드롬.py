import sys
import math

N = int(sys.stdin.readline())

def isPrime(N):
    if N == 1:
        return False
    for i in range(2, int(math.sqrt(N) + 1)):
        if N % i == 0:
            return False
    return True


def isPalindrome(N):
    if str(N) == str(N)[::-1]:
        return True
    return False
    
    
while True:
    if isPrime(N) and isPalindrome(N):
        print(N)
        break
    N += 1