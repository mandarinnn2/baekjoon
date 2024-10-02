import sys

N, M, V = map(int, sys.stdin.readline().split())
# 각각 정점, 간선, 시작 점

# 행렬 만들기
graph = [[0]*(N+1) for _ in range(N+1)]

for i in range(M):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = graph[b][a] = 1

# 방문 리스트 행렬
visited1 = [0] * (N+1)
visited2 = visited1.copy()

# dfs함수 만들기
def dfs(V):
    visited1[V] = 1 # 방문처리
    print(V, end= ' ')
    for i in range(1, N+1):
        if graph[V][i] == 1 and visited1[i] == 0:
            dfs(i)

# bfs함수 만들기
def bfs(V):
    queue = [V]
    visited2[V] = 1 # 방문처리
    while queue:
        V = queue.pop(0)
        print(V, end = ' ')
        for i in range(1, N+1):
            if(graph[V][i] == 1 and visited2[i] == 0):
                queue.append(i)
                visited2[i] = 1 # 방문처리
dfs(V)
print()
bfs(V)