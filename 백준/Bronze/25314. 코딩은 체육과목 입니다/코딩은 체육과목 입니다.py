import sys
input = sys.stdin.readline

a = int(input())

x = a // 4

ans = ''

for i in range(x):
    ans += 'long '

print(ans + 'int')