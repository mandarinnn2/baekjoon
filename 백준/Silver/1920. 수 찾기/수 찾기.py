import sys

N = int(sys.stdin.readline())

A = list(map(int, sys.stdin.readline().split()))

M = int(sys.stdin.readline())

B = list(map(int, sys.stdin.readline().split()))


# 이진 탐색 알고리즘 사용하기

A.sort()

for i in range(M):
    start = 0
    end = len(A) - 1

    x = 0

    while(start <= end):
        mid = (start + end) // 2
        if(B[i] == A[mid]):
            x = 1
            break
        elif(B[i] < A[mid]):
            end = mid - 1
            
        else:
            start = mid + 1
    print(x)