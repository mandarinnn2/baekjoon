import sys

N = int(sys.stdin.readline())

x = []

for i in range(2, int(N**0.5) + 1):
    while N % i == 0:
        x.append(i)
        N //= i

if N > 1:
    x.append(N)

x.sort()

for i in range(len(x)):
    print(x[i])