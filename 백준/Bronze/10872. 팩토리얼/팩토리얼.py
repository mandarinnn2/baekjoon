import sys
N = int(sys.stdin.readline())

def fac(N):
    val = 1
    for i in range(2, N+1):
        val *= i
    return val

if N > 1:
    val = fac(N)
else:
    val = 1

print(val)