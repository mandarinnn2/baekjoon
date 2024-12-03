def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[-1]
        left = [x for x in arr[:-1] if x <= pivot]
        right = [x for x in arr[:-1] if x > pivot]
        return quick_sort(left) + [pivot] + quick_sort(right)

import sys
input = sys.stdin.readline

x = []
for i in range(5):
    x.append(int(input()))

result = quick_sort(x)
print(sum(result) // 5)
print(result[2])