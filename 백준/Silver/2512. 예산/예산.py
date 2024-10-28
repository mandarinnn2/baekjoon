import sys

# 지방 수, 예산 요청, 예산
N = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())

# 이분 탐색을 이용하여 예산의 최대치를 찾는다.
left = 0
right = max(arr)
result = 0

while left <= right:
    mid = (left + right) // 2
    total = sum(min(mid, a) for a in arr)

    if total <= M:
        result = mid  # 현재 mid가 가능하므로 결과를 업데이트
        left = mid + 1
    else:
        right = mid - 1

print(result)