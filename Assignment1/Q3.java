import java.util.*;  
class Q3{ 
    class Edge{ 
        int src, dest, weight; 
        Edge() 
        { 
            src = 0;
            dest = 0;
            weight = 0; 
        } 
    };  
    int V, E; 
    Edge edge[]; 
    Q3(int v, int e) 
    { 
        V = v; 
        E = e; 
        edge = new Edge[e]; 
        for (int i = 0; i < e; ++i){ 
            edge[i] = new Edge(); 
        }
    }     
    void Sol(Q3 graph, int src) 
    { 
        int V = graph.V, E = graph.E; 
        int dist[] = new int[V]; 
        for (int i = 0; i < V; ++i) 
            {
                dist[i] = Integer.MAX_VALUE; 
            }
        dist[src] = 0; 
        for (int i = 1; i < V; ++i) 
        { 
            for (int j = 0; j < E; ++j) 
            { 
                int u = graph.edge[j].src; 
                int v = graph.edge[j].dest; 
                int weight = graph.edge[j].weight; 
                if (dist[u]!= Integer.MAX_VALUE && dist[u]+weight<dist[v])
                {
                    dist[v]=dist[u]+weight;
                }
            } 
        } 
        for (int j = 0; j < E; ++j) 
        { 
            int u = graph.edge[j].src; 
            int v = graph.edge[j].dest; 
            int weight = graph.edge[j].weight; 
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) 
            { 
                System.out.println("Negative cycles Exist"); 
                return; 
            } 
        } 
        System.out.println("Vertex Distance from Source"); 
        for (int i = 0; i < V; ++i){ 
            System.out.println(i + "\t\t" + dist[i]); 
        }
    }
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of vertices:");
        int V = sc.nextInt();
        System.out.println("Number of edges:");
        int E = sc.nextInt();  
        Q3 graph = new Q3(V, E); 
        System.out.println("Enter the source vertex, destination vertex and weight of each edge:");
        for(int i=0;i<E;i++)
        {
            graph.edge[i].src = sc.nextInt(); 
            graph.edge[i].dest = sc.nextInt(); 
            graph.edge[i].weight = sc.nextInt();
        }
        sc.close();
        graph.Sol(graph, 0); 
    } 
} 
