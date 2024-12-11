import sys

input = sys.stdin.readline

x = input().rstrip()

arr = [x[i] for i in range(len(x))]

idx = 0
if arr.index("(") > arr.index("1"):
    idx += 1
if arr.index(")") < arr.index("1"):
    idx += 1

print(idx)