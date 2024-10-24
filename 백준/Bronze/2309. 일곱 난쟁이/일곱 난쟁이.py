import sys

n = list(int(sys.stdin.readline()) for i in range(9))

n.sort()

cal = sum(n) - 100
for i in range(len(n) - 1):
    for j in range(i+1, len(n)):
        if n[i] + n[j] == cal:
            del(n[i])
            del(n[j-1])
            break
    if sum(n) == 100:
        break

for i in range(len(n)):
    print(n[i])