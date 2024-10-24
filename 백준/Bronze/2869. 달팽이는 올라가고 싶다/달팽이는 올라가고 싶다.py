import sys
import math

# 아침+, 저녁-, 목표
A, B, V = map(int, sys.stdin.readline().split())

print(math.ceil((V - B) / (A - B)))