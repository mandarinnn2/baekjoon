import sys

input = sys.stdin.readline

n, m = map(int, input().split())

result = [i+1 for i in range(0, n)]

idx = 0
for i in range(m):
    i, j = map(int, input().split())
    idx = result[i - 1]
    result[i - 1] = result[j - 1]
    result[j - 1] = idx
    
print(*result)
