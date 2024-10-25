import sys
import heapq

N = int(sys.stdin.readline())

max_heap = []
for i in range(N):
    x = int(sys.stdin.readline())
    if x == 0:
        if max_heap:
            print(-heapq.heappop(max_heap))
        else:
            print(0)
    else:
        heapq.heappush(max_heap, -x)