import sys

input = sys.stdin.readline

arr = list(map(int, input().split()))

s = sum(arr)
l = len(arr)
bob = s / l

idx = arr.index(20)
if idx == (len(arr) - 1):
    alice = (arr[idx] + arr[0] + arr[idx - 1]) / 3
else:
    alice = (arr[idx] + arr[idx + 1] + arr[idx - 1]) / 3
    
if bob > alice:
    print('Bob')
elif bob < alice:
    print('Alice')
elif bob == alice:
    print('Tie')