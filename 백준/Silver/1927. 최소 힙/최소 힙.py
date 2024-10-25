import sys
import heapq

N = int(sys.stdin.readline())

min_heap = []
for i in range(N):
    x = int(sys.stdin.readline())
    if x == 0:
        if min_heap:
            print(heapq.heappop(min_heap))
        else:
            print(0)
    else:
        heapq.heappush(min_heap, x)