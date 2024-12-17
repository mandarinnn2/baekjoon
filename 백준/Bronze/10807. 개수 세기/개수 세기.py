import sys

input = sys.stdin.readline

n = int(input())

arr = list(map(int, input().split()))

x = int(input())

idx = 0
for i in range(n):
    if arr[i] == x:
        idx += 1

print(idx)