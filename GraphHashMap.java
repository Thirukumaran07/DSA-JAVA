import java.util.*;
class GraphhhMap{
    HashMap<Integer,List<Integer>> adj;
    public GraphhhMap(){
        adj = new HashMap<>();
    }
    public void addVertices(int vertex){
        adj.putIfAbsent(vertex,new ArrayList<>());
    }
    void addEdge(int src, int des){
        addVertices(src);
        addVertices(des);
        adj.get(src).add(des);
    }

    void printGraph(){
        for(int element : adj.keySet()){
            System.out.print(element+"->");
            for(int val:adj.get(element)){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}

public class GraphHashMap{
    public static void main(String[] args) {
        GraphhhMap g = new GraphhhMap();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 2);
        g.printGraph();
    }
}