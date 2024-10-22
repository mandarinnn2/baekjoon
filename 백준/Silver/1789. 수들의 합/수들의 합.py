import sys

S = int(sys.stdin.readline())

res = 1
for N in range(1, S):
    if N * (N + 1) // 2 == S:
        res = N
        break
    elif N * (N + 1) // 2 < S:
        res = N
    if N * (N + 1) // 2 > S:
        break

print(res)