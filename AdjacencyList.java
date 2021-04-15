import java.util.ArrayList;
public class AdjacencyList {
    static ArrayList<ArrayList> _adjList;
    public static void main(String[] args) {
        _adjList = new ArrayList<>();
        int verts = 7;
        char[]vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        for (int i=0;i<verts;i++) {
            _adjList.add(new ArrayList<>());
        }
        _adjList.get(0).add("B");
        _adjList.get(1).add("A");
        _adjList.get(1).add("C");
        _adjList.get(2).add("B");
        _adjList.get(2).add("D");
        _adjList.get(2).add("E");
        _adjList.get(3).add("C");
        _adjList.get(3).add("E");
        _adjList.get(3).add("F");
        _adjList.get(3).add("G");
        _adjList.get(4).add("C");
        _adjList.get(4).add("D");
        _adjList.get(4).add("F");
        _adjList.get(5).add("E");
        _adjList.get(5).add("D");
        _adjList.get(6).add("D");
        displayList(verts, vertices);

    }   
    public static void displayList(int verts, char[] vertices) {
        int v = 0;
        for (int i = 0; i < verts; i++) {
            System.out.println(vertices[v] + " -> " + _adjList.get(i));
            v++;
        }
    }
}

