import java.util.*;

class BFS {
    
    public static ArrayList<Integer> graph(int vertex, ArrayList <ArrayList <Integer>> adjacent) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[vertex];
        Queue<Integer> v = new LinkedList<>();

        v.add(0);
        visited[0] = true;

        while (!v.isEmpty()) {
            
            Integer node = v.poll();
            bfs.add(node);

            for (Integer it : adjacent.get(node)) {
                
                if (visited[it] == false) {
                    
                    visited[it] = true;
                    v.add(it);
                }
            }
        }

        return bfs;

    }

    static void printAns(ArrayList<Integer> list) {
        
        for (int i = 0; i < list.size(); i++) {
            
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(4);
        adj.get(4).add(7);
        adj.get(0).add(1);
        adj.get(1).add(3);
        adj.get(1).add(5);
        adj.get(5).add(6);
        adj.get(6).add(9);
        adj.get(9).add(8);

        ArrayList<Integer> ans = graph(10, adj);
        printAns(ans);

    }
}