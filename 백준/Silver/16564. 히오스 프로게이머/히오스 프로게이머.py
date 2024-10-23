import sys

N, K = map(int, sys.stdin.readline().split())
a = [int(sys.stdin.readline()) for _ in range(N)]

def can_make_all_at_least(x):
    total_increase = 0
    for height in a:
        if height < x:
            total_increase += (x - height)
        if total_increase > K:  # K를 초과하면 더 이상 필요 없음
            return False
    return total_increase <= K

left, right = 0, max(a) + K  # 최댓값을 K만큼 더한 값까지 탐색
answer = 0

while left <= right:
    mid = (left + right) // 2
    if can_make_all_at_least(mid):
        answer = mid  # mid 높이로 모든 나무를 만들 수 있음
        left = mid + 1  # 더 높은 높이도 가능한지 확인
    else:
        right = mid - 1  # 높이를 낮춰야 함

print(answer)