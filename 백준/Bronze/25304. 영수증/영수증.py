import sys
input = sys.stdin.readline

cost = int(input())

num = int(input())

result = 0
for i in range(num):
    a, b = map(int, input().split(' '))
    result += (a * b)

if cost == result:
    print("Yes")
else:
    print('No')