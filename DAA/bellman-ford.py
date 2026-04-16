class Edge:
    def __init__(self, u, v, w):
        self.u, self.v, self.w = u, v, w
    
def bellman_ford(vertices, edges, source):
    dist = [float('inf')]*vertices
    dist[source] = 0
    
    for _ in range(vertices-1):
        for edge in edges:
            if dist[edge.u] != float('inf') and dist[edge.u] + edge.w < dist[edge.v]:
                dist[edge.v] = dist[edge.u] + edge.w
        
    for edge in edges:
        if dist[edge.u] != float('inf') and dist[edge.u] + edge.w < dist[edge.v]:
            print("Graph contains negative cycle")
            return None
    
    return dist

vertices = int(input("Enter number of vertices: "))
edges_count = int(input("Enter number of edges: "))

edges = []
for i in range(edges_count):
    u, v, w = map(int, input("Enter u, v, weight: "). split())
    edges.append(Edge(u-1, v-1, w))
    
source = int(input("Enter source vertex: "))-1
distances = bellman_ford(vertices, edges, source)

if distances:
    print("\nVertex\tDistance from Source")
    for i in range(vertices):
        if distances[i] == float('inf'):
            print(f"{i+1}\tINF")
        else:
            print(f"{i+1}\t{distances[i]}")
            
# input
# Enter number of vertices: 7
# Enter number of edges: 10
# Enter u, v, weight: 1 2 6
# Enter u, v, weight: 1 3 5
# Enter u, v, weight: 1 4 5
# Enter u, v, weight: 2 5 -1
# Enter u, v, weight: 3 2 -2
# Enter u, v, weight: 3 5 1
# Enter u, v, weight: 4 3 -2
# Enter u, v, weight: 4 6 -1
# Enter u, v, weight: 5 7 3
# Enter u, v, weight: 6 7 3
# Enter source vertex: 1