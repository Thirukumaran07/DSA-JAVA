import java.util.*;
class Graphhh{
    int vertices;
    List<List<Integer>> adj;
    public Graphhh(int v){
        vertices = v;
        adj = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int src, int des){
        adj.get(src).add(des);
    }

    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.print(i+"->");
            for(int element : adj.get(i)){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}

public class GraphList{
    public static void main(String[] args) {
        Graphhh g = new Graphhh(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 2);
        g.printGraph();
    }
}