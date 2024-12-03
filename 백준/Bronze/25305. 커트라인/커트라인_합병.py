def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        mid = len(arr) // 2
        left = merge_sort(arr[:mid])
        right = merge_sort(arr[mid:])
        return merge(left, right)


def merge(left, right):
    i = j = 0
    result = []
    while i < len(left) and j < len(right):
        if left[i] > right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])

    return result

import sys
input = sys.stdin.readline

N, k = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
result = merge_sort(arr)

print(result[k-1])
