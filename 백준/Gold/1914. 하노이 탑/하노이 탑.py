import sys
def hanoi_tower(n, start, end):
    if n == 1:
        print(start, end)
        return

    hanoi_tower(n-1, start, 6-start-end) # 1단계
    print(start, end) # 2단계
    hanoi_tower(n-1, 6-start-end, end) # 3단계

n = int(sys.stdin.readline())
print(2**n-1) # 점화식을 사용 2 * T(n - 1) + 1
if n < 21:
    hanoi_tower(n, 1, 3)