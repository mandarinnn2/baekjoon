import sys

N, M = map(int, sys.stdin.readline().split())
tree = list(map(int, sys.stdin.readline().split()))

def can_cut(height):
    total = 0
    for h in tree:
        if h > height:
            total += h - height
    return total >= M

left, right = 0, max(tree)
answer = 0

while left <= right:
    mid = (left + right) // 2
    if can_cut(mid):
        answer = mid  # mid 높이로 자를 수 있으면 저장
        left = mid + 1  # 더 높은 높이도 가능한지 확인
    else:
        right = mid - 1  # 높이를 낮춰야 함

print(answer)