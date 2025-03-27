class Solution {
    // Function to return Breadth First Traversal of given graph.
    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj, int start) {        
        // code here
        boolean vis[] = new boolean[V];//visisted array
         
        ArrayList < Integer > bfs = new ArrayList < > (); //result array list
        
        Queue < Integer > q = new LinkedList < > (); //queue to store

        //adding first node
        q.add(start);
        vis[start] = true;
heht
        while (!q.isEmpty()) {
            
            //take the element currently at queue's top
            Integer node = q.poll();
            
            //add this node to my BFS result
            bfs.add(node);

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (Integer it: adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        
        return bfs;

    }


}
