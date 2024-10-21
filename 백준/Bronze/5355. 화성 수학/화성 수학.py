import sys
T = int(sys.stdin.readline())

for i in range(T):
    A = list(sys.stdin.readline().split())
    A[0] = float(A[0])
    for j in range(1, len(A)):
        if A[j].find("@") != -1:
            A[0] *= 3
        elif A[j].find("%") != -1:
            A[0] += 5
        elif A[j].find("#") != -1:
            A[0] -= 7
    print("{:.2f}".format(A[0]))