import sys

input = sys.stdin.readline
N = int(input())
arr = [int(input()) for _ in range(N)]

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    return merge(left, right)

def merge(left, right):
    i = j = 0
    x = []
    while i < len(left) and j < len(right):
        if left[i] > right[j]:
            x.append(left[i])
            i += 1
        else:
            x.append(right[j])
            j += 1

    x.extend(left[i:])
    x.extend(right[j:])

    return x

result = merge_sort(arr)
[print(arr) for arr in result]